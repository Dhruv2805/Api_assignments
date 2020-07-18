package org.testing.BaseClass;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;



import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeMethod;


public class Browser_Launch 
{
	
	public ChromeDriver driver;
	public Properties pr;
	
	@BeforeMethod
	public void beforemethod() throws IOException
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sushma\\Desktop\\chrome_version_83_selenium_driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		System.out.println("before method successfully run TC1");
		
		File f=new File("../YT_framework/Locators.properties");
		FileReader fr=new FileReader(f);
		pr=new Properties();
		pr.load(fr);
		
	}
	
	
	
	@AfterMethod
	public void aftermethod()
	{
		//driver.close();
		System.out.println("after method successfully run TC1");
	}
	
}
