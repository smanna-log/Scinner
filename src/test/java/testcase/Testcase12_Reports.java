package testcase;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.BaseTest;

public class Testcase12_Reports extends BaseTest {



	@Test

	public static void Reports() throws InterruptedException
	{
		driver.findElement(By.xpath(loc.getProperty("Reports"))).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath(loc.getProperty("Payment_Reports"))).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath(loc.getProperty("Payment_Summary"))).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath(loc.getProperty("Affiliate_Earning"))).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath(loc.getProperty("Featured_Listing"))).click();
		Thread.sleep(6000);

	}

	





}


