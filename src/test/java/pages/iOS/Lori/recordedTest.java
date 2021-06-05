package pages.iOS.Lori;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.ios.IOSDriver;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;

public class recordedTest {

    private IOSDriver driver;
    private Object x;

    @Before
    public void setUp() throws MalformedURLException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("automationName", "XCUITest");
        desiredCapabilities.setCapability("platformName", "iOS");
        desiredCapabilities.setCapability("deviceName", "iPhone 6s");
        desiredCapabilities.setCapability("app", "/Users/CRhoads/Desktop/AppCenterAppDownloads/SimBuilds/lori_qa.app");

        URL remoteUrl = new URL("http://localhost:4724/wd/hub");

        driver = new IOSDriver(remoteUrl, desiredCapabilities);
    }

    @Test
    public void sampleTest() {
        MobileElement el1 = (MobileElement) driver.findElementByXPath("(//XCUIElementTypeOther[@name=\"get_covered_button\"])[2]");
        el1.click();
        MobileElement el2 = (MobileElement) driver.findElementByXPath("(//XCUIElementTypeOther[@name=\"control_choice_button_im_already_a_customer__log_in\"])[2]");
        el2.click();
        MobileElement el3 = (MobileElement) driver.findElementByXPath("//XCUIElementTypeTextField[@name=\"login_email_field\"]");
        el3.clear();
        el3.sendKeys("crhoads1024+825qa1@gmail.com");
        MobileElement el4 = (MobileElement) driver.findElementByXPath("//XCUIElementTypeSecureTextField[@name=\"login_password_field\"]");
        el4.clear();
        el4.sendKeys("Test123@");
        MobileElement el5 = (MobileElement) driver.findElementByXPath("(//XCUIElementTypeOther[@name=\"login_submit_button\"])[2]");
        el5.click();
        MobileElement el6 = (MobileElement) driver.findElementByXPath("(//XCUIElementTypeOther[@name=\"control_choice_button_file_a_claim\"])[2]");
        el6.click();
        MobileElement el7 = (MobileElement) driver.findElementByXPath("(//XCUIElementTypeOther[@name=\"control_choice_button_qa_onboardcomplete_mixpanel_tests_galaxy_note10\"])[3]");
        el7.click();
        MobileElement el8 = (MobileElement) driver.findElementByXPath("(//XCUIElementTypeOther[@name=\"control_choice_button_email\"])[2]");
        el8.click();
        MobileElement el9 = (MobileElement) driver.findElementByXPath("(//XCUIElementTypeOther[@name=\"control_choice_button_crhoads1024825qa1gmailcom\"])[2]");
        el9.click();
        MobileElement el10 = (MobileElement) driver.findElementByXPath("(//XCUIElementTypeOther[@name=\"control_choice_button_its_broken\"])[3]");
        el10.click();
        MobileElement el11 = (MobileElement) driver.findElementByXPath("(//XCUIElementTypeOther[@name=\"control_choice_button_battery_not_working\"])[2]");
        el11.click();
        MobileElement el12 = (MobileElement) driver.findElementByAccessibilityId("control_longtext_field_claim_narrative");
        el12.sendKeys("Device will not hold a charge no matter how much power the percentage indicator says it has. It will say 85% and be dead witin 10mins of unplugging from the charger.");
        MobileElement el13 = (MobileElement) driver.findElementByXPath("(//XCUIElementTypeOther[@name=\"control_longtext_submit_button\"])[2]");
        el13.click();
        MobileElement el14 = (MobileElement) driver.findElementByAccessibilityId("lori-chat-response-17");
        el14.click();
        MobileElement el15 = (MobileElement) driver.findElementByXPath("(//XCUIElementTypeOther[@name=\"control_choice_button_no\"])[2]");
        el15.click();
        MobileElement el16 = (MobileElement) driver.findElementByAccessibilityId("control_date_field_claim_loss_dt_button");
        el16.click();
        (new TouchAction(driver))
                .press({x:Object y;
        213, y: 582})
      .moveTo({x: 211: y: 597})
      .release()
                .perform()
        MobileElement el17 = (MobileElement) driver.findElementByXPath("//XCUIElementTypeDatePicker[@name=\"dateTimePicker\"]/XCUIElementTypePicker/XCUIElementTypePickerWheel[2]");
        el17.sendKeys("06/02/2021");
        (new TouchAction(driver))
                .press({x: 211, y: 531})
      .moveTo({x: 211: y: 573})
      .release()
                .perform()
        MobileElement el18 = (MobileElement) driver.findElementByAccessibilityId("control_date_field_claim_loss_dt_picker_done_button");
        el18.click();
        MobileElement el19 = (MobileElement) driver.findElementByXPath("(//XCUIElementTypeOther[@name=\"control_date_submit_button\"])[2]");
        el19.click();
        MobileElement el20 = (MobileElement) driver.findElementByXPath("(//XCUIElementTypeOther[@name=\"control_form_validate_address_button\"])[2]");
        el20.click();
        MobileElement el21 = (MobileElement) driver.findElementByXPath("(//XCUIElementTypeOther[@name=\"control_form_submit_button\"])[2]");
        el21.click();
        MobileElement el22 = (MobileElement) driver.findElementByXPath("(//XCUIElementTypeOther[@name=\"control_choice_button_drop_off\"])[2]");
        el22.clear();
        MobileElement el23 = (MobileElement) driver.findElementByXPath("(//XCUIElementTypeOther[@name=\"control_choice_button_concierge\"])[2]");
        el23.clear();
        MobileElement el24 = (MobileElement) driver.findElementByXPath("(//XCUIElementTypeOther[@name=\"control_choice_button_drop_off\"])[2]");
        el24.click();
        MobileElement el25 = (MobileElement) driver.findElementByXPath("(//XCUIElementTypeOther[@name=\"control_choice_button_cpr___765_e_boughton_rd_118mi\"])[2]");
        el25.click();
        MobileElement el26 = (MobileElement) driver.findElementByXPath("(//XCUIElementTypeOther[@name=\"control_choice_button_card_ending_in_1111\"])[2]");
        el26.click();
        MobileElement el27 = (MobileElement) driver.findElementByXPath("(//XCUIElementTypeOther[@name=\"control_choice_button_continue\"])[2]");
        el27.click();
        MobileElement el28 = (MobileElement) driver.findElementByXPath("(//XCUIElementTypeOther[@name=\"Failed. Tap to retry.\"])[5]");
        el28.click();
        (new TouchAction(driver)).tap(33, 53).perform()
        MobileElement el29 = (MobileElement) driver.findElementByAccessibilityId("home_menu_item");
        el29.clear();
        (new TouchAction(driver))
                .press({x: 271, y: 320})
      .moveTo({x: 270: y: 225})
      .release()
                .perform()
        MobileElement el30 = (MobileElement) driver.findElementByAccessibilityId("claim_history_menu_item");
        el30.click();
        MobileElement el31 = (MobileElement) driver.findElementByAccessibilityId("Resolved");
        el31.click();
        MobileElement el32 = (MobileElement) driver.findElementByAccessibilityId("Resolved Claim HYLACL-13181 from 06/03/2021 Claim HYLACL-13182 from 06/03/2021");
        el32.click();
        MobileElement el33 = (MobileElement) driver.findElementByXPath("(//XCUIElementTypeOther[@name=\"control_choice_button_manage_account\"])[2]");
        el33.click();
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
