package allregistrationform;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import com.github.javafaker.Faker;
import base.BaseTest;

public class Testcase1_NewCaller extends BaseTest {

	// Create a Faker instance
	public static Faker faker = new Faker();
	public static String randomFirstName = faker.name().firstName();
	public static String randomLastName = faker.name().lastName();
	// Generate a random email address
	public static String randomEmail = faker.name().firstName() + "@yopmail.com";
	public static String randomPhoneNumber = faker.regexify("[5-9][0-9]{9}");
	public static String randomusername = faker.regexify("[A-Z]{5}");

	@Test(priority = 1)

	public static void new_caller_Button() throws InterruptedException {

		driver.findElement(By.linkText(loc2.getProperty("NewCaller"))).click();
	}

	@Test(priority = 2)
	public static void newcaller_form() throws InterruptedException {

		driver.findElement(By.xpath(loc2.getProperty("First_Name*"))).sendKeys(randomFirstName);
		driver.findElement(By.xpath(loc2.getProperty("Last_Name*"))).sendKeys(randomLastName);
		driver.findElement(By.xpath(loc2.getProperty("Email_ID1*"))).sendKeys(randomusername + "yopmail.com");
		driver.findElement(By.xpath(loc2.getProperty("Phone*"))).sendKeys(randomPhoneNumber);
		driver.findElement(By.xpath(loc2.getProperty("Username"))).sendKeys(randomusername);
		driver.findElement(By.xpath(loc2.getProperty("Password"))).sendKeys("Test@123");
		driver.findElement(By.xpath(loc2.getProperty("Confirm_Password"))).sendKeys("Test@123");
		driver.findElement(By.xpath(loc2.getProperty("Amateur"))).click();
		driver.findElement(By.xpath(loc2.getProperty("Experience"))).click();
		driver.findElement(By.xpath(loc2.getProperty("Next_Button1")));

		// Check if successful message is displayed
		if (driver.findElement(By.xpath(loc2.getProperty("Successfully_Submitted"))).isDisplayed()) {
			System.out.println("Form submitted successfully!");
		} else {
			System.out.println("Form submission failed!");
		}

	}

}
