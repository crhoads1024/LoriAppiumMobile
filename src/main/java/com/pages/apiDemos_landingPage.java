package com.pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class apiDemos_landingPage {
    // https://github.com/appium/appium/tree/master/sample-code/java
    private final AndroidDriver driver;

    public apiDemos_landingPage(AndroidDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }


    // Landing Page Elements
    @AndroidFindBy(className = "android.widget.TextView")
    private MobileElement title;

}
