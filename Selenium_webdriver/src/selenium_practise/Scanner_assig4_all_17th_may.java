package selenium_practise;

import java.util.Scanner;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Scanner_assig4_all_17th_may 
{
	
	 ChromeDriver driver;
	 Scanner sc;		//declared scanner object globally	
	 String visibletext;	
	 String value;	
	@Before
	public void befo()
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sushma\\Desktop\\chrome_version_83_selenium_driver\\chromedriver.exe");
		 driver=new ChromeDriver();		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		System.out.println("before annotations executed properly");	 										
	}
	
	@Test
	public void test()
	{			
	
		WebElement firstname=driver.findElement(By.id("u_0_m"));
		sc=new Scanner(System.in);								//declared the statement once which will be used in every webelement method without writing it again 	
		System.out.println("enter the firstname ");
		String fname=sc.nextLine();
		firstname.sendKeys(fname);
		
		WebElement Surname=driver.findElement(By.name("lastname"));
		System.out.println("enter the Surname ");
		String sname=sc.nextLine();
		Surname.sendKeys(sname);
		
		WebElement Mobile_number=driver.findElement(By.cssSelector("input#u_0_r"));
		System.out.println("enter the Mobile_number ");
		String mobnumb=sc.nextLine();
		Mobile_number.sendKeys(mobnumb);
		
		WebElement password=driver.findElement(By.cssSelector("input#u_0_w"));
		System.out.println("enter the password ");
		String pswd=sc.nextLine();
		password.sendKeys(pswd); 
		
		//GENERIC METHOD
		
		Scanner_assig4_all_17th_may sga=new Scanner_assig4_all_17th_may();
		
		WebElement day=driver.findElement(By.id("day"));
		sga.dropdown_index_selection(day, "28");
		
		WebElement month=driver.findElement(By.id("month"));
		sga.dropdown_visibletext_selection(month, "May");
		
		WebElement Year=driver.findElement(By.cssSelector("select[title='Year']"));
		sga.dropdown_value_selection(Year, "1994");
		
		WebElement sex=driver.findElement(By.id("u_0_7"));
		sex.click();
		System.out.println("test annotations executed properly");
	}
	
		public void dropdown_index_selection(WebElement dropdownelement,String index)
		{
			Select sel1=new Select(dropdownelement);
			sel1.selectByVisibleText(index);
		} 
	
			public void dropdown_visibletext_selection(WebElement dropdownelement,String visibletext)
		{
			Select sel2=new Select(dropdownelement);
			sel2.selectByVisibleText(visibletext);
		}	
		public void dropdown_value_selection(WebElement dropdownelement,String value)
		{
				Select sel3=new Select(dropdownelement);
				sel3.selectByVisibleText(value); 
		} 
	

@After
		public void afo()
	{
	System.out.println("after annotations executed properly");
	//	driver.close();

	}

}
