package day5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop2 {
	
	

	public static void main(String[] args)
	{
	
System.setProperty("webdriver.chrome.driver","D:\\chromedriver-win64\\chromedriver.exe");
	

	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
   driver.get("https://demo.guru99.com/test/drag_drop.html");
  Actions act=new Actions(driver);
  
 
  WebElement bank=driver.findElement(By.xpath("//a[text()=' BANK ']"));
  WebElement amt=driver.findElement(By.xpath("//a[text()=' 5000 ']"));
  WebElement account=driver.findElement(By.cssSelector("ol#bank"));
  WebElement amount=driver.findElement(By.cssSelector("ol#amt7"));
  
  act.dragAndDrop(bank, account).perform();
  act.dragAndDrop(amt, amount).perform();
  
  System.out.println(driver.findElement(By.xpath("//tr//td//div[@id='t7']")).getText().equals("5000"));
  
  
}
	
	
}
