package Flipcart_Framework;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TC1 
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
		WebElement search=driver.findElement(By.cssSelector("input[title='Search for products, brands and more']"));
		search.click();
			search.sendKeys("apple iphone 11 (black, 64 gb)");	
		
		Thread.sleep(1000);
		WebElement search_click=driver.findElement(By.xpath("//button[@class='vh79eN']"));
		search_click.click(); 
		
		Thread.sleep(1000);
		WebElement item_search=driver.findElement(By.xpath("//*[text()='Apple iPhone 11 (Black, 64 GB)']"));
		item_search.click();
		
		String	 current_window=driver.getWindowHandle();
		Set<String> all_window=driver.getWindowHandles();
		
		System.out.println("current url is "+driver.getCurrentUrl());
		
		for(String s:all_window)
		{
			driver.switchTo().window(s);
		}
		
		System.out.println("current url is "+driver.getCurrentUrl());
		
		Thread.sleep(1000);
		WebElement add_to_cart=driver.findElement(By.xpath("//*[@id='container']/div/div[3]/div[2]/div[1]/div[1]/div[2]/div/ul/li[1]/button"));
		add_to_cart.click(); 	
		
		Thread.sleep(10000);
	//	WebElement logout_search=driver.findElement(By.cssSelector("div[class='_14jSvk']"));
		WebElement logout_search=driver.findElement(By.xpath("//div[text()='DHRUV']"));
		logout_search.click();
		
	/*	Thread.sleep(1000);
		WebElement logout_search1=driver.findElement(By.xpath("//div[text()='DHRUV']"));
		Actions ac=new Actions(driver);	
		
		for(int i=0;i<=9;i++)
		{
			ac.sendKeys(Keys.TAB).perform();
		}
		ac.sendKeys(Keys.ENTER).perform();
		*/
	}
}
