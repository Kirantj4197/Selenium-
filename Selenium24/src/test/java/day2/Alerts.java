package day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Alerts {
	
	
	public static void main(String[] args)
	{
	
System.setProperty("webdriver.chrome.driver","D:\\chromedriver-win64\\chromedriver.exe");
	

	
	WebDriver driver=new ChromeDriver();
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    
    driver.get("https://testpages.herokuapp.com/styled/alerts/alert-test.html");
    

    driver.findElement(By.cssSelector("input[value='Show alert box']")).click();
    
   Alert alert= wait.until(ExpectedConditions.alertIsPresent());
   System.out.println(alert.getText());
   alert.accept();
   
    
  /*Alert al=  driver.switchTo().alert();
  System.out.println(al.getText());
  al.accept();
  
  driver.findElement(By.cssSelector("#confirmexample")).click();
  
  Alert acc=driver.switchTo().alert();*/

    
    
    
    
	}
}
