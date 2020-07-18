package Selenium24th_may_assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Automate_signup_using_xpath_relative
{
	public static void main(String[] args)
	{
		
	
	System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Sushma\\\\Desktop\\\\chrome_version_83_selenium_driver\\\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	
	WebElement firstname=driver.findElement(By.xpath("//input[@id='u_0_m']"));		//relative xpath --tag with attribute
	firstname.sendKeys("dhruv");
	
	WebElement Surname=driver.findElement(By.xpath("//input[@id='u_0_o' and @name='lastname']"));						//relative xpath --tag with attribute + AND CONDITION
	Surname.sendKeys("sharma");
	
	WebElement Mobile_number=driver.findElement(By.xpath("//input[@id='u_0_r' or @name='reg_###']"));					//relative xpath --tag with attribute + OR CONDITION
	Mobile_number.sendKeys("1234567898");
	
	WebElement password=driver.findElement(By.xpath("//*[@id='u_0_w']"));												//relative xpath --dynamic tag with attribute
	password.sendKeys("singup@uto1");
	
	//drop down webelement finding and calling//
	
	WebElement date=driver.findElement(By.xpath("//select[@*='day']"));											//relative xpath --tag with dynamic  attribute name
	Select sel1=new Select(date);
	sel1.selectByIndex(28);
	
	WebElement month=driver.findElement(By.xpath("//select[@*='month']"));										//relative xpath --tag with dynamic  attribute name
	Select sel2=new Select(month);
	sel2.selectByVisibleText("May");
	
	WebElement Year=driver.findElement(By.xpath("//select[@*='year']"));
	Select sel3=new Select(Year);
	sel3.selectByValue("1994");
	
	////relative xpath --Parent child relationship
	WebElement male=driver.findElement(By.xpath("//span[@id='u_0_z']/span/input[@id='u_0_7']"));
	male.click();
	
	//driver.close();
	
	}

}
