package testcase;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.BaseTest;

public class Testcase10_Profile extends BaseTest {


	@Test

	public static void Profile() throws InterruptedException
	{ 
		driver.findElement(By.xpath(loc.getProperty("Profile_section"))).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(loc.getProperty("Info"))).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(loc.getProperty("Gallery"))).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(loc.getProperty("Services"))).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(loc.getProperty("Pleasure_Bags"))).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(loc.getProperty("Praises"))).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(loc.getProperty("Share_Profile"))).click();
		Thread.sleep(4000);

	}

	





}


