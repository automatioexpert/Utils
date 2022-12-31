package rough;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClickElement4 {

	@Test
	public void m1() throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://medium.com/");
		// Get Element attribute
		// a[contains(text(),'Write')]


		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		System.out.println(js.executeScript("return window.innerHeight;"));

		System.out.println(js.executeScript("return window.innerWidth;"));
		driver.manage().window().maximize();
		
		System.out.println(js.executeScript("return window.innerHeight;"));

		System.out.println(js.executeScript("return window.innerWidth;"));
		
		driver.quit();
		
	}

}
