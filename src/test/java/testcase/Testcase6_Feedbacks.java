package testcase;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.BaseTest;

public class Testcase6_Feedbacks extends BaseTest {


	@Test

	public static void Feedbacks() throws InterruptedException
	{ 
		driver.findElement(By.xpath(loc.getProperty("feedbacks_section"))).click();
		Thread.sleep(4000);
		driver.navigate().back(); 
		Thread.sleep(4000);
	}

	







}

