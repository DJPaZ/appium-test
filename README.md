# Appium-test
A sample Android project based on Gradle, and a simple Java test case for UI Automation via [ Appium ](http://appium.io/)

## How to Install Appium (on Linux)
    brew install node      # get node.js
    npm install -g appium  # get appium
    npm install wd         # get appium client
    appium &               # start appium
    
Enter the following URL on your browser to check the Appium Status

    http://localhost:4723/wd/hub/status
    
## Other Prerequisites

1) Java Installed and $JAVA_HOME set 

2) Android SDK with $ANDROID_HOME set

3) Gradle Installed with $GRADLE_HOME set
    
## How to Start the Automation Test

1) Make Sure Appium is running
    
2) Build The Android Project

    $ AppiumTestAndroidProject
    $ gradle build
    
The APK used for Automation Test will be built in the following location

    AppiumTestAndroidProject/app/build/outputs/apk/app-debug.apk
    
3) Start the Android Emulator (Works even on Genymotion)    
    
4) Run the Maven Test Case
    
    mvn test
    
## Expected Output    

> Test APK will be installed on the Android Emulator and automatically started. 

> 'Hello World' will be input on the EditText field
