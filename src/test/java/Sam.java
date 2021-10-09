import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


public class Sam {

		public  void main(String[] args) {
	
			System.setProperty("webdriver.chrome.driver", "C:\\\\Final chrome\\\\chromedriver.exe");
		
			WebDriver driver=new ChromeDriver();
			driver.get("https://the-internet.herokuapp.com/login");
			
			//WebDriverWait wait=new WebDriverWait(driver,30);
			driver.findElement(By.xpath("//input[@type='text']")).sendKeys("tomsmith");
			driver.findElement(By.xpath("//input[@type='password']")).sendKeys("SuperSecretPassword!");
driver.findElement(By.xpath("//i[@class='fa fa-2x fa-sign-in']")).click();
Assert.assertEquals(driver.findElement(By.xpath("//div[@class='flash success']")).isDisplayed();
Assert.assertEquals(driver.findElement(By.xpath("//i[@class='button secondary radius']"))
}}
