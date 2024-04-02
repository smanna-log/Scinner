package testcase;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.BaseTest;

public class Testcase2_Login extends BaseTest {


	@Test

	public static void Login() throws InterruptedException {
		driver.findElement(By.xpath(loc.getProperty("login_button"))).click();
		Thread.sleep(6000);
		// Actions actions = new Actions(driver);
		driver.findElement(By.xpath(loc.getProperty("username/email_text_field"))).sendKeys("sauravm");
		Thread.sleep(2000);
		driver.findElement(By.xpath(loc.getProperty("email_Text_field"))).sendKeys("Test@123");
		Thread.sleep(2000);
		driver.findElement(By.xpath(loc.getProperty("signIn_button"))).click();	
		Thread.sleep(6000);
	}


}

