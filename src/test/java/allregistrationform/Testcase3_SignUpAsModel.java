package allregistrationform;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import base.BaseTest;

public class Testcase3_SignUpAsModel extends BaseTest {

	// Create a Faker instance
	public static Faker faker = new Faker();
	public static String randomFirstName = faker.name().firstName();
	public static String randomLastName = faker.name().lastName();
	// Generate a random email address
	public static String randomEmail = faker.name().firstName() + "@yopmail.com";
	public static String randomPhoneNumber = faker.regexify("[5-9][0-9]{9}");
	public static String randomusername = faker.regexify("[A-Z]{5}");
	public static String einNumber = faker.regexify("[0-9]{2}-[0-9]{7}");
	public static String randomFullAddress = faker.address().fullAddress();

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

	@Test(priority = 2)

	public static void model_Registration_Form_page1() throws InterruptedException {

		driver.findElement(By.xpath(loc2.getProperty("Email_ID*"))).sendKeys(randomusername +"@yopmail.com");
		Thread.sleep(4000);
		driver.findElement(By.xpath(loc2.getProperty("Username*"))).sendKeys(randomusername);
		Thread.sleep(4000);
		driver.findElement(By.xpath(loc2.getProperty("EIN/Social_Security_Number*"))).sendKeys(einNumber);
		Thread.sleep(2000);
		driver.findElement(By.xpath(loc2.getProperty("Phone_Number*"))).sendKeys(randomPhoneNumber);
		Thread.sleep(4000);
		driver.findElement(By.xpath(loc2.getProperty("Home_Address*"))).sendKeys(randomFullAddress);
		Thread.sleep(2000);
		driver.findElement(By.xpath(loc2.getProperty("Password*"))).sendKeys("Test@123");
		Thread.sleep(4000);
		driver.findElement(By.xpath(loc2.getProperty("Confirm_Password*"))).sendKeys("Test@123");
		Thread.sleep(4000);
		driver.findElement(By.xpath(loc2.getProperty("Next_Button")));
		Thread.sleep(4000);

	}

}
