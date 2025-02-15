package day7;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ShadowDOM {
	
	

	public static void main(String[] args) throws InterruptedException
	{
	
System.setProperty("webdriver.chrome.driver","D:\\chromedriver-win64\\chromedriver.exe");
	

	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    driver.get("https://books-pwakit.appspot.com/");
   
   
   
  //This Element is inside single shadow DOM.
   // String cssSelectorForHost1 = "book-app[apptitle='BOOKS']";
  //  Thread.sleep(1000);
    SearchContext shadow = driver.findElement(By.cssSelector("book-app[apptitle='BOOKS']")).getShadowRoot();
    Thread.sleep(1000);
    shadow.findElement(By.cssSelector("#input"));
    
  
  

}
	
	
}
