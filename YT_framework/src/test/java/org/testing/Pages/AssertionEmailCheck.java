package org.testing.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssertionEmailCheck 
{
	public static String Actual_Email(ChromeDriver driver) throws InterruptedException
	{
		Thread.sleep(1000);	
		WebElement avatar_btn_signout=driver.findElement(By.id("avatar-btn"));
		avatar_btn_signout.click();
		Thread.sleep(1000);	
		WebElement actual_email=driver.findElement(By.xpath("//yt-formatted-string[@id='email']"));
		String Actual_email_id=actual_email.getText();
		System.out.println("actual email text is "+Actual_email_id);
		
		return Actual_email_id;
		
	}
}
