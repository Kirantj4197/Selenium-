package day5;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActions {
	

	

	public static void main(String[] args)
	{
	
System.setProperty("webdriver.chrome.driver","D:\\chromedriver-win64\\chromedriver.exe");
	

	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
   driver.get("https://text-compare.com/");
   Actions action=new Actions(driver);
   

driver.findElement(By.cssSelector("#inputText1")).sendKeys("kirantj4197");


  action.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).perform();
  
  action.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).perform();
  
  action.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
  
  action.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).perform();

  


  
  
  
}
	
	
}
