package com.hyla;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URI;
import java.net.URISyntaxException;

public class mobileBrowserTest extends BaseTest {
    private static AndroidDriver<WebElement> driver;
    private String qaEndpoint = "https://hyla.qa.hellolori.com/";
    private String stgEndpoint = "https://hyla.staging.hellolori.com/";

    @BeforeClass
    public static void setUp(){
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
        caps.setCapability("chromedriverExecutable", "/Users/CRhoads/IdeaProjects/helloLori/mobileB2BwebTest/src/main/resources/drivers/chromedriver_86.0.4240");
        //caps.setCapability("chromedriverExecutableDir", "//mobileB2BwebTest//src//main//java//resources//drivers");
        //caps.setCapability("chromedriverChromeMappingFile", "//mobileB2BwebTest//src//main//java//resources//drivers//chromedriverMapping.json");
        caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel 2 API 27");
        driver = new AndroidDriver<WebElement>(getServiceUrl(), caps);
    }

    @AfterClass
    public static void tearDown() {
        driver.quit();
    }

    @Test()
    public void testCreateWebSession() throws URISyntaxException {
        driver.get(new URI(qaEndpoint).toString());
        String title = driver.getTitle();
        Assert.assertEquals(title, "Lori: Smart(er) Phone Protection");
    }

}
