package selenium_practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.gargoylesoftware.htmlunit.javascript.host.Window;

//Element Locating Techniques(Element Locators) //
public class sign_up 
{
	public static void main(String[] args) 
	{
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sushma\\Desktop\\chrome_version_81_selenium_driver\\chromedriver.exe"); //2nd..we will set the chrome driver exe path
	//System.out.println("we are printing what property is in our browser driver" +System.getProperty("webdriver.chrome.driver"));////not needed now just for practise//
	ChromeDriver driver=new ChromeDriver();  //1st..first we will create a chrome driver object and then import ->org.openqa.selenium.chrome.ChromeDriver<- package
	
	//we can use maximize method1 with proper eleboration
	
/*	Options op=driver.manage();  //manage returned the object "op"
	org.openqa.selenium.WebDriver.Window w= op.window();  //by "op" object we called the window method and window method is also returning the object
	w.maximize(); // now maximize method used the window object  */
	
	//we can use maximize method2 with combined statement 
	
	driver.manage().window().maximize(); //3rd..here our browser will open with maximise-full screen mode//
	driver.get("https://www.facebook.com/"); //4th..here get method is using remote webdriver class to hit the URL which we want to open using chrome browser  
	
	//now we have reached our url site now we have to find the webelement uniquely
	
	/*  WebElement user=driver.findElement(By.id("u_0_m"));	//5th..here we have find a webelement uniquely by  unique id 
	user.sendKeys("dhruv"); 	//6th..here we will pass the value in "first name" field with help of unique id passing  */
	

/*	WebElement user=driver.findElement(By.name("email"));//5th..here we have find a webelement uniquely by  unique  name 
	user.sendKeys("dhruv1"); 	//6th..here we will pass the value in "first name" field with help of unique  name  passing */
	

	/* WebElement user=driver.findElement(By.className("inputtext login_form_input_box")); 	//5th..here we have find a webelement uniquely by  unique  name 
	user.sendKeys("dhruv123"); 		//6th..here we will pass the value in "first name" field with help of unique  name  passing */
	
	//identifying webelement using cssselector
	
	/* WebElement user=driver.findElement(By.cssSelector("input#u_0_m"));		//5th..here we have find a webelement uniquely by cssselector unique id 
	user.sendKeys("dhruv12");												//6th..here we will pass the value in "first name" field with help of cssselector unique class name  passing */
	
/*	WebElement user=driver.findElement(By.cssSelector("input#inputtext _58mg _5dba _2ph-"));		//5th..here we have find a webelement uniquely by cssselector unique id 
	user.sendKeys("dhruv5");																		//6th..here we will pass the value in "first name" field with help of cssselector unique  class name  passing */
	

	WebElement user=driver.findElement(By.cssSelector("input[class='inputtext _58mg _5dba _2ph-']"));		//5th..here we have find a webelement uniquely by cssselector unique attribute name 
	user.sendKeys("dhruv6");												//6th..here we will pass the value in "first name" field with help of cssselector unique attribute name   passing 
	
	
	//doubt class name is left to test with or without cssselectior and Tagname.ClassValue[attName='attValue'] is left
	} 
}
