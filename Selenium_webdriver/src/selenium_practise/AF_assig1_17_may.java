package selenium_practise;



import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;


public  class AF_assig1_17_may 
{
	
	ChromeDriver driver;		/*we created web driver object like this  because by doing ->ChromeDriver driver= new ChromeDriver(); <- it is restricted to only before section only 
															and @test and @after can't use the driver object  */
	@Before
		public  void befo()
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sushma\\Desktop\\chrome_version_83_selenium_driver\\chromedriver.exe");
			driver= new ChromeDriver();
			driver.manage().window().maximize(); 
			driver.get("https://www.facebook.com/");
			System.out.println("before annotations executed properly");
		}
	
	@Test
		public  void test()
		{
			WebElement firstname=driver.findElement(By.id("u_0_m"));
			firstname.sendKeys("dhruv");
	
			WebElement Surname=driver.findElement(By.name("lastname"));
			Surname.sendKeys("sharma");
	
			WebElement Mobile_number=driver.findElement(By.cssSelector("input#u_0_r"));
			Mobile_number.sendKeys("1234567898");
	
			WebElement password=driver.findElement(By.cssSelector("input#u_0_w"));
			password.sendKeys("singup@uto1");
	
			//drop down webelement finding and calling//
	
			WebElement date=driver.findElement(By.id("day"));
			Select sel1=new Select(date);
			sel1.selectByIndex(28);
	
			WebElement month=driver.findElement(By.cssSelector("select#month"));
			Select sel2=new Select(month);
			sel2.selectByVisibleText("May");
	
			WebElement Year=driver.findElement(By.cssSelector("select[title='Year']"));
			Select sel3=new Select(Year);
			sel3.selectByValue("1994");
	
			WebElement sex=driver.findElement(By.id("u_0_7"));
			sex.click();
			System.out.println("test annotations executed properly");
		}
	
	@After
	public void afto()
	{
		System.out.println("after annotations executed properly");
		//driver.close();
	}
}
