package day5;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OpenLinkInNewTab {
	

	

	public static void main(String[] args)
	{
	
System.setProperty("webdriver.chrome.driver","D:\\chromedriver-win64\\chromedriver.exe");
	

	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    driver.get("https://www.cricbuzz.com/");
    Actions act=new Actions(driver);
    
    WebElement link=driver.findElement(By.cssSelector("a[title='Live Cricket Score']"));
    
    act.keyDown(Keys.CONTROL).click(link).keyUp(Keys.CONTROL).perform();
    
    
 List<String> windows=new ArrayList(driver.getWindowHandles());
 
   driver.switchTo().window(windows.get(1));
   
   
   System.out.println(driver.findElement(By.xpath("//h1[text()='Live Cricket Score']")).getText());
  

  


  
  
  
}
	
	
}
