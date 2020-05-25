package com.example.simnumber

import android.Manifest
import android.content.Context
import android.content.pm.PackageManager
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.telephony.SubscriptionManager
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.text_view.view.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        checkPermission()
    }

    private fun checkPermission() {
        if (Build.VERSION.SDK_INT > Build.VERSION_CODES.LOLLIPOP_MR1) {
               if (checkSelfPermission(Manifest.permission.READ_PHONE_STATE) == PackageManager.PERMISSION_GRANTED) {
                   get_sim_number?.setOnClickListener { getSimNumber() }
               } else requestPermissions(arrayOf(Manifest.permission.READ_PHONE_STATE), PERMISSIONS)
        } else get_sim_number?.setOnClickListener { getSimNumber() }
    }

    override fun onRequestPermissionsResult(requestCode: Int, permissions: Array<out String>, grantResults: IntArray) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        if (requestCode == PERMISSIONS) {
            permissions.forEachIndexed() { i, d ->
                if (d == Manifest.permission.READ_PHONE_STATE && grantResults[i] == PackageManager.PERMISSION_GRANTED) {
                    get_sim_number?.setOnClickListener { getSimNumber() }
                }
            }
        }
    }

    private fun getSimNumber() {
        val sm = getSystemService(Context.TELEPHONY_SUBSCRIPTION_SERVICE) as? SubscriptionManager
        val list = sm?.activeSubscriptionInfoList
        sim_number_text?.removeAllViews()
        list?.forEach {
            sim_number_text?.addView(getTextView("iccId - ${it.iccId}"))
            sim_number_text?.addView(getTextView("countryIso - ${it.countryIso}"))
            sim_number_text?.addView(getTextView("mccString - ${it.mccString}"))
            sim_number_text?.addView(getTextView("mncString - ${it.mncString}"))
            sim_number_text?.addView(getTextView("number - ${it.number}"))
            sim_number_text?.addView(getTextView("cardId - ${it.cardId}"))
            sim_number_text?.addView(getTextView("countryIso - ${it.countryIso}"))
            Log.e("iccId -", it.iccId)
        }
    }

    private fun getTextView(text: String): View {
        val view = LayoutInflater.from(this).inflate(R.layout.text_view, sim_number_text, false)
        view?.text_view?.text = text
        return view
    }

    companion object {
        const val PERMISSIONS = 101
    }
}
