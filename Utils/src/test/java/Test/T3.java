package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class T3 {

	@Test
	public void m1() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.baeldung.com/java-collection-stream-foreach");
		driver.findElement(By.cssSelector("a[href*='start-here']")).click();
		System.out.println(driver.findElement(By.xpath("//h1")).getText());
		
	driver.quit();
	}

}
