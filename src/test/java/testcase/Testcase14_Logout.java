package testcase;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.BaseTest;

public class Testcase14_Logout extends BaseTest {


	@Test

	public static void Logout() throws InterruptedException
	{
		driver.findElement(By.xpath(loc.getProperty("Logout"))).click();
		Thread.sleep(6000);

	}



}

