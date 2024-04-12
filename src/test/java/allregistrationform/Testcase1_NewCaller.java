package allregistrationform;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import base.BaseTest;

public class Testcase1_NewCaller extends BaseTest{
	
	
	// Create a Faker instance
		public static Faker faker = new Faker();
		public static String randomFirstName = faker.name().firstName();
		public static String randomLastName = faker.name().lastName();
		// Generate a random email address
		public static String randomEmail = faker.name().firstName() + "@yopmail.com";
		public static String randomPhoneNumber = faker.regexify("[5-9][0-9]{9}");
		public static String randomusername = faker.regexify("[A-Z]{5}");
		//public static String einNumber = faker.regexify("[0-9]{2}-[0-9]{7}");
		//public static String randomFullAddress = faker.address().fullAddress();
	
	

	@Test(priority = 0)

	public static void adultpopup() throws InterruptedException {


		driver.findElement(By.xpath(loc2.getProperty("check_box_18+"))).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath(loc2.getProperty("yes_I_am_over18+_button"))).click();
		Thread.sleep(6000);
		
	}
	
	@Test(priority = 1)

	public static void new_caller_Button() throws InterruptedException {

		driver.findElement(By.linkText(loc2.getProperty("NewCaller"))).click() ;
		Thread.sleep(6000);
		

	}

	@Test(priority = 2)
	public static void newcaller_form() throws InterruptedException {



		driver.findElement(By.xpath(loc2.getProperty("First_Name*"))).sendKeys(randomFirstName);
		Thread.sleep(2000);

		driver.findElement(By.xpath(loc2.getProperty("Last_Name*"))).sendKeys(randomLastName);
		Thread.sleep(4000);
//		driver.findElement(By.xpath(loc2.getProperty("Email_ID1*"))).sendKeys(fakeEmail);
//		Thread.sleep(6000);
		//driver.findElement(By.xpath("//form[@action='https://www.scinner.com/affiliate/new/register/save']//input[@placeholder='Email ID *']")).sendKeys(randomLastName);
	
		driver.findElement(By.xpath(loc2.getProperty("Phone*"))).sendKeys(randomPhoneNumber);
		Thread.sleep(6000);
		driver.findElement(By.xpath(loc2.getProperty("Username"))).sendKeys(randomusername);
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
