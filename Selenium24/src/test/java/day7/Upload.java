package day7;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Upload {
	
	

	public static void main(String[] args)
	{
	
System.setProperty("webdriver.chrome.driver","D:\\chromedriver-win64\\chromedriver.exe");
	

	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    driver.get("https://www.davidwalsh.name/demo/multiple-file-upload.php");
    //driver.findElement(By.cssSelector("#filesToUpload")).sendKeys("D:\\ISTQB\\istqb - chapter 2.docx");
   //System.out.println(driver.findElement(By.xpath("//ul[@id='fileList']//li")).getText().equals("istqb - chapter 2.docx"));
   
   
   String file1="D:\\ISTQB\\istqb - chapter 2.docx";
   String file2="D:\\ISTQB\\istqb - chapter 3.docx";
   driver.findElement(By.cssSelector("#filesToUpload")).sendKeys(file1+"\n"+file2);
   
   
  
    
  
  

}
	
	
}
