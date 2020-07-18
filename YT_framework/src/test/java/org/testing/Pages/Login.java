package org.testing.Pages;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Login 
{	
	public ChromeDriver driver;
	public Properties pr;
	
	public Login(ChromeDriver driver,Properties pr)
	{
		this.driver=driver;
		this.pr=pr;
	}
	
	public  void signin(ChromeDriver driver,Properties pr)
	{
		
		WebElement signin=driver.findElement(By.xpath(pr.getProperty("signin_click")));
		signin.click();
	
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement gmail_signin=driver.findElement(By.id(pr.getProperty("gmail_signin")));
		gmail_signin.sendKeys("dhruvhome2805@gmail.com");
	
		WebElement gmail_next=driver.findElement(By.cssSelector(pr.getProperty("gmail_next")));
		gmail_next.click();
	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);		//problm 1-necessary bcoz script is running fast so it was not accepting password to write

//**	WebElement gmail_password=driver.findElement(By.xpath("//input[@*='password']"));
		WebElement gmail_password=driver.findElement(By.name(pr.getProperty("gmail_password")));
		gmail_password.sendKeys("Dhruvhome");
	
		WebElement gmail_passwor_next=driver.findElement(By.cssSelector(pr.getProperty("gmail_passwor_next")));
		gmail_passwor_next.click();
	}

}
