package selenium_practise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.ClickAction;
import org.openqa.selenium.support.ui.Select;

import com.thoughtworks.selenium.webdriven.commands.Click;

public class automate_sign_up 
{
	public static void main(String[] args)
	{
		
	
	System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Sushma\\\\Desktop\\\\chrome_version_83_selenium_driver\\\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	
//	driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
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
	
	WebElement male=driver.findElement(By.id("u_0_7"));
	male.click();
	
	driver.close();
	
	}
}
