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

    @BeforeClass
    public static void appLaunch() throws MalformedURLException {
        File app = new File(System.getProperty("user.dir") + "//src//main//resources//android//ApiDemos-debug.apk");
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel 2 API 27");
        caps.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
        caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10");
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME,"android");
        caps.setCapability("autoAcceptAlerts", true);
        caps.setCapability("appPackage", "io.appium.android.apis");
        caps.setCapability("appActivity", "io.appium.android.apis.ApiDemos");
        caps.setCapability("fullReset", "true");
        System.out.println("Desired capabilities have now been set for Android emulator.");


        System.out.println("Instantiating new instance of AndroidDriver as 'driver'.");
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);

    }

    @Test()
    public void testAndroidApiDemoAPKLaunch() throws URISyntaxException {
//        driver.get(new URI(qaEndpoint).toString());
        String title = driver.getTitle();
        Assert.assertEquals(title, "Lori: Smart(er) Phone Protection");
    }
}
