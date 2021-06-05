package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtils {
	
	public static void waitForElementToAppear(WebDriver driver, WebElement webElement) {
	
	WebDriverWait wait=new WebDriverWait(driver,35);

	wait.until(ExpectedConditions.visibilityOf(webElement));

	}
}
