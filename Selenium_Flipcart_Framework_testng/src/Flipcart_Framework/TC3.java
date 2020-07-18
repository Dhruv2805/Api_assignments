package Flipcart_Framework;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TC3 
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
	WebElement menu=driver.findElement(By.xpath("//*[text()='DHRUV']"));
	menu.click();
	Actions ac=new Actions(driver);
	for(int i=0;i<2;i++)
	{
		ac.sendKeys(Keys.TAB).perform();
	}
	ac.sendKeys(Keys.ENTER).perform();
	}
}
