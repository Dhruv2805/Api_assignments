package Selenium_6th_june_assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Findelements_practise 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sushma\\Desktop\\chrome_version_83_selenium_driver\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
	//	Thread.sleep(10000);
		driver.get("https://www.youtube.com/");
		
	
		List<WebElement> all_videos=driver.findElements(By.id("video-title"));
		System.out.println("page video size "+all_videos.size());
		//all_videos.get(4).click();
		
		
		
	}
}
