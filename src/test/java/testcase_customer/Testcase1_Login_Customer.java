package testcase_customer;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import base.BaseTest;

public class Testcase1_Login_Customer extends BaseTest {

	// Create a Faker instance
	public static Faker faker = new Faker();
	public static String randomMessage = faker.chuckNorris().fact();
	// Generate a random emoji
	// String randomEmoji = EmojiParser.parseToUnicode(":smiley:");

	@Test(priority = 0)

	public static void Login() throws InterruptedException {

		driver.findElement(By.xpath(loc3.getProperty("login_button"))).click();

		driver.findElement(By.xpath(loc3.getProperty("username/email_text_field"))).sendKeys("sauravcus");
		Thread.sleep(2000);
		driver.findElement(By.xpath(loc3.getProperty("email_Text_field"))).sendKeys("Test@123");

		driver.findElement(By.xpath(loc3.getProperty("signIn_button"))).click();

		driver.findElement(By.xpath(loc3.getProperty("signIn_button"))).click();

	}

	@Test(priority = 1)

	public static void Dashboard() throws InterruptedException {

		driver.findElement(By.xpath(loc3.getProperty("My_Account_Button"))).click();

		Thread.sleep(6000);
		driver.findElement(By.xpath(loc3.getProperty("Dashboard_Button"))).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath(loc3.getProperty("Payment_Button"))).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath(loc3.getProperty("Transaction_History_Button"))).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath(loc3.getProperty("Recharge_History"))).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath(loc3.getProperty("Profile_Button"))).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath(loc3.getProperty("Info_Button"))).click();

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
	}

	@Test(priority = 2)
	public static void model_Profile_Check() throws InterruptedException {

		String newUrl = "https://scinner.com/view-model/sauravm";
		driver.get(newUrl);
		Thread.sleep(6000);

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
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(4000);
		// Scroll up with time span
		while (true) {
			((JavascriptExecutor) driver).executeScript("window.scrollBy(0, -500)"); // Scroll up by 500 pixels
			Thread.sleep(timeSpan); // Break the loop when you reach the top of the page
			if ((Long) ((JavascriptExecutor) driver).executeScript("return window.scrollY") <= 0) {
				break;
			}
		}
	}

	@Test(priority = 3)
	public static void connect_Now() throws InterruptedException {

		Thread.sleep(4000);
		JavascriptExecutor js = (JavascriptExecutor) driver;

		// Scroll down by a little bit (100 pixels)
		js.executeScript("window.scrollBy(0,200)");
		Thread.sleep(4000);
		driver.findElement(By.xpath(loc3.getProperty("Connect_Now_Button"))).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(loc3.getProperty("Chat_Box_Button"))).click();
		Thread.sleep(4000);

	}

	@Test(priority = 4)
	public static void chat_Box() throws InterruptedException {

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

		driver.findElement(By.xpath(loc3.getProperty("Enter_Your_Message_Here"))).sendKeys(randomMessage);
		Thread.sleep(4000);

	}

}
