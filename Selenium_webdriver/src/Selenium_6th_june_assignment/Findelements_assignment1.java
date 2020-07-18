package Selenium_6th_june_assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Findelements_assignment1 
{
	public static void main(String[] args)
	{
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sushma\\Desktop\\chrome_version_83_selenium_driver\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	
	List<WebElement> all=driver.findElements(By.cssSelector("input[type='text']"));
	
	all.get(0).sendKeys("dhruv");
	all.get(1).sendKeys("sharma");
	all.get(2).sendKeys("68881212");		//here we have individually given the value to the webelements using findelements approach		
	
	/*	for(WebElement a:all)
	{
		a.sendKeys("same_input");		//here we have  given the common value to the webelements using findelements approach	
	}	*/
	
	}	
}
