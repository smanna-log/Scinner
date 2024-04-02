package testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import base.BaseTest;

public class Testcase5_MessageIconWithChatRoom extends BaseTest {



	@Test

	public static void MessageIconWithChatRoom() throws InterruptedException
	{
		driver.navigate().back(); 
		Thread.sleep(4000);
		((JavascriptExecutor)driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(4000); // Wait for page to load // Define time span for each scroll
		long timeSpan = 1000; // 1000 milliseconds = 1 second 
		// Scroll up with time span 
		while (true) 
		{ 
			((JavascriptExecutor)driver).executeScript("window.scrollBy(0, -500)"); // Scroll up by 500 pixels
			Thread.sleep(timeSpan); // Break the loop when you reach the top of the page
			if ((Long) ((JavascriptExecutor) driver).executeScript("return window.scrollY") <= 0) 
			{ 
				break; 
			} 
		}
		Thread.sleep(4000);
		driver.findElement(By.xpath(loc.getProperty("message_icon"))).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(loc.getProperty("customer_profile_icon"))).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(loc.getProperty("chat_message_section"))).sendKeys("Hi Handsome, How are You ? ");
		Thread.sleep(4000);
		driver.findElement(By.xpath(loc.getProperty("chat_submit_button"))).click();
		Thread.sleep(4000);
	}

	

}

