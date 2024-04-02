package allregistrationform;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.BaseTest;

public class Testcase1_NewCaller extends BaseTest{

//	@Test(priority = 0)
//
//	public static void adultpopup() throws InterruptedException {
//
//
//		driver.findElement(By.xpath(loc2.getProperty("check_box_18+"))).click();
//		Thread.sleep(6000);
//		driver.findElement(By.xpath(loc2.getProperty("yes_I_am_over18+_button"))).click();
//		Thread.sleep(6000);
//		
//	}
	
	@Test(priority = 1)

	public static void new_caller_Button() throws InterruptedException {

		driver.findElement(By.linkText(loc2.getProperty("NewCaller"))).click() ;
		Thread.sleep(6000);
		

	}

	@Test(priority = 2)
	public static void newcaller_form() throws InterruptedException {



		driver.findElement(By.xpath(loc2.getProperty("First_Name*"))).sendKeys("Manali");
		Thread.sleep(2000);

		driver.findElement(By.xpath(loc2.getProperty("Last_Name*"))).sendKeys("Basu");
		Thread.sleep(2000);
		driver.findElement(By.xpath(loc2.getProperty("Email_ID*"))).sendKeys("manalibasu@yopmail.com");
		Thread.sleep(6000);
		driver.findElement(By.xpath(loc2.getProperty("Username"))).sendKeys("Holi");
		Thread.sleep(6000);
		driver.findElement(By.xpath(loc2.getProperty("Phone*"))).sendKeys("9874589655");
		Thread.sleep(6000);
		driver.findElement(By.xpath(loc2.getProperty("Password"))).sendKeys("Test@123");
		Thread.sleep(6000);
		driver.findElement(By.xpath(loc2.getProperty("Confirm_Password"))).sendKeys("Test@123");
		Thread.sleep(6000);
		driver.findElement(By.xpath(loc2.getProperty("Amateur"))).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath(loc2.getProperty("Experience"))).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath(loc2.getProperty("Next_Button")));
		Thread.sleep(6000);

	}


}
