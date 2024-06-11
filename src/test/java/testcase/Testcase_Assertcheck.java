package testcase;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;

public class Testcase_Assertcheck extends BaseTest {
	
	
	
	@Test

	public static void URL() throws InterruptedException {
		String actualUrl = "https://scinner.com/";
		String expectedUrl = driver.getCurrentUrl();
		//System.out.println(getCurrentUrl);
		Assert.assertEquals(expectedUrl,actualUrl);
		//Assert.assertTrue(condition);		
	}
}
