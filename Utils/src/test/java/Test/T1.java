package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import utilities.AssertionHelper;

public class T1 {

	@Test
	public void m1() {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		AssertionHelper ah = new AssertionHelper(driver);
		ah.verifyFalse();
	
		driver.quit();

	}
}
