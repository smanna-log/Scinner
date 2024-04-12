package allregistrationform;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import base.BaseTest;

public class Testcase2_AffiliateRegistration extends BaseTest{
	
	
	// Create a Faker instance
	public static Faker faker = new Faker();
    public static String randomFirstName = faker.name().firstName();
    public static String randomLastName = faker.name().lastName();
    // Generate a random email address
    public static String randomEmail = faker.name().firstName() + "@yopmail.com";
    public static String randomPhoneNumber = faker.phoneNumber().cellPhone();
    public static String username = faker.name().firstName();
    public static String randomFirstN = faker.name().firstName();
	
	

	@Test(priority = 0)

	public static void adultpopup() throws InterruptedException {

		driver.findElement(By.xpath(loc2.getProperty("check_box_18+"))).click();
		Thread.sleep(6000);
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
		driver.findElement(By.xpath(loc2.getProperty("Sign_Up_As_Affiliate"))).click();
		Thread.sleep(6000);
		
	}
	
	@Test(priority = 2)

	public static void affiliate_Registration_Form() throws InterruptedException {
		
		 
		
		driver.findElement(By.xpath(loc2.getProperty("First_Name*affi"))).sendKeys(randomFirstName);
		Thread.sleep(2000);

		driver.findElement(By.xpath(loc2.getProperty("Last_Name*affi"))).sendKeys(randomLastName);
		Thread.sleep(2000);
		driver.findElement(By.xpath(loc2.getProperty("Email_ID*affi"))).sendKeys(randomEmail);
		Thread.sleep(4000);
		driver.findElement(By.xpath(loc2.getProperty("Phone*affi"))).sendKeys(randomPhoneNumber);
		Thread.sleep(4000);
		driver.findElement(By.xpath(loc2.getProperty("Usernameaffi"))).sendKeys(username);
		Thread.sleep(4000);
		driver.findElement(By.xpath(loc2.getProperty("Passwordaffi"))).sendKeys("Test@123");
		Thread.sleep(4000);
		driver.findElement(By.xpath(loc2.getProperty("Confirm_Passwordaffi"))).sendKeys("Test@123");
		Thread.sleep(4000);		
		driver.findElement(By.xpath(loc2.getProperty("FlexCheckCheckedaffi"))).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(loc2.getProperty("Next_Buttonaffi")));
		Thread.sleep(4000);
		
		
		
	
	
	}
	

}
