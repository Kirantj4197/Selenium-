package day4;

import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Tables {
	
	
	public static void main(String[] args)
	{
	
System.setProperty("webdriver.chrome.driver","D:\\chromedriver-win64\\chromedriver.exe");
	

	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    driver.get("https://testautomationpractice.blogspot.com/");
    
    
  List<WebElement> rows=  driver.findElements(By.xpath("//table[@name='BookTable']//tr"));
  
  
  for(int i=2;i<rows.size();i++)
  {
	  
	 List<WebElement> col= driver.findElements(By.xpath("//table[@name='BookTable']//tr["+i+"]//td"));
	 
	 String BookName=col.get(0).getText();
	 String Author=col.get(1).getText();
	 String Subject=col.get(2).getText();
	 String Price=col.get(3).getText();
	 
	 System.out.println(BookName + "\t" + Author + "\t" + Subject + "\t" + Price);
	 
	  if (Author.equals("Mukesh")) {
          System.out.println("Book by Mukesh: " + BookName + ", Subject: " + Subject + ", Price: " + Price);
      }
  }
  
int total=0;
    
for(int ran=2;ran<=rows.size();ran++)
{
	
	total+=Integer.parseInt(driver.findElement(By.xpath("//table[@name='BookTable']//tr["+ran+"]//td[4]")).getText());
}
   
System.out.println(total);
   


   
   
	
	
	
    
	}
	
}
