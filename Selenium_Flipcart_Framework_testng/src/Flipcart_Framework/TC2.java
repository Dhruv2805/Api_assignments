package Flipcart_Framework;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TC2
{
	public static void main(String[] args) throws InterruptedException 
	{
		
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sushma\\Desktop\\chrome_version_83_selenium_driver\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	
/*	Thread.sleep(1000);
	WebElement cross=driver.findElement(By.xpath("//button[text='✕']"));
	cross.click(); */
	
	WebElement email_number=driver.findElement(By.xpath("//input[@class='_2zrpKA _1dBPDZ']"));
	email_number.sendKeys("8800435663");
	
	WebElement password_login=driver.findElement(By.xpath("//input[@class='_2zrpKA _3v41xv _1dBPDZ']"));
	password_login.sendKeys("ssdn37420");
	
	WebElement submit=driver.findElement(By.xpath("//div[@class='_1avdGP']/button[@*='submit']"));
	submit.click();
	
	Thread.sleep(1000);
	WebElement electronics=driver.findElement(By.xpath("//span[text()='Electronics']"));
	electronics.click();
	
	Thread.sleep(1000);
	WebElement mi_section=driver.findElement(By.xpath("(//a[@title='Mi'])[1]"));
	 mi_section.click();
	
	 Thread.sleep(1000);
		//	WebElement logout_search=driver.findElement(By.cssSelector("div[class='_14jSvk']"));
			WebElement logout_search=driver.findElement(By.xpath("//div[text()='DHRUV']"));
			logout_search.click();
			
			Thread.sleep(1000);
			WebElement logout_search1=driver.findElement(By.xpath("//div[text()='DHRUV']"));
			Actions ac=new Actions(driver);	
			
			for(int i=0;i<=9;i++)
			{
				ac.sendKeys(Keys.TAB).perform();
			}
			ac.sendKeys(Keys.ENTER).perform();	
	
	}
}
