# 📱 SimInfo
**Android SIM Card Information & Network Analyzer**

<div align="center">
  <img src="https://img.shields.io/badge/Kotlin-0095D5?style=for-the-badge&logo=kotlin&logoColor=white" alt="Kotlin"/>
  <img src="https://img.shields.io/badge/Android-3DDC84?style=for-the-badge&logo=android&logoColor=white" alt="Android"/>
  <img src="https://img.shields.io/badge/Telecom-FF6B6B?style=for-the-badge" alt="Telecom"/>
  <img src="https://img.shields.io/badge/SIM-4285F4?style=for-the-badge" alt="SIM"/>
</div>

## 📡 Overview
SimInfo is a comprehensive Android utility app that provides detailed information about SIM cards, network connectivity, and carrier services. Perfect for telecommunications professionals, Android developers, and tech enthusiasts who need deep insights into mobile network configurations.

## ✨ Key Features

### 📋 **SIM Card Details**
- 📱 **Carrier Information** - Network operator name, country, and MCC/MNC codes
- 🔢 **SIM Identifiers** - ICCID, IMSI, and SIM serial numbers
- 🌍 **Country Detection** - Automatic country identification from SIM data
- 📶 **Subscription Status** - Active/inactive SIM state monitoring

### 📡 **Network Analysis**
- 🏢 **Cell Tower Info** - LAC, CID, and cell tower identification
- 📊 **Signal Strength** - Real-time signal quality measurements (dBm, ASU)
- 🌐 **Network Type** - 2G/3G/4G/5G technology detection
- 🔄 **Connection Status** - Data connectivity and roaming status

### 🔧 **Technical Information**
- 🏷️ **Device Identifiers** - IMEI, Android ID, and build information
- 📞 **Phone Numbers** - SIM-associated phone numbers (if available)
- 🔐 **Security Status** - SIM lock status and PIN requirements
- 📱 **Dual SIM Support** - Information for multiple SIM cards

### 📊 **Advanced Features**
- 📈 **Signal History** - Track signal strength over time
- 🗺️ **Location Services** - GPS coordinates and cell-based location
- 📋 **Export Data** - Save information to CSV or share via email
- 🔔 **Monitoring Alerts** - Notifications for signal changes

## 🛠️ Technology Stack

