package testcase;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base.BaseTest;

public class Testcase4_ViewPleasureBag extends BaseTest {


	@Test

	public static void ViewPleasureBag() throws InterruptedException
	{

		driver.findElement(By.xpath(loc.getProperty("view_Pleasure_Bag1"))).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(loc.getProperty("Your_pleasure_bag"))).click();
		Thread.sleep(4000);
		List<WebElement> images = driver.findElements(By.xpath("Your_pleasure_bag_image_count"));
		//System.out.println("No. of Images: "+images.size());
		int imageCount = images.size(); 
		for (int i = 0; i < imageCount; ++i)
		{
			driver.findElement(By.xpath(loc.getProperty("right_arrow_icon"))).click();
			Thread.sleep(4000);
			if(i == images.size()-1) 
			{ 
				break ; 
			} 
			Thread.sleep(4000);
		}
	}

	

}


