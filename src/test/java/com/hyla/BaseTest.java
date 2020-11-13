package com.hyla;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import org.junit.After;
import org.junit.Before;
import java.io.IOException;
import java.net.URL;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

    public abstract class BaseTest {
        protected              AndroidDriver driver;
        protected static       WebDriverWait wait = null;
        private static AppiumDriverLocalService service;


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

