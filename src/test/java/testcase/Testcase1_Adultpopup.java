package testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base.BaseTest;

public class Testcase1_Adultpopup extends BaseTest {


	@Test

	public static void Adultpopup() throws InterruptedException {

		//		
		//		driver.findElement(By.xpath(loc.getProperty("check_box_18+"))).click();
		//		Thread.sleep(4000);
		//		
		//		driver.findElement(By.xpath(loc.getProperty("yes_I_am_over18+_button"))).click();
		//		Thread.sleep(6000);

		WebElement checkBox = driver.findElement(By.xpath(loc.getProperty("check_box_18+")));
		if (checkBox.isDisplayed() && checkBox.isEnabled()) 
		{
			checkBox.click();
			Thread.sleep(4000);
			driver.findElement(By.xpath(loc.getProperty("yes_I_am_over18+_button"))).click();
//			Thread.sleep(6000);
//			System.out.println("yes_I_am_over18+_button");

		} 
		else 
		{
			driver.findElement(By.xpath(loc.getProperty("yes_I_am_Not_over18+_button"))).click();
			Thread.sleep(6000);
			System.out.println("yes_I_am_Not_over18+_button");

		}
		

	}

	

}
