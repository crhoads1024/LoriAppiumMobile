package pages.iOS.mobileWeb;

import com.hyla.BaseTest;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.support.PageFactory;

public class iPhone_Home_Screen extends BaseTest {

    public iPhone_Home_Screen(IOSDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }

    @iOSXCUITFindBy(accessibility = "WebDriverAgentRunner-Runner")
    private MobileElement homeScreen;

    @iOSXCUITFindBy(accessibility = "Safari")
    private MobileElement safariApp;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name='URL']")
    private MobileElement urlTextBox;


    public safari_Splash_Page launchSafari() {
    //wait.until(ExpectedConditions.visibilityOf(homeScreen));
        try {
            System.out.println("Home Screen has been found.");
            System.out.println("Launching Safari from dock....");
            safariApp.click();
            System.out.println("Safari App Has Been Clicked.");
            //wait.until(ExpectedConditions.visibilityOf(urlTextBox));
        } catch (Exception e) {
            System.out.println("Launching Safari method failed.");
        }
        safari_Splash_Page ssp = new safari_Splash_Page(driver);
    return ssp;
    }

}
