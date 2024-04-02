package testcase;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.BaseTest;

public class Testcase8_Account extends BaseTest {



	@Test

	public static void Account() throws InterruptedException
	{ 
		driver.findElement(By.xpath(loc.getProperty("Account_section"))).click();
		Thread.sleep(4000);
	}

	


}
