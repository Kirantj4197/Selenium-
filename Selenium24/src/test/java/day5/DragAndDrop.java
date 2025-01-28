package day5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	
	

	public static void main(String[] args)
	{
	
System.setProperty("webdriver.chrome.driver","D:\\chromedriver-win64\\chromedriver.exe");
	

	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
   driver.get("https://testautomationpractice.blogspot.com/");
  Actions act=new Actions(driver);
  
 
 WebElement source=driver.findElement(By.cssSelector("#draggable")) ;
 WebElement target=driver.findElement(By.cssSelector("#droppable"));
    
 
 act.dragAndDrop(source, target).perform();
 
 System.out.println(driver.findElement(By.xpath("//p[text()='Dropped!']")).isDisplayed());

}
	
	
}
