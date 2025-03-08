# CyberHelp Button 🚨  

CyberHelp Button is an AI-powered emergency response app that detects AI-generated voice impersonation and deepfake-related issues. It also acts as an SOS button, allowing users in India to quickly contact emergency services with a single long-press function.  

---

## 📂 Project Structure & Important Files  

### 1️⃣ **Main App Logic**  
- **`app/src/main/java/com/example/sosbutton/MainActivity.kt`**  
  - Contains the main UI logic and handles user interactions.  
- **`app/src/main/java/com/example/sosbutton/SOSService.kt`**  
  - Manages the background service for detecting long-press on the SOS button.  

# 2️⃣ **UI & Layouts**  
- **`app/src/main/res/layout/activity_main.xml`**  
  - Defines the UI layout for the main screen.  
- **`app/src/main/res/values/strings.xml`**  
  - Contains all the text strings used in the app.  

#3️⃣ **Configuration & Dependencies**  
- **`build.gradle.kts`**  
  - Contains project dependencies and configurations.  
- **`gradle.properties`**  
  - Defines important Gradle settings.  

---
## DEEPFAKE
- **`DEEPFAKE DETECTION/index.html`**
- contains the deepfake voice detection
- upon replacing the API_KEY  and API_URL with the API key and endpoint, you can perform AI     Detection
- It also consists of  Speech-to-transcription


## 🚀 Features  
- **AI Voice Recognition (Deepfake Detection using Deepware API)**  
- **One-Press SOS Button (Emergency Contact: 6281847630)**  
- **User-Friendly Interface**  

---

## 🔧 Installation Instructions  
1. Clone this repository:  
   ```sh
   git clone https://github.com/Lasya1905/CyberHelp-Button.git
