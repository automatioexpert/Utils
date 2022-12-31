package rough;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClickElement3 {

	@Test
	public void m1() throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://medium.com/");
		// Get Element attribute
		// a[contains(text(),'Write')]


		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		for(int i=1;i<=5;i++)		
		js.executeScript("window.scrollBy(0,350)");
		Thread.sleep(6000);
		driver.quit();
		
	}

}
