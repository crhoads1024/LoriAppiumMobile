package com.hyla.mobileWeb;

import com.hyla.BaseTest;

/**
 * Created by chrisrhoads on 12/04/2020.
 */

public class androidMobileAppTest extends BaseTest {
   // private static AndroidDriver<WebElement> driver;


//    protected static pblUserCreatePage userCreatePage;
//    protected static pages.Android.updatePasswordPage updatePasswordPage;
  //  protected static webDiagFlowPage webDiagFlowPage;



//    public static void androidAppLaunch() throws MalformedURLException {
//        File app = new File(System.getProperty("user.dir") + "//src//main//resources//android//app-release.apk");
//        DesiredCapabilities caps = new DesiredCapabilities();
//        caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel 2 API 27");
//        caps.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
//        caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.1");
//        caps.setCapability(MobileCapabilityType.PLATFORM_NAME,"android");
//        caps.setCapability("autoAcceptAlerts", true);
//        caps.setCapability("fullReset", "true");
//        // App Caps for app-release.apk - Shawns Embedded Browser Launch App
//        caps.setCapability("appPackage", "com.pblembeddedapp");
//        caps.setCapability("appActivity", "com.pblembeddedapp.MainActivity");
//        //App Caps for ApiDemos-debug.apk App from Appium Github Repo for learning Appium behaviors
//        //caps.setCapability("appPackage", "io.appium.android.apis");
//        //caps.setCapability("appActivity", "io.appium.android.apis.ApiDemos");
//        System.out.println("Desired capabilities have now been set for Android emulator.");
//        System.out.println("Instantiating new instance of AndroidDriver as 'driver'.");
//        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
//        wait = new WebDriverWait(driver, 16);
//
//        userCreatePage = new pblUserCreatePage(driver);
//
//    }



//    @BeforeClass
//
//
//
//    public static void androidAppLaunch() throws MalformedURLException {
//      File app = new File(System.getProperty("user.dir") + "//src//main//resources//android//app-release.apk");
//        //File mappedAppVol = new File("/root/tmp/app-release.apk"); //points to a docker container volume mapping
//        DesiredCapabilities caps = new DesiredCapabilities();
//        caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
//        caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel 2 API 27");
//        caps.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
//        caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.1");
//        caps.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
//        caps.setCapability("autoAcceptAlerts", true);
//        caps.setCapability("fullReset", "true");
//        // App Caps for app-release.apk - Shawns Embedded Browser Launch App
//        caps.setCapability("appPackage", "com.pblembeddedapp");
//        caps.setCapability("appActivity", "com.pblembeddedapp.MainActivity");
//        //App Caps for ApiDemos-debug.apk App from Appium Github Repo for learning Appium behaviors
//        //caps.setCapability("appPackage", "io.appium.android.apis");
//        //caps.setCapability("appActivity", "io.appium.android.apis.ApiDemos");
//        System.out.println("Desired capabilities have now been set for Android emulator.");
//        System.out.println("Instantiating new instance of AndroidDriver as 'driver'.");
//        driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), caps);
//
//        wait = new WebDriverWait(driver, 16);
//
//
//        //**********Instantiate the pages here so they will be available for the rest of the test
//        // otherwise it will NullPointer as it will not have the driver passed to it
//        // that was just instantiated above with driver = new IOSDriver
//
//        userCreatePage = new pblUserCreatePage(driver);
//        updatePasswordPage = new updatePasswordPage(driver);
//        webDiagFlowPage = new webDiagFlowPage(driver);
//
//    }
//
//    @Test()
//    public void _01_testAndroidEmbeddedAPKLaunch() throws URISyntaxException {
//        userCreatePage.embeddedAppCreateUser();
//        updatePasswordPage.updatePassword();
//    }
   // @Test()
//    public void _02_userDiagnostic(){
//        webDiagFlowPage.userDiagFlow();
//    }
}

//    docker run --privileged -d \
//        -p 6080:6080 \
//        -p 4723:4723 \
//        -p 5554:5554 \
//        -p 5555:5555 \
//        -v $(PWD)/home/IdeaProjects/helloLori/mobileB2BwebTest/src/main/resources/android/app-release.apk:/root/tmp/app-release.apk \
//        -e DEVICE="Nexus 5" \
//        -e APPIUM=true \
//        -e CONNECT_TO_GRID=true \
//        -e APPIUM_HOST="127.0.0.1" \
//        -e APPIUM_PORT=4723 \
//        -e SELENIUM_HOST="172.17.0.1" \
//        -e SELENIUM_PORT=4444 \
//        --name android-container \
//        budtmo/docker-android-x86-8.1