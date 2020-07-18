package org.testing.TestScripts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testing.Assertions.Assertion;
import org.testing.BaseClass.Browser_Launch;
import org.testing.Pages.AssertionEmailCheck;
import org.testing.Pages.Login;
import org.testing.Pages.Logout;
import org.testing.Utilities.Current_Date_Time;
import org.testing.Utilities.LogsCapture;
import org.testing.Utilities.ScreenshotCapture;
import org.testng.Assert;
import org.testng.annotations.Test;



public class TC3 extends Browser_Launch
{

	@Test(enabled = false)
	public void Testcase3() throws InterruptedException, IOException
	{
		String expected_url="https://www.youtube.com/feed/trending";
		String expected_email_id="dhruvhome2805@gmail.com";
		
		Login login=new Login(driver, pr);
		login.signin(driver, pr);
	
		LogsCapture.Takelogs("TC3", " TC3 LOGIN SUCCESFULLY");
		
		Current_Date_Time CDT=new Current_Date_Time();
		CDT.D_T();
		
		ScreenshotCapture.TakescreenShot(driver, "C:\\Users\\Sushma\\Desktop\\dhruv\\classes\\actual classes rec+assig\\framework_screenshot\\"+CDT+"TC3.png");
		
		WebElement History=driver.findElement(By.xpath("//*[@title='History']"));		//by xpath..dynamic tag name 
		History.click();
		
		Assert.assertTrue(Assertion.assertion(expected_url, driver.getCurrentUrl()));		//Assertion on Expected URL and Current URL
		
		String ActualEmailId=AssertionEmailCheck.Actual_Email(driver);
		Assert.assertTrue(Assertion.assertion(expected_email_id, ActualEmailId)); 		//Assertion on Expected email id and Actual email id
	
		
		Logout logout=new Logout(driver, pr);
		logout.signout(driver, pr);
		
		LogsCapture.Takelogs("TC3", " TC3 LOGOUT SUCCESFULLY");

	}

}
