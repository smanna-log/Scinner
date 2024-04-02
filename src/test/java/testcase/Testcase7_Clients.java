package testcase;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.BaseTest;

public class Testcase7_Clients extends BaseTest {



	@Test

	public static void Clients() throws InterruptedException
	{ 
		driver.findElement(By.xpath(loc.getProperty("Clients_section"))).click();
		Thread.sleep(4000);
	}

	




}

