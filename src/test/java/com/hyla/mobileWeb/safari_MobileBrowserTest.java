package com.hyla.mobileWeb;

import com.hyla.BaseTest;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import pages.iOS.mobileWeb.iPhone_Home_Screen;
import pages.iOS.mobileWeb.safari_Splash_Page;

public class safari_MobileBrowserTest extends BaseTest {

    // MUST BE COMMENTED OUT IN ORDER TO LAUNCH THE MOBILE APP TESTS

    // private static AndroidDriver<WebElement> driver;
    // private static AndroidDriver<WebElement> driver;
    private static IOSDriver<WebElement> driver;

    iPhone_Home_Screen home_screen = new iPhone_Home_Screen(driver);
    safari_Splash_Page ssp = new safari_Splash_Page(driver);

    @BeforeClass
    public static void setUp(){
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCUITest");
        //caps.setCapability(MobileCapabilityType.BROWSER_NAME, "Safari");
        //caps.setCapability("chromedriverExecutable", "/Users/CRhoads/IdeaProjects/helloLori/mobileB2BwebTest/src/main/resources/drivers/chromedriver_86.0.4240");
        //caps.setCapability(MobileCapabilityType.UDID, "F63BF852-8C70-4D9D-879F-E4E5DF803676");
        caps.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 6s");
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOS");
        driver = new IOSDriver<WebElement>(getServiceUrl(), caps);
    }

   @AfterClass
   public static void tearDown() {
        driver.quit();
    }

//   @Test()
//    public void testCreateWebSession() throws URISyntaxException {
//        driver.get(new URI(qaEndpoint).toString());
//        String title = driver.getTitle();
//        Assert.assertEquals(title, "Lori: Smart(er) Phone Protection");
//        System.out.println("Title '" + title + "' was found successfully!");
//    }

    @Test
    public void iOS_Test_0001_Login_User(){
    home_screen.launchSafari();
    ssp.navigateToEndPoint();



    }

}
