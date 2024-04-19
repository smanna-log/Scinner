package testcase_customer;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base.BaseTest;

public class Customerside_Link extends BaseTest {

	// Method to verify if a link is working
	public static void verifyLink(String linkPath) {

		try {
			// Create a URL object
			URL url = new URL(linkPath);
			// Open a connection to the URL
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			// Set request method to HEAD
			connection.setRequestMethod("HEAD");
			// Get the response code
			int responseCode = connection.getResponseCode();
			// Print result based on response code
			if (responseCode == HttpURLConnection.HTTP_OK) {
				System.out.println("Link is working fine (HTTP Status Code: " + responseCode + ")");
			} else {
				System.out.println("Link is not working (HTTP Status Code: " + responseCode + ")");
			}
			// Close the connection
			connection.disconnect();
		} catch (Exception e) {
			System.out.println("Exception occurred: " + e.getMessage());
		}
	}

	@Test(priority = 0)

	public static void heddersection_Linkcount_LinkPath() throws InterruptedException {

		driver.findElement(By.xpath(loc3.getProperty("login_button"))).click();
		driver.findElement(By.xpath(loc3.getProperty("username/email_text_field"))).sendKeys("sauravcus");
		Thread.sleep(2000);
		driver.findElement(By.xpath(loc3.getProperty("email_Text_field"))).sendKeys("Test@123");
		driver.findElement(By.xpath(loc3.getProperty("signIn_button"))).click();
		driver.findElement(By.xpath(loc3.getProperty("signIn_button"))).click();
		Thread.sleep(6000);
		// Find the header element
		WebElement headerElement = driver.findElement(By.xpath(loc3.getProperty("Hedder_Section")));
		// Find all anchor elements within the header section
		List<WebElement> links = headerElement.findElements(By.tagName("a"));
		// Output the count of links in the header section
		System.out.println("Number of links in the header section: " + links.size());
		// Print the count of links path in the header section
		System.out.println("Paths of links in the header section:");
		for (WebElement link : links) {
			String linkText = link.getText(); // Get the text of the link
			String linkPath = link.getAttribute("href"); // Get the value of the href attribute
			System.out.println(linkText + ": " + linkPath);
			verifyLink(linkPath);
		}
	}

	@Test(priority = 1)
	public static void footersection_Linkcount_LinkPath() throws InterruptedException {

		// Find the Footer element
		WebElement footerElement = driver.findElement(By.xpath(loc3.getProperty("Footer_Section")));
		// Find all anchor elements within the footer section
		List<WebElement> links = footerElement.findElements(By.tagName("a"));
		// Output the count of links in the header section
		System.out.println("Number of links in the footer section: " + links.size());

		// Print the count of links path in the footer section
		System.out.println("Paths of links in the footer section:");
		for (WebElement link : links) {
			String linkText = link.getText(); // Get the text of the link
			String linkPath = link.getAttribute("href"); // Get the value of the href attribute
			System.out.println(linkText + ": " + linkPath);
			// Verify if the link is working
			verifyLink(linkPath);
		}
	}

	@Test(priority = 2)
	public static void Lust_List() throws InterruptedException {

		// Find the Lust_List element
		WebElement LustList = driver.findElement(By.xpath(loc3.getProperty("Lust_List")));
		// Find all anchor elements within the Lust_List section
		List<WebElement> links = LustList.findElements(By.tagName("a"));
		// Output the count of links in the Lust_List section
		System.out.println("Number of links in the Lust_List section: " + links.size());
		// Print the count of links path in the Lust_List section
		System.out.println("Paths of links in the Lust_List section:");
		for (WebElement link : links) {
			String linkText = link.getText(); // Get the text of the link
			String linkPath = link.getAttribute("href"); // Get the value of the href attribute
			System.out.println(linkText + ": " + linkPath);
			// Verify if the link is working
			verifyLink(linkPath);

		}

	}

	@Test(priority = 3)
	public static void category_Dropdown_MatchWithLustList() throws InterruptedException {

		driver.findElement(By.xpath(loc3.getProperty("Find_Women"))).click();
		Thread.sleep(6000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// Scroll down by a little bit (100 pixels)
		js.executeScript("window.scrollBy(0,800)");
		Thread.sleep(6000);
		WebElement category_Dropdown = driver.findElement(By.xpath(loc3.getProperty("Category_Dropdown")));
		category_Dropdown.click();
		Thread.sleep(6000);
		// Extract options from the dropdown menu
		List<WebElement> dropdownOptions = category_Dropdown.findElements(By.xpath("//li[@role= \"option\"]"));
		System.out.println("Number of links in the Lust_List section: " + dropdownOptions.size());
		// Print the count of links path in the Lust_List section
		System.out.println("Paths of links in the Lust_List section:");
		for (WebElement option : dropdownOptions) {
			String optionText = option.getText(); // Get the text of the link
			// href attribute
			System.out.println(optionText);
			// System.out.println(elementText + ": " + elementPath);
			// Verify if the link is working
			// verifyLink(linkPath);
		}
		// Go back to the previous page
		driver.navigate().back();
		js.executeScript("window.scrollBy(0,4000)");
		Thread.sleep(6000);
		// Find the list section
		WebElement LustList = driver.findElement(By.xpath(loc3.getProperty("Lust_List")));
		// Extract items from the list section
		List<WebElement> links = LustList.findElements(By.tagName("a"));
		for (WebElement link : links) {
			String linkText = link.getText(); // Get the text of the link
			System.out.println(linkText);
		}
		// Compare the items from the dropdown menu with the items from the list section
		boolean areEqual = compareLists(dropdownOptions, links);
		// Print result
		if (areEqual) {
			System.out.println("All items in the category dropdown menu are equal to items in the list section.");
		} else {
			System.out.println("Items in the category dropdown menu are not equal to items in the list section.");
		}
	}

	// Method to compare two lists of web elements
	public static boolean compareLists(List<WebElement> list1, List<WebElement> list2) {
		
		System.out.println("Number of links in the Lust_List section: " + list1.size());
		System.out.println("Number of links in the Lust_List section: " + list2.size());
		if (list1.size() != list2.size()) {
			System.out.println("Lists have different sizes.");
			return false;
		}
		for (int i = 0; i < list1.size(); i++) {
			String item1 = list1.get(i).getText().trim();
			String item2 = list2.get(i).getText().trim();
			if (!item1.equals(item2)) {
				System.out.println("Elements at index " + i + " are different:");
				System.out.println("List 1: " + item1);
				System.out.println("List 2: " + item2);
				return false;
			}
		}
		return true;
	}
}
