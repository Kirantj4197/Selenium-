package day1;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlers {
	
	public static void main(String[] args)
	{
	
	System.setProperty("webdriver.chrome.driver","D:\\chromedriver-win64\\chromedriver.exe");
	

	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
     driver.get("https://rahulshettyacademy.com/AutomationPractice/");
     driver.findElement(By.cssSelector("#opentab")).click();
     
     Set<String> windows=driver.getWindowHandles();
     
   /*Iterator<String> it=windows.iterator();
   
 
	   String parent=it.next();
	   String child=it.next();
	   
   driver.switchTo().window(child);
   System.out.println(driver.getTitle());
   
   driver.switchTo().window(parent);
   System.out.println(driver.getTitle());*/
     
     
     for(String s:windows)
     {
    	String title= driver.switchTo().window(s).getTitle();
    	if(title.equals("Practice Page") || title.equals("none"))
    	{
    		driver.close();
    		 
    	}
     }
     
  

     
  

	

     
	}
}
