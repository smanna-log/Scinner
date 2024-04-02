package base;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

	public static WebDriver driver;
	
	public static Properties prop = new Properties();
	public static Properties loc = new Properties();
	public static Properties loc2 = new Properties();
	public static FileReader fr;
	public static FileReader fr1;
	public static FileReader fr2;

	@BeforeTest
	public static void setup() throws IOException, InterruptedException {

		if(driver==null) {
			fr = new FileReader(System.getProperty("user.dir")+"/src/test/resources/configfiles/config.properties");
			fr1 = new FileReader(System.getProperty("user.dir")+"/src/test/resources/configfiles/locators.properties");	
			fr2 = new FileReader(System.getProperty("user.dir")+"/src/test/resources/configfiles/locators2.properties");
			//home/wadmin/eclipse-workspace/Scinner_Framework/src/test/resources/configfiles/locators2.properties
			prop.load(fr);
			loc.load(fr1);
			loc2.load(fr2);
		}

		if(prop.getProperty("browser").equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(prop.getProperty("testurl"));
//			driver.findElement(By.xpath(loc2.getProperty("check_box_18+"))).click();
//			Thread.sleep(4000);
//			driver.findElement(By.xpath(loc2.getProperty("yes_I_am_over18+_button"))).click();
//			Thread.sleep(6000);
		}
		else if(prop.getProperty("browser").equalsIgnoreCase("chrome"))	{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get(prop.getProperty("testurl"));
		}




	}

	@AfterMethod

	public void screenshot(ITestResult res) throws Exception {
		
	        Thread.sleep(2000);
	        if (res.getStatus()==ITestResult.FAILURE){
	        	Listeners.capture(driver);
	        }
	    }
    

	@AfterTest
	public void tearDown() {	

		driver.close();

	} 

	



}
