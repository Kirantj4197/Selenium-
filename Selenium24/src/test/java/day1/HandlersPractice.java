package day1;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlersPractice {
	
	public static void main(String[] args)
	{
	
	System.setProperty("webdriver.chrome.driver","D:\\chromedriver-win64\\chromedriver.exe");
	

	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
    
    driver.get("https://testautomationpractice.blogspot.com/");
    
    driver.findElement(By.cssSelector(".wikipedia-search-input")).sendKeys("selenium");
    driver.findElement(By.xpath("//input[@class='wikipedia-search-button']")).click();
    
  List<WebElement> elements= driver.findElements(By.cssSelector("div #wikipedia-search-result-link a"));
  
  for(WebElement w:elements)
  {
	
	  w.click();
	 
  }
  
  Set<String> wins=driver.getWindowHandles();
  
  for(String str:wins)
  {
	  String tit=driver.switchTo().window(str).getTitle();
	  System.out.println(tit);
	  
	 
	  if(tit.equals("Selenium - Wikipedia") || tit.equals("Selenium in biology - Wikipedia"))
	  {
		  driver.close();
	  }
  }
  
    
    
    
    
     
     
     
     
 
   
 
	
  

     
  

	

     
	}
}
