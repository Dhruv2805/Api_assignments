package org.testing.Pages;


import java.util.List;
import java.util.Properties;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Video_click 
{
	public ChromeDriver driver;
	public Properties pr;
	
	public Video_click(ChromeDriver driver,Properties pr)
	{
		this.driver=driver;
		this.pr=pr;
	}
	public void Vclick(ChromeDriver driver,Properties pr)
	{
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		
		List<WebElement> all_video =driver.findElements(By.id("video-title"));
		int length=all_video.size();
		System.out.println("video size is : "+all_video.size());
		all_video.get(4).click();
		
	/*	Actions ac=new Actions(driver);
		for(WebElement i:all_video)
		{
			ac.keyDown(Keys.CONTROL).click(i).keyUp(Keys.CONTROL).build().perform();
		}	*/
		
	}
}
