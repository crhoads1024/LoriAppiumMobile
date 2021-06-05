package pages.Android;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class pblUserCreatePage {

    private final AndroidDriver driver;



    public pblUserCreatePage(AndroidDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }




    // Landing Page Elements

    // SELECT ENVIRONMENT
    @AndroidFindBy(xpath ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.TextView")
    private MobileElement dropChevron;

    @AndroidFindBy(xpath = "\t\n" +
            "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.TextView")
    private MobileElement envLabel;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup")
    private MobileElement QA;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.widget.EditText[1]")
    private MobileElement first;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.widget.EditText[2]")
    private MobileElement last;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.widget.EditText[3]")
    private MobileElement email;

    @AndroidFindBy(xpath = "\t\n" +
            "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.widget.EditText[4]")
    private MobileElement programId;

    @AndroidFindBy(xpath = "\t\n" +
            "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.widget.EditText[5]")
    private MobileElement mobileNumber;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.widget.EditText[6]")
    private MobileElement zip;

   @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.TextView")
   private MobileElement getCoveredBtn;



    //Test Utils
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
    DateTimeFormatter trimmedDtf = DateTimeFormatter.ofPattern("yyyy_MM_dd_HH_mm_ss_ms");
    LocalDateTime now = LocalDateTime.now();
    String timeStamp = dtf.format(now);
    String trimmedTimeStamp = trimmedDtf.format(now);
    String qaAvib1 = "34";
    String qaAvib2 = "35";
    String stgAvib1 = "133";
    String stgAvib2 = "134";


    public updatePasswordPage embeddedAppCreateUser(){

        envLabel.isDisplayed();
        dropChevron.click();
        QA.click();
        first.sendKeys("Appium User Created In Test Environment " + envLabel.getText());
        last.sendKeys("On " + timeStamp );
        email.sendKeys("crhoads1024+" + trimmedTimeStamp  +"@gmail.com");
        programId.sendKeys(qaAvib1);
        mobileNumber.sendKeys("8476301359");
        zip.sendKeys("60555");
        getCoveredBtn.click();
        System.out.println("Get Covered Button On Embedded App Has Been Found AND CLICKED...");
       // wait.until(ExpectedConditions.invisibilityOf(zip));
       // System.out.println("Zip Code Text Box Has Disappeared, Create Password Page Is Loading...");

        updatePasswordPage updatePasswordPage = new updatePasswordPage(driver);
        return updatePasswordPage;
    }



}
