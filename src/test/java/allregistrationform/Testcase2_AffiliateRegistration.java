package allregistrationform;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import base.BaseTest;

public class Testcase2_AffiliateRegistration extends BaseTest {

	// Create a Faker instance
	public static Faker faker = new Faker();
	public static String randomFirstName = faker.name().firstName();
	public static String randomLastName = faker.name().lastName();
	// Generate a random email address
	public static String randomPhoneNumber = faker.phoneNumber().cellPhone();
	public static String randomusername = faker.regexify("[A-Z]{5}");
	public static String randomAddress = faker.address().fullAddress();
	public static String randomBankName = faker.funnyName().name();
	public static String randomBank_Account_Number = faker.regexify("[5-9][0-9]{12}");

	public static String routingNumber = generateRoutingNumber();

	// Method to generate a fake routing number
	public static String generateRoutingNumber() {
		StringBuilder routingNumber = new StringBuilder();
		Faker faker = new Faker();
		// Generating 9 random digits for the routing number
		for (int i = 0; i < 9; i++) {
			routingNumber.append(faker.random().nextInt(10));
		}
		return routingNumber.toString();
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
		driver.findElement(By.xpath(loc2.getProperty("Sign_Up_As_Affiliate"))).click();
	}

	@Test(priority = 2)

	public static void affiliate_Registration_Form() throws InterruptedException {

		// First-Page
		driver.findElement(By.xpath(loc2.getProperty("First_Name*affi"))).sendKeys(randomFirstName);
		driver.findElement(By.xpath(loc2.getProperty("Last_Name*affi"))).sendKeys(randomLastName);
		driver.findElement(By.xpath(loc2.getProperty("Email_ID*affi"))).sendKeys(randomusername + "yopmail.com");
		driver.findElement(By.xpath(loc2.getProperty("Phone*affi"))).sendKeys(randomPhoneNumber);
		driver.findElement(By.xpath(loc2.getProperty("Usernameaffi"))).sendKeys(randomusername);
		driver.findElement(By.xpath(loc2.getProperty("Passwordaffi"))).sendKeys("Test@123");
		driver.findElement(By.xpath(loc2.getProperty("Confirm_Passwordaffi"))).sendKeys("Test@123");
		driver.findElement(By.xpath(loc2.getProperty("FlexCheckCheckedaffi"))).click();
		driver.findElement(By.xpath(loc2.getProperty("Next_Buttonaffi"))).click();

		// Second-Page
		driver.findElement(By.xpath(loc2.getProperty("Name_Affi*"))).sendKeys(randomFirstName + randomLastName);
		driver.findElement(By.xpath(loc2.getProperty("Address_Affi*"))).sendKeys(randomAddress);
		driver.findElement(By.xpath(loc2.getProperty("BankName_affi*"))).sendKeys(randomBankName);
		driver.findElement(By.xpath(loc2.getProperty("Bank_Address_affi*"))).sendKeys(randomAddress);
		driver.findElement(By.xpath(loc2.getProperty("Bank_Number_affi*"))).sendKeys(randomBank_Account_Number);
		driver.findElement(By.xpath(loc2.getProperty("RoutingNumber_affi*"))).sendKeys(routingNumber);
		driver.findElement(By.xpath(loc2.getProperty("Checkbox_affi*"))).click();
		driver.findElement(By.xpath(loc2.getProperty("Save_affi*")));

		// Check if successful message is displayed
		if (driver.findElement(By.xpath(loc2.getProperty("Successfully_Submitted_affi"))).isDisplayed()) {
			System.out.println("Form submitted successfully!");
		} else {
			System.out.println("Form submission failed!");
		}

	}

}
