package selenium_practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Generic_task2_visb_sign_up_automate
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Sushma\\\\Desktop\\\\chrome_version_81_selenium_driver\\\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		WebElement firstname=driver.findElement(By.id("u_0_m"));
		firstname.sendKeys("dhruv");
		
		WebElement Surname=driver.findElement(By.name("lastname"));
		Surname.sendKeys("sharma");
		
		WebElement Mobile_number=driver.findElement(By.cssSelector("input#u_0_r"));
		Mobile_number.sendKeys("1234567898");
		
		WebElement password=driver.findElement(By.cssSelector("input#u_0_w"));
		password.sendKeys("singup@uto1"); 
		
		//GENERIC METHOD
		
		generic_sign_up_automate gsa=new generic_sign_up_automate();
		
		WebElement day=driver.findElement(By.id("day"));
		gsa.dropdown_visibletext_selection(day, "28");
		
		WebElement month=driver.findElement(By.id("month"));
		gsa.dropdown_visibletext_selection(month, "May");
		
		WebElement Year=driver.findElement(By.cssSelector("select[title='Year']"));
		gsa.dropdown_visibletext_selection(Year, "1994");
		
		WebElement male=driver.findElement(By.id("u_0_7"));
		male.click();
		
	}
	
	public void dropdown_visibletext_selection(WebElement dropdownelement,String visibletext)
	{
		Select sel2=new Select(dropdownelement);
		sel2.selectByVisibleText(visibletext);
	}
	

	
	
	

}
