package Test;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class T9 {

	@Test
	public void m1() {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://courses.rahulshettyacademy.com/p/playwright-js-automation-testing-from-scratch-with-framework");
		driver.findElement(By.cssSelector("i.fa.fa-chevron-down")).click();
		List<WebElement> ele=driver.findElements(By.cssSelector("ul.section-list"));
		for(WebElement e:ele) {
			System.out.println(e.getText());
		}
		
		driver.quit();
	}
}
