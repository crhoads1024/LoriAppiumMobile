package pages.iOS.mobileWeb;

import com.hyla.BaseTest;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class safari_User_Landing_Page extends BaseTest {

    public safari_User_Landing_Page(IOSDriver iosDriver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }
}
