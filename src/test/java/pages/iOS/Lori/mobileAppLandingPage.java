package pages.iOS.Lori;

import com.hyla.BaseTest;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.support.PageFactory;
import pages.iOS.mobileWeb.safari_Splash_Page;

public class mobileAppLandingPage extends BaseTest {

    public mobileAppLandingPage(IOSDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"get_covered_button\"])[2]")
    private MobileElement getCoveredBtn;

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