### **Core Android APIs**
- **[TelephonyManager](https://developer.android.com/reference/android/telephony/TelephonyManager)** - Primary SIM and network access
- **[SubscriptionManager](https://developer.android.com/reference/android/telephony/SubscriptionManager)** - Multi-SIM support
- **[CellInfo](https://developer.android.com/reference/android/telephony/CellInfo)** - Detailed cell tower information
- **[SignalStrength](https://developer.android.com/reference/android/telephony/SignalStrength)** - Network quality metrics

### **Development Framework**
- **[Kotlin](https://kotlinlang.org/)** - Modern Android development language
- **[Android SDK](https://developer.android.com/)** - Platform APIs and components
- **[Material Components](https://material.io/develop/android)** - Google's design system

### **Architecture & Libraries**
- **[MVVM Pattern](https://developer.android.com/topic/libraries/architecture/viewmodel)** - Clean architecture implementation
- **[LiveData](https://developer.android.com/topic/libraries/architecture/livedata)** - Reactive data observation
- **[Room Database](https://developer.android.com/training/data-storage/room)** - Local data persistence
- **[Work Manager](https://developer.android.com/topic/libraries/architecture/workmanager)** - Background monitoring

## 🏗️ App Architecture

```
📱 SimInfo App/
├── 🎨 UI Layer
│   ├── MainActivity (Primary dashboard)
│   ├── Fragments (SIM Details, Network Info, History)
│   ├── Adapters (SIM List, Signal History)
│   └── Custom Views (SignalMeter, NetworkStatus)
│
├── 🧠 Business Logic
│   ├── SimInfoViewModel (SIM data management)
│   ├── NetworkViewModel (Connectivity monitoring)
│   └── HistoryViewModel (Signal tracking)
│
├── 📊 Data Layer
│   ├── SimInfoRepository (Data access layer)
│   ├── NetworkMonitor (Real-time monitoring)
│   └── Database (Historical data storage)
│
├── 🔧 Services
│   ├── TelephonyService (SIM/Network access)
│   ├── LocationService (GPS integration)
│   └── MonitoringService (Background updates)
│
└── 🛠️ Utils
    ├── PermissionUtils (Runtime permissions)
    ├── CarrierUtils (Operator identification)
    └── ExportUtils (Data export functionality)
```

## 🚀 Getting Started

### **Prerequisites**
- **Android Studio** 4.0 or higher
- **Android SDK** 23 or higher (API Level 23+)
- **Physical Device** required (emulators don't have real SIM cards)
- **Phone State Permission** for accessing SIM information

### **Installation**
```bash
# 1. Clone the repository
git clone https://github.com/tech1ee/SimInfo.git

# 2. Open in Android Studio
cd SimInfo
# File → Open → Select project folder

# 3. Grant necessary permissions
# The app will request phone state and location permissions

# 4. Build and install
./gradlew installDebug
```

### **Required Permissions**
```xml
<!-- Essential for SIM information -->
<uses-permission android:name="android.permission.READ_PHONE_STATE" />
<uses-permission android:name="android.permission.ACCESS_COARSE_LOCATION" />
<uses-permission android:name="android.permission.ACCESS_FINE_LOCATION" />

<!-- Optional for enhanced features -->
<uses-permission android:name="android.permission.READ_SMS" />
<uses-permission android:name="android.permission.CALL_PHONE" />
```

## 📱 Features Deep Dive

### **SIM Information Display**
```kotlin
// Key information extracted and displayed:
- Carrier Name: "Beeline Kazakhstan"
- Country Code: KZ (Kazakhstan)
- MCC/MNC: 401/01
- ICCID: 89******** (masked for security)
- Network Type: LTE (4G)
- Signal Strength: -75 dBm (Good)
- Roaming Status: Home Network
```

### **Multi-SIM Support**
- 📱 **Dual SIM Detection** - Automatic detection of multiple SIM slots
- 🔄 **Active SIM Switching** - Monitor which SIM is currently active
- 📊 **Comparative Analysis** - Side-by-side comparison of SIM performance
- 🎯 **Default SIM Settings** - Display system default preferences

### **Network Monitoring**
- 📶 **Real-time Updates** - Continuous signal strength monitoring
- 🏢 **Cell Tower Tracking** - LAC and CID information
- 📈 **Historical Charts** - Signal strength over time visualization
- 🚨 **Alert System** - Notifications for network changes

## 🎯 Professional Context

### **Telecommunications Expertise**
This app demonstrates deep understanding of:
- 📡 **Cellular Network Protocols** - GSM, UMTS, LTE knowledge
- 🏢 **Telecom Infrastructure** - Cell tower and network architecture
- 📱 **Mobile Platform APIs** - Android telephony framework mastery
- 🔐 **Security Considerations** - Sensitive data handling

### **Industry Applications**
- 🔧 **Network Troubleshooting** - Technical support and diagnostics
- 📊 **Coverage Analysis** - Signal quality assessment
- 🏢 **Enterprise Deployment** - Corporate device management
- 🧪 **Testing & QA** - Mobile app network testing

### **Technical Skills Demonstrated**
- ✅ **Low-level Android APIs** usage and expertise
- ✅ **Complex Permission Handling** for sensitive operations
- ✅ **Real-time Data Processing** and visualization
- ✅ **Multi-device Compatibility** across Android versions
- ✅ **Performance Optimization** for continuous monitoring

## 🔮 Advanced Features

### **Data Export & Sharing**
```kotlin
// Export formats supported:
- CSV: For spreadsheet analysis
- JSON: For API integration
- Email Reports: Formatted summaries
- System Logs: Technical debugging
```

### **Professional Tools**
- 🔍 **Network Diagnostics** - Comprehensive connectivity analysis
- 📊 **Performance Metrics** - Throughput and latency measurements
- 🗺️ **Coverage Mapping** - Geographic signal strength visualization
- 📈 **Trend Analysis** - Network performance over time

## 🤝 Professional Applications

This project showcases expertise particularly valuable for:

### **Telecommunications Industry**
- 📱 **Mobile Operator** technical roles
- 🔧 **Network Engineering** positions
- 📊 **Quality Assurance** in telecom
- 🏢 **Enterprise Mobility** management

### **Android Development**
- 🧠 **Deep Platform Knowledge** - Advanced Android APIs
- 🔐 **Security-Conscious Development** - Sensitive data handling
- 📱 **Hardware Integration** - Direct device API usage
- ⚡ **Performance Optimization** - Efficient real-time monitoring

## 📧 Contact & Opportunities

**Leveraging telecom industry experience for mobile development excellence.**

📧 **Email:** t3ch1ee@gmail.com  
💼 **Portfolio:** [github.com/tech1ee](https://github.com/tech1ee)  
🌍 **Open to Telecom & Mobile Development Opportunities**

**Particularly interested in:**
- 📡 Mobile Network Optimization projects
- 🏢 Enterprise Android Development roles
- 🔧 IoT and Connected Device platforms
- 📱 Telecommunications software solutions

---

<div align="center">

**⭐ Star this repository if you're working in telecom or found the SIM analysis useful! ⭐**

*Bridging telecommunications expertise with modern Android development.* 📡

</div>