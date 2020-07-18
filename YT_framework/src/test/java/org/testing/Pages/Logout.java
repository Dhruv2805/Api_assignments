package org.testing.Pages;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Logout
{
	public ChromeDriver driver;
	public Properties pr;
	public Logout( ChromeDriver driver,Properties pr)
	{
		this.driver=driver;
		this.pr=pr;
	}
	public void signout(ChromeDriver driver,Properties pr) throws InterruptedException
	{
		Thread.sleep(1000);														//problm 1-necessary bcoz it was not able to click the signout using tab non modifier concept
		
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		WebElement avatar_btn_signout=driver.findElement(By.id("avatar-btn"));
		avatar_btn_signout.click();
		Thread.sleep(2000);
	//	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	//	WebElement signout=driver.findElement(By.id("endpoint"));
		WebElement signout=driver.findElement(By.id("avatar-btn"));
		Actions ac=new Actions(driver);
		for(int i=0;i<=5;i++)
		{
			ac.sendKeys(Keys.TAB).perform();
		}
			ac.sendKeys(Keys.ENTER).perform();		
			System.out.println("test method successfully run TC");		
	}
}
