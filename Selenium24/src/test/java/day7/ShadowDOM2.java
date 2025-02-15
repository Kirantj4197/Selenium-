package day7;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ShadowDOM2 {
	
	

	public static void main(String[] args) throws InterruptedException
	{
	
System.setProperty("webdriver.chrome.driver","D:\\chromedriver-win64\\chromedriver.exe");
	

	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    driver.get("https://www.airindia.com/");
   
   driver.findElement(By.cssSelector("button[id='onetrust-accept-btn-handler']")).click();
   



  

    
  //This Element is inside single shadow DOM.
    //String cssSelectorForHost1 = "ai-radio-group[class='hydrated']";
    //Thread.sleep(1000);
    SearchContext shadow = driver.findElement(By.cssSelector("ai-radio-group[class='hydrated']")).getShadowRoot();
    Thread.sleep(1000);
    shadow.findElement(By.cssSelector("label[for='radio0']")).click();
  
    
  
  

}
	
	
}
