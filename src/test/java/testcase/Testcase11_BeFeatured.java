package testcase;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.BaseTest;

public class Testcase11_BeFeatured extends BaseTest {



	@Test

	public static void BeFeatured() throws InterruptedException
	{
		driver.findElement(By.xpath(loc.getProperty("Be_Featured"))).click();
		Thread.sleep(4000);

	}

	



}

