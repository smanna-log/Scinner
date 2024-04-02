package testcase;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.BaseTest;

public class Testcase13_Add_Balance extends BaseTest {


	@Test

	public static void Add_Balance() throws InterruptedException
	{
		driver.findElement(By.xpath(loc.getProperty("Add_Balance"))).click();
		Thread.sleep(6000);
		driver.navigate().back(); 
		Thread.sleep(6000);

	}




}

