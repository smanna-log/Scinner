package testcase;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.BaseTest;

public class Testcase9_Payment extends BaseTest {



	@Test

	public static void Payment() throws InterruptedException
	{ 
		driver.findElement(By.xpath(loc.getProperty("Payment_section"))).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(loc.getProperty("Withdraw_History"))).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(loc.getProperty("Settings"))).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(loc.getProperty("Recharge_History"))).click();
		Thread.sleep(4000);
	}

	





}

