package com.djpaz.appium.test.java;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

import java.io.File;
import java.net.URL;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

public class AppTest {

    private AppiumDriver driver;

    @BeforeTest
    public void setUp() throws Exception {
        File classpathRoot = new File(System.getProperty("user.dir"));
        File appDir = new File(classpathRoot, "../AppiumTestAndroidProject/app/build/outputs/apk");
        File app = new File(appDir, "app-debug.apk");
        DesiredCapabilities capabilities = new DesiredCapabilities();
        //set the device name used by the AVD (Even Genymotion Device name works)
        capabilities.setCapability("deviceName","Genymotion Google Nexus 4 - 4.4.2 - API 19 - 768x1280 Android 4.4.2 (API 19)");
        capabilities.setCapability("platformVersion", "4.4.2");
        capabilities.setCapability("app", app.getAbsolutePath());
        capabilities.setCapability("appPackage", "test.appium.djpaz.com.appiumtest");
        capabilities.setCapability("appActivity", ".MainActivity");
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
    }

    @AfterTest
    public void tearDown() throws Exception {
        driver.quit();
    }

    @Test
    public void apiDemo() throws InterruptedException{
        WebElement el = driver.findElementByClassName("android.widget.EditText");
        el.sendKeys("Hello World!!");
        Thread.sleep(5000);
    }
}
