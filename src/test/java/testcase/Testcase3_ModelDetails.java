package testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import base.BaseTest;

public class Testcase3_ModelDetails extends BaseTest {



	@Test

	public static void ModelDetails() throws InterruptedException {
		driver.findElement(By.xpath(loc.getProperty("offline_button"))).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath(loc.getProperty("online_button"))).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath(loc.getProperty("model_icon"))).click();
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
		Thread.sleep(4000);
	}

	




}

