package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class createPasswordPage {

    private final AndroidDriver driver;


    public createPasswordPage(AndroidDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }

    @AndroidFindBy(xpath = "New Password")
    private MobileElement newPassword;

    @AndroidFindBy(xpath = "Confirm Password")
    private MobileElement confirmPass;

    @AndroidFindBy(xpath = "//[contains(.,'Register')]")
    private MobileElement registerButton;

    public void setNewPassword(){
        newPassword.sendKeys("Test123@");
    }

    public void setConfirmPass(){
        newPassword.sendKeys("Test123@");
    }

    public void clickRegisterButton(){
        registerButton.click();
    }
}
