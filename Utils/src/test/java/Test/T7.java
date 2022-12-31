package Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class T7 {

	@Test
	public void m1() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.cancer.gov/");
		driver.findElement(By.cssSelector("a[href*='contact']")).click();
		System.out.println(driver.findElement(By.cssSelector("a.icon.phone+p")).getText());
		System.out.println(driver.findElement(By.cssSelector("h2#ui-id-2+p+p")).getText());
		driver.findElement(By.cssSelector("a[href*='publications']")).click();
		System.out.println(driver.findElement(By.xpath("//h1")).getText());
		List<WebElement> paras = driver.findElements(By.cssSelector("p>a"));
		for (WebElement para : paras) {
			System.out.println(para.getText());
		}
		driver.quit();
	}

}
