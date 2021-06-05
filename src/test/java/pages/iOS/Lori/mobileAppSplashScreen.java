package pages.iOS.Lori;

import com.hyla.BaseTest;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.support.PageFactory;
import pages.iOS.mobileWeb.safari_Splash_Page;

public class mobileAppConvoScreen extends BaseTest {

    public mobileAppConvoScreen(IOSDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }

    @iOSXCUITFindBy(accessibility = "WebDriverAgentRunner-Runner")
    private MobileElement homeScreen;


    public safari_Splash_Page launchLoriApp() {
        //wait.until(ExpectedConditions.visibilityOf(homeScreen));
        try {
            System.out.println("Home Screen has been found.");
            System.out.println("Launching Lori Mobile App....");
            loriApp.click();
            System.out.println("Lori Mobile App Has Been Clicked.");
            //wait.until(ExpectedConditions.visibilityOf(urlTextBox));
        } catch (Exception e) {
            System.out.println("Launching Lori Mobile method failed.");
        }
        safari_Splash_Page ssp = new safari_Splash_Page(driver);
        return ssp;
    }
}
