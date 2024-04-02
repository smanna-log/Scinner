package base;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Listeners {
	
	public static void capture(WebDriver driver) throws Exception{
		//		Date d=new Date();
		//		String s=d.toString();
		//		String res=s.replace(":","-");

		

		LocalDateTime myDateObj = LocalDateTime.now();
		DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("ddMMyyyyHHmmss");
		String res = myDateObj.format(myFormatObj);
		
		TakesScreenshot tss= (TakesScreenshot) driver;
		File temp=tss.getScreenshotAs(OutputType.FILE);
		File per=new File("./photos/"+res+".png");
		try {
			FileHandler.copy(temp,per);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	//
	//	public static String screenshotsSubFolderName;
	//
	//	public void captureScreenshot(WebDriver driver) {
	//
	//		if (screenshotsSubFolderName == null) {
	//
	//			LocalDateTime myDateObj = LocalDateTime.now();
	//			DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("ddMMyyyyHHmmss");
	//			screenshotsSubFolderName = myDateObj.format(myFormatObj);
	//		}
	//
	//		TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
	//		File sourceFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
	//		File destFile = new File("/Scinner_Framework/Screenshots"+".png");
	//		try {
	//			FileUtils.copyFile(sourceFile, destFile);
	//		} catch (IOException e) {
	//			e.printStackTrace();
	//		}
	//		System.out.println("Screenshot saved successfully");
	//	}
	//}

	//public class Photo {

}






