package Selenium30th_31st_may_assignment;


import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.thoughtworks.selenium.webdriven.Windows;

public class Non_modifier_key_practise 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sushma\\Desktop\\chrome_version_83_selenium_driver\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		
		WebElement video=driver.findElement(By.id("video-title"));
		Actions ac=new Actions(driver);
		ac.keyUp(Keys.CONTROL).click(video).keyDown(Keys.CONTROL).build().perform();	//keys up --we are pressing the ctrl key,click --we are selecting our webelement,keys down--we are releasing the ctrl key after pressing.
																						//why build and perform method...bcoz..here we are performing multiple different action  eg.. control+click
		
		/*to solve one error (unable to go to playing video tab..we are using line 30 and 31 concept*/
		String current_window=driver.getWindowHandle();									//it will return the address of the focused  window---and return type of getwindowhandle is String
		Set<String> all_windows=driver.getWindowHandles();								//it will return the address of all window/tab and return type of getwindowhandles is Set<String>
		
		System.out.println("current url is "+driver.getCurrentUrl());
		
		for(String s:all_windows)
		{
			driver.switchTo().window(s);
		}
		System.out.println("after switching  url is "+driver.getCurrentUrl());
		
		driver.switchTo().window(current_window);		//tab will back again come  home page of youtube
		System.out.println("current url is "+driver.getCurrentUrl());
		
		
		
		
/*		for(int i=0;i<3;i++)
		{
	//	ac.sendKeys(Keys.TAB).perform();											//sendkey method used for non modifier keys
	 																				//here only perform method bcoz..we are performing single actions multiple times
		} 	*/
	}	
}
