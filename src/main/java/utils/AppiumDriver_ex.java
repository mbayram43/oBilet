package utils;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class AppiumDriver_ex {

    static AppiumDriver appiumDriver;
    public WebDriverWait wait;

    public static AppiumDriver getAppiumDriver() {
        AppiumDriver appiumDriver = null;
        WebDriverWait wait;
        try {

            DesiredCapabilities caps = new DesiredCapabilities();
            caps.setCapability("deviceName", "Android Emulator");
            caps.setCapability("udid", "emulator-5554"); //DeviceId from "adb devices" command
            caps.setCapability("platformName", "Android");
            caps.setCapability("appPackage", "com.obilet.androidside");
            caps.setCapability("appActivity", "com.obilet.androidside.presentation.screen.splash.activity.SplashScreen");
            caps.setCapability("noReset", "true");
            caps.setCapability("skipUnlock", "true");
            appiumDriver = new io.appium.java_client.AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
            wait = new WebDriverWait(appiumDriver, Duration.ofSeconds(10));
        } catch (MalformedURLException mx) {

            System.out.println("Hatali olusturulmus URL ");
        }

        return appiumDriver;
}




        }






