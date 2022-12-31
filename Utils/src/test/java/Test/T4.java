package Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class T4 {

	@Test
	public void m1() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.cancer.gov/");
		System.out.println(driver.findElement(By.cssSelector("img[alt='National Cancer Institute']")).isDisplayed());

		System.out.println(driver.findElement(By.cssSelector("div>span>a[href*='contact']")).getText());
		driver.findElement(By.id("swKeyword")).sendKeys("services" + Keys.ENTER);
		
		System.out.println(driver.findElement(By.xpath("//h1")).getText());
	
		List<WebElement> items=driver.findElements(By.cssSelector("li.result__list-item>a"));
		
		for(WebElement it:items) {
			System.out.println(it.getText());
		}
		driver.quit();
	}

}
