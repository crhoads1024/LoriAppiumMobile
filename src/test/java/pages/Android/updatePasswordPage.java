package pages.Android;

import com.hyla.BaseTest;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class updatePasswordPage extends BaseTest {

    private final AndroidDriver driver;


    public updatePasswordPage(AndroidDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }


    // These seem to need to have the FULL XPATH. I have tried xpath using contains(.,'Text That Is Visible In The App') and it will not locate
    // I tried with just "id" and that will not locate...
    // I think full xpath must be used as so far thats the only method that I have seen working so far.
    // Will try tomorrow.
    // Signing off 11:22PM 4/4/21
    @AndroidFindBy(id = "password")
    private MobileElement newPassword;

    @AndroidFindBy(id = "confirmPassword")
    private MobileElement confirmPass;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[1]/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.widget.Button")
    private MobileElement registerButton;

    @AndroidFindBy(xpath = "//[contains(.,'Close')]")
    private MobileElement closeBtn;

// LEFT OFF 2/05/2021 @ 6:20PM
// All locators for onboard from update password page all the way to post diag handoff to Web Login Screen

    public void tabToNewPassword(){
      //  driver.pressKeyCode(AndroidKeyCode.SPACE, AndroidKeyMetastate.META_SHIFT_ON);


    }

    public void setNewPassword(){
        wait.until(ExpectedConditions.visibilityOf(newPassword));
        newPassword.sendKeys("Test123@");
    }

    public void setConfirmPass(){
        newPassword.sendKeys("Test123@");
    }

    public void clickRegisterButton(){
        registerButton.click();
    }


    public void updatePassword(){

        System.out.println("Close Button On Create Password Page Has Been Found.");

        setNewPassword();
        System.out.println("New Password Entered.");

        setConfirmPass();
        System.out.println("Confirm Password Entered.");

        clickRegisterButton();
    }
}
