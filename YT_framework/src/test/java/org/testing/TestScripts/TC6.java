package org.testing.TestScripts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testing.Assertions.Assertion;
import org.testing.BaseClass.Browser_Launch;
import org.testing.Pages.AssertionEmailCheck;
import org.testing.Pages.Login;
import org.testing.Pages.Logout;
import org.testing.Pages.Video_click;
import org.testing.Utilities.Current_Date_Time;
import org.testing.Utilities.LogsCapture;
import org.testing.Utilities.ScreenshotCapture;
import org.testng.Assert;
import org.testng.annotations.Test;




public class TC6 extends Browser_Launch
{
	@Test(enabled = false)
	public void Testcase6() throws InterruptedException, IOException
	{
		String expected_url="https://www.youtube.com/feed/trending";
		String expected_email_id="dhruvhome2805@gmail.com";
		
		Login login=new Login(driver, pr);
		login.signin(driver, pr);
		
		LogsCapture.Takelogs("TC6", " TC6 LOGIN SUCCESFULLY");
		
		Current_Date_Time CDT=new Current_Date_Time();
		CDT.D_T();
		
		ScreenshotCapture.TakescreenShot(driver, "C:\\Users\\Sushma\\Desktop\\dhruv\\classes\\actual classes rec+assig\\framework_screenshot\\"+CDT+"TC6.png");

	
		Video_click Video_click=new Video_click(driver, pr);
		Video_click.Vclick(driver, pr);
		
	
	
		//	WebElement subscribe_button=driver.findElement(By.id("subscribe-button"));
		WebElement subscribe_button=driver.findElement(By.xpath("//*[text()='Subscribe']"));	//by xpath..innertext
		subscribe_button.click();
		
		Assert.assertTrue(Assertion.assertion(expected_url, driver.getCurrentUrl()));		//Assertion on Expected URL and Current URL
		
		String ActualEmailId=AssertionEmailCheck.Actual_Email(driver);
		Assert.assertTrue(Assertion.assertion(expected_email_id, ActualEmailId)); 		//Assertion on Expected email id and Actual email id
	
	
		
		Logout logout=new Logout(driver, pr);
		logout.signout(driver, pr);
		
		LogsCapture.Takelogs("TC6", " TC6 LOGOUT SUCCESFULLY");

	}

}
