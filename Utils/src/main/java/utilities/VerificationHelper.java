package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VerificationHelper {

	private WebDriver driver;

	public VerificationHelper(WebDriver driver) {
		this.driver = driver;
	}

	public boolean isDisplayed(WebElement element) {

		try {
			element.isDisplayed();
			System.out.println("Element is present: "+element.getText());
			return true;
		} catch (Exception e) {
			System.out.println("Element is not displayed");
			return false;
		}
	}
	
	
	public boolean isNotDisplayed(WebElement element) {

		try {
			element.isDisplayed();
			System.out.println("Element is present: "+element.getText());
			return false;
		} catch (Exception e) {
			System.out.println("Element is not displayed");
			return true;
		}
	}
	
	 public String readValueFromElement(WebElement element) {
		 if(element==null) {
			 return null;
		 }
		boolean status= isDisplayed(element);
		if(status) {
			System.out.println("Element text is: "+element.getText());
			return element.getText();
		}
		else {
			
			return null;
		}
	 }
	
	
}
