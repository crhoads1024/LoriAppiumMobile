package com.hyla;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.net.URL;

public abstract class BaseTest {

        protected IOSDriver driver;
        //protected AndroidDriver driver;
        private static AppiumDriverLocalService service;
        public static WebDriverWait wait = null;

        @BeforeClass
        public static void globalSetup () throws IOException {
            service = AppiumDriverLocalService.buildDefaultService();
            service.start();
        }

        @AfterClass
        public static void globalTearDown () {
            if (service != null) {
                service.stop();
            }
        }

        public static URL getServiceUrl() {
            return service.getUrl();
        }

    }

