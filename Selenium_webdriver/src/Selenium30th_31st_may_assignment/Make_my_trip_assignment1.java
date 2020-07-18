package Selenium30th_31st_may_assignment;

import org.junit.After;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class Make_my_trip_assignment1 
{
	
/*		ChromeDriver driver;
	@Before
	public void before()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sushma\\Desktop\\chrome_version_83_selenium_driver\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/flights/");
		System.out.println("before processed successfully");
	}
	
	@Test
	public void test1()
	{		
		
		
		WebElement from_place=driver.findElement(By.id("fromCity"));
		from_place.click();
		Actions ac=new Actions(driver);
		for(int i=1;i<=4;i++)
		{
			ac.sendKeys(Keys.ARROW_DOWN).perform();
		}
		ac.sendKeys(Keys.ENTER).perform();
		System.out.println("test1 processed successfully");
	}	
	@Test
	public void test2()
	{
		WebElement to_place=driver.findElement(By.cssSelector("input[id='toCity']"));
		to_place.click();
		Actions ac=new Actions(driver);
		for(int i=1;i<=2;i++)
		{
			ac.sendKeys(Keys.ARROW_DOWN).perform();
		}
		ac.sendKeys(Keys.ENTER).perform();
		System.out.println("test2 processed successfully");
	}	
	

	public void after()
	{
		System.out.println("after processed successfully");
	//	driver.close();
	}
}	*/
	//In annotations program problem is ..its showing from functioanlity in one tab and to city location in new tab so plz avoid. 
	
	public static void main(String[] args) {
				
			
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sushma\\Desktop\\chrome_version_83_selenium_driver\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/flights/");
		
	
		
		WebElement from_place=driver.findElement(By.id("fromCity"));
		from_place.click();
		Actions ac=new Actions(driver);
		for(int i=1;i<=4;i++)
		{
			ac.sendKeys(Keys.ARROW_DOWN).perform();
		}
		ac.sendKeys(Keys.ENTER).perform();
		

		WebElement to_place=driver.findElement(By.cssSelector("input[id='toCity']"));
		to_place.click();
		Actions ac1=new Actions(driver);
		for(int i=1;i<=2;i++)
		{
			ac1.sendKeys(Keys.ARROW_DOWN).perform();
		}
		ac1.sendKeys(Keys.ENTER).perform();
		
		
		ac.sendKeys(Keys.END).perform();
	
	}
	
}	
