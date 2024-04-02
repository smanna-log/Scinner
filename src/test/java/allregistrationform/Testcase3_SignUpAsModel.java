package allregistrationform;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import base.BaseTest;



public class Testcase3_SignUpAsModel extends BaseTest{

	@Test(priority = 0)

	public static void adultpopup() throws InterruptedException {	
		driver.findElement(By.xpath(loc2.getProperty("check_box_18+"))).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(loc2.getProperty("yes_I_am_over18+_button"))).click();
		Thread.sleep(6000);

	}
	
	@Test(priority = 1)

	public static void affiliateRegistration_Button() throws InterruptedException {

		long timeSpan = 1000;
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// Scroll to the bottom of the page
		long windowHeight = (long) js.executeScript("return window.innerHeight");
		long documentHeight = (long) js.executeScript("return document.body.scrollHeight");
		long scrollDistance = documentHeight;
		long currentScroll = 0;
		while (currentScroll < scrollDistance) {
			js.executeScript("window.scrollTo(0, " + currentScroll + ")");
			currentScroll += windowHeight;
			try {
				Thread.sleep(timeSpan);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		Thread.sleep(2000);
		driver.findElement(By.xpath(loc2.getProperty("Sign_Up_As_Model"))).click();
		Thread.sleep(6000);
	}

	@Test(priority = 2 )

	public static void model_Registration_Form_page1() throws InterruptedException { 

		driver.findElement(By.xpath(loc2.getProperty("Email_ID*"))).sendKeys("manalibasu@yopmail.com");
		Thread.sleep(4000);
		driver.findElement(By.xpath(loc2.getProperty("Username"))).sendKeys("Holi");
		Thread.sleep(4000);
		driver.findElement(By.xpath(loc2.getProperty("EIN_Social_Security_Number"))).sendKeys("58-8974589");
		Thread.sleep(2000);
		driver.findElement(By.xpath(loc2.getProperty("Phone*"))).sendKeys("9874589655");
		Thread.sleep(4000);
		driver.findElement(By.xpath(loc2.getProperty("home_Address"))).sendKeys("Kolkata");
		Thread.sleep(2000);
		driver.findElement(By.xpath(loc2.getProperty("Password"))).sendKeys("Test@123");
		Thread.sleep(4000);
		driver.findElement(By.xpath(loc2.getProperty("Confirm_Password"))).sendKeys("Test@123");
		Thread.sleep(4000);
		driver.findElement(By.xpath(loc2.getProperty("Next_Button")));
		Thread.sleep(4000);


	}	


	}
