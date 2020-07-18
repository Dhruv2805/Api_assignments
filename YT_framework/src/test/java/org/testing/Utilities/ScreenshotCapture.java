package org.testing.Utilities;import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotCapture 
{
	
	public static void TakescreenShot(ChromeDriver driver,String destination_location) throws IOException
	{
		
	File srcFile_location=driver.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(srcFile_location, new File(destination_location));
	
	}
}
