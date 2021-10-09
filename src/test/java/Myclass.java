import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
  
public class Myclass {
     WebDriver driver;
       
     @BeforeTest
		public  void openBrowser() {
	
			System.setProperty("webdriver.chrome.driver", "C:\\\\Final chrome\\\\chromedriver.exe");
		
			driver=new ChromeDriver();
     }
       
     @Test
     
     public void enterData() {
    	 
    	 WebDriverWait wait=new WebDriverWait(driver,30);
			driver.get("https://www.google.com");
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.name("q"))));	
		driver.findElement(By.name("q")).sendKeys("testing");	
			
}

@AfterTest
  public void closeBrowser() {
	driver.close();
	
}
}
