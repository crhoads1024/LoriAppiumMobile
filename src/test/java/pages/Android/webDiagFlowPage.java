package pages.Android;

import com.hyla.BaseTest;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class webDiagFlowPage extends BaseTest {
    private final AndroidDriver driver;


    public webDiagFlowPage(AndroidDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }


    @AndroidFindBy(className = "android.app.Dialog")
    private MobileElement chooseBrowserDialog;

    @AndroidFindBy(xpath = "//*[contains(.,'Okay')]")
    private MobileElement okayButton;

    @AndroidFindBy(xpath = "//*[contains(.,'Get Chrome App')]")
    private MobileElement getChromeAppButton;

    @AndroidFindBy(xpath = "//*[contains(.,'Next')]")
    private MobileElement nextButton;

    @AndroidFindBy(xpath = "//*[contains(.,'android:id/icon')]")
    private MobileElement openWithChromeButton;

    @AndroidFindBy(xpath = "android:id/button_always")
    private MobileElement getOpenWithChromeButton_ALWAYS;

    @AndroidFindBy(id = "com.android.chrome:id/url_bar")
    private MobileElement urlBar;

    @AndroidFindBy(id = "identify_button")
    private MobileElement identifyDevice;

    @AndroidFindBy(id = "OK")
    private MobileElement acknowledgeProfileDownload_OK_BUTTON;

    @AndroidFindBy(xpath = "//*[contains(.,'Open')")
    private MobileElement playStore_OpenHylaProfileDownload;

    @AndroidFindBy(xpath = "//*[contains(.,'ALLOW']")
    private MobileElement allowBtn;

    @AndroidFindBy(xpath = "//*[contains(.,'I'm Ready']")
    private MobileElement imReadyBtn;

    @AndroidFindBy(xpath = "//*[contains(.,'Start']")
    private MobileElement startDiagTestBtn;

    @AndroidFindBy(xpath = "//*[contains(.,'Allow']")
    private MobileElement allowCameraBtn;

    @AndroidFindBy(id = "fcamera_inst1")
    private MobileElement frontCamTestText;

    @AndroidFindBy(id = "rcamera_inst1")
    private MobileElement rearCamTestText;

    @AndroidFindBy(xpath = "//*[contains(.,'Submit Results')]")
    private MobileElement submitResultsBtn;

    @AndroidFindBy(xpath = "//*[contains(.,'Your Device Information')]")
    private MobileElement deviceInfoHeader;

    @AndroidFindBy(xpath = "//*[contains(.,'Google Emulator')]")
    private MobileElement deviceLabel;

    @AndroidFindBy(id = "deviceColor")
    private MobileElement deviceColorEntry;

    @AndroidFindBy(xpath = "//*[contains(.,'Confirm Your Device')]")
    private MobileElement confirmYourDevice;


    public void userDiagFlow(){
       // wait.until(ExpectedConditions.visibilityOf(chooseBrowserDialog));
   // wait.until(ExpectedConditions.visibilityOf(okayButton));
    okayButton.click();
    }
}
