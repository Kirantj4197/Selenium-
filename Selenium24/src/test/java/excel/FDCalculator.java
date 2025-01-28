package excel;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FDCalculator {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver-win64\\chromedriver.exe");
		

		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
	    driver.get("https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india/fixed-deposit-calculator-SBI-BSB001.html");
	    
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[class='wzrk-button-container']")));
	    driver.findElement(By.cssSelector("#wzrk-cancel")).click();
	    String path=System.getProperty("user.dir")+"\\testData\\calculator.xlsx";
	    int rows=ExcelUtils.getRowCount(path,"Sheet1");
	    
	    for(int i=1;i<=rows;i++)
	    {
	    	String prin=ExcelUtils.getCellData(path, "Sheet1", i, 0);
	    	String roi=ExcelUtils.getCellData(path, "Sheet1", i, 1);
	    	String per1=ExcelUtils.getCellData(path, "Sheet1", i, 2);
	    	String per2=ExcelUtils.getCellData(path, "Sheet1", i, 3);
	    	String fre=ExcelUtils.getCellData(path, "Sheet1", i, 4);
	    	String exp_maturity=ExcelUtils.getCellData(path, "Sheet1", i, 5);
	    	
	    	driver.findElement(By.cssSelector("#principal")).sendKeys(prin);
	    	driver.findElement(By.cssSelector("#interest")).sendKeys(roi);
	    	driver.findElement(By.cssSelector("#tenure")).sendKeys(per1);
	    	WebElement drpDown=driver.findElement(By.cssSelector("select[name='tenurePeriod']"));
	    	
	    	Select s=new Select(drpDown);
	    	s.selectByVisibleText(per2);
	    	
	    	WebElement frequency=driver.findElement(By.cssSelector("select[name='frequency']"));
	    	
	    	Select sel=new Select(frequency);
	    	sel.selectByVisibleText(fre);
	    	driver.findElement(By.xpath("//div[@class='cal_div']//a[1]")).click();
	    	
	   String act_maturity=driver.findElement(By.xpath("//span[@class='gL_27']//strong")).getText();
	   
	   if(Double.parseDouble(act_maturity)==Double.parseDouble(exp_maturity))
	   {
		   System.out.println("passed");
		   ExcelUtils.setCellData(path,"Sheet1" ,i,7,"Passed");
		  ExcelUtils.fillGreenColor(path,"Sheet1",i,7);
		   
	   }
	   
	   else
	   {
		   System.out.println("failed");
		   ExcelUtils.setCellData(path,"Sheet1" ,i,7,"Failed");
		  ExcelUtils.fillRedColor(path,"Sheet1",i,7);
		   
	   }
	   

	   driver.findElement(By.xpath("//img[@class='PL5']")).click();
	    }
	    
	    driver.quit();
	    
	  

	}

}
