package com.hyla;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

public class mobileAppTest extends BaseTest {
    private static AndroidDriver<WebElement> driver;
  //  private static String androidAppUnderTest;

    @BeforeClass
    public static void androidAppLaunch() throws MalformedURLException {
        File app = new File(System.getProperty("user.dir") + "//src//main//resources//android//app-release.apk");
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel 2 API 27");
        caps.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
        caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.1");
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME,"android");
        caps.setCapability("autoAcceptAlerts", true);
        caps.setCapability("fullReset", "true");

        // App Caps for app-release.apk - Shawns Embedded Browser Launch App
        caps.setCapability("appPackage", "com.pblembeddedapp");
        caps.setCapability("appActivity", "com.pblembeddedapp.MainActivity");

        //App Caps for ApiDemos-debug.apk App from Appium Github Repo for learning Appium behaviors
        //caps.setCapability("appPackage", "io.appium.android.apis");
        //caps.setCapability("appActivity", "io.appium.android.apis.ApiDemos");

        System.out.println("Desired capabilities have now been set for Android emulator.");


        System.out.println("Instantiating new instance of AndroidDriver as 'driver'.");
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
        wait = new WebDriverWait(driver, 16);
    }

    @Test()
    public void testAndroidApiDemoAPKLaunch() throws URISyntaxException {
//        driver.get(new URI(qaEndpoint).toString());
        String title = driver.getTitle();
        Assert.assertEquals(title, "Lori: Smart(er) Phone Protection");
    }
}
