package pages.iOS.mobileWeb;

import com.hyla.BaseTest;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.support.PageFactory;


public class safari_Splash_Page extends BaseTest {
    private String avibra1Endpoint = "https://avibra1.qa.hellolori.com/";
    private String avibra2Endpoint = "https://avibra2.qa.hellolori.com/";



    public safari_Splash_Page(IOSDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name='URL']")
    private MobileElement urlTextBox;

    @iOSXCUITFindBy(accessibility = "Go")
    private MobileElement go_Btn;

public safari_User_Landing_Page navigateToEndPoint(){
    try{
        System.out.println("Navigating to web endpoint by entering in URL address.");

        driver.get(avibra1Endpoint);
    }catch(Exception e){
        System.out.println("Loading Endpoint Has Failed.");
    }

    safari_User_Landing_Page landing_page = new safari_User_Landing_Page(driver);
    return landing_page;
}

    // *****************************************
    // ******** User Landing Dashboard *********
    // *****************************************

    @iOSXCUITFindBy(accessibility = "IMEI:")
    private MobileElement imeiText;

    @iOSXCUITFindBy(accessibility = "Apple")
    private MobileElement make;

    @iOSXCUITFindBy(accessibility = "iPhone 6s")
    private MobileElement model;

    @iOSXCUITFindBy(accessibility = "Gray")
    private MobileElement color;

    @iOSXCUITFindBy(accessibility = "16GB")
    private MobileElement capacity;

    @iOSXCUITFindBy(accessibility = "T-Mobile")
    private MobileElement carrier;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeLink[@name=\"Schedule a Repair\"]")
    private MobileElement scheduleRepair_Btn;


    // *****************************************
    // ******* Schedule A Repair Page 1 ********
    // *****************************************

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Charging Port Repair\"]")
    private MobileElement chargerPortRepair;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Battery Repair\"]")
    private MobileElement batteryRepair;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Button Repair\"]")
    private MobileElement buttonRepair;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Camera - Front\"]")
    private MobileElement cameraFront;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Camera - Back\"]")
    private MobileElement cameraBack;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Microphone\"]")
    private MobileElement microphoneRepair;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"web dialog\"])[1]/XCUIElementTypeOther")
    private MobileElement calendarPopup;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"web dialog\"])[2]/XCUIElementTypeButton[3]")
    private MobileElement calendar_Left_Arrow;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"web dialog\"])[2]/XCUIElementTypeButton[4]")
    private MobileElement calendar_Right_Arrow;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"web dialog\"])[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther")
    private MobileElement calendar_Month_Year_Header;

    @iOSXCUITFindBy(accessibility = "OK")
    private MobileElement ok_Button;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Lori: Smart(er) Phone Protection\"]/XCUIElementTypeOther[19]/XCUIElementTypeTextView")
    private MobileElement description_Text_Input;

    @iOSXCUITFindBy(accessibility = "Text (SMS)")
    private MobileElement textSMS_Selector;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Additional Phone Number\"]")
    private MobileElement additionalPhone_Number_Input;

    @iOSXCUITFindBy(accessibility = "Email")
    private MobileElement email_Selector;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Additional Phone Number\"]")
    private MobileElement additional_Email_Input;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Next\"])[1]")
    private MobileElement next_button;



    // ************************************************
    // ***** Enter Address For Repair Tech Screen *****
    // ************************************************

//    @iOSXCUITFindBy(accessibility = "Email")
//    private MobileElement email_Selector;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Lori: Smart(er) Phone Protection\"]/XCUIElementTypeOther[16]/XCUIElementTypeTextField[1]")
    private MobileElement txtField_Address1_Input;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Lori: Smart(er) Phone Protection\"]/XCUIElementTypeOther[16]/XCUIElementTypeTextField[2]")
    private MobileElement txtField_Address2_Input;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Lori: Smart(er) Phone Protection\"]/XCUIElementTypeOther[16]/XCUIElementTypeTextField[3]")
    private MobileElement txtField_City_Input;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Lori: Smart(er) Phone Protection\"]/XCUIElementTypeOther[16]/XCUIElementTypeOther[9]")
    private MobileElement State_Picker;

    // SWIPE BY COORDINATES TO INPUT STATE
    // Send keys inputs the state value but then youre unable to exit the picker wheel and have the value hold in place.


    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Done\"]")
    private MobileElement iOS_Lower_FlyUp_Menu_DONE_Btn;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Zip Code *\"]")
    private MobileElement txtField_Zipcode_Input;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Lori: Smart(er) Phone Protection\"]/XCUIElementTypeOther[16]/XCUIElementTypeTextField[5]")
    private MobileElement txtField_Location_Description_Input;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Lori: Smart(er) Phone Protection\"]/XCUIElementTypeOther[16]/XCUIElementTypeTextView")
    private MobileElement additional_Instructions_Input;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Lori: Smart(er) Phone Protection\"]/XCUIElementTypeOther[32]")
    private MobileElement firstAvailable_TimeSlot;



    // *****************************************
    // ***** APPT CARD INFO PAGE LOCATORS ******
    // *****************************************

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"59\"]")
    private MobileElement avibra1_Displayed_Deductible;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"49\"]")
    private MobileElement avibra2_Displayed_Deductible;

    @iOSXCUITFindBy(accessibility = "Confirm & Pay")
    private MobileElement confirm_Pay_Button;



    // *****************************************
    // ***** ONE INC PAYMENT INFO LOCATORS *****
    // *****************************************






//Text displayed in the browser interface is at its lowest level element --> 'XCUIElementTypeStaticText' and can be located with xpath as seen below
    // "//XCUIElementTypeStaticText[@name=\"Email Address\"]"
    // It may be nested inside of ElementTypeOther/ElementTypeLink/ElementTypeStaticText



}
