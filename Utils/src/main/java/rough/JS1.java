package rough;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JS1 {

	@Test
	public void m1() throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://medium.com/");
		//Get Element attribute
		//a[contains(text(),'Write')]
		
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("alert('hello world..I am the best Expert on the Planet');");
		System.out.println(driver.switchTo().alert().getText());
		
		Thread.sleep(3000);
		driver.quit();
		
	}

}
