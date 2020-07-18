package selenium_practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class drop_down 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Sushma\\\\Desktop\\\\chrome_version_81_selenium_driver\\\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		 WebElement drop=driver.findElement(By.cssSelector("select#month"));
		 Select sel=new Select(drop);		//drop down lies in the select tag so we used select class and created its object
		 //three appraoches to pass value of drop down webelement ..all are working fine
		 
		// sel.selectByIndex(11);    
		//  sel.selectByValue("7");
		// sel.selectByVisibleText("Jan");
	}
}

