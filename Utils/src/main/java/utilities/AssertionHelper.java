package utilities;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class AssertionHelper {

	private WebDriver driver;

	public AssertionHelper(WebDriver driver) {
		this.driver = driver;
	}

	public static void verifyText(String s1, String s2) {
		Assert.assertEquals(s1, s2);
	}

	public static void verifyTrue() {
		System.out.println("Making script pass");
		Assert.assertTrue(true);
	}

	public static void verifyTrue(String message) {
		System.out.println("Making script pass with message: "+message);
		Assert.assertTrue(true, message);
	}

	public static void verifyFalse() {
		Assert.assertTrue(false);
	}

	public static void verifyFalse(String message) {
		Assert.assertTrue(false, message);
	}

	public void verifyTrue(boolean status) {
		Assert.assertTrue(status);

	}

	public void verifyFalse(boolean status) {
		Assert.assertFalse(status);

	}

	public void verifyNullObject(String s1) {

		Assert.assertNull(s1);
	}

	public void verifyNotNullObject(String s1) {

		Assert.assertNotNull(s1);
	}

}
