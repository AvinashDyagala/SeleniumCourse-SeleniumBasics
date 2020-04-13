package BasicWeb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import java.util.concurrent.TimeUnit;

public class ByXPATHConsolidated {
	public static void main(String[] args) throws Exception {
		WebDriver driver;
    	System.setProperty("webdriver.gecko.driver", 
				"/Selenium-3.141.59/geckodriver.exe");		
		driver = new FirefoxDriver();
		String baseURL = "http://www.freecrm.com";
		driver.manage().window().maximize();
		driver.get(baseURL);
		
		driver.findElement(By.xpath("//span[text()='Log In']")).click();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("avinash.dyagala@gmail.com");
		driver.findElement(By.xpath("//input[@name='password' and @type='password']")).sendKeys("Player@9802");
		driver.findElement(By.xpath("//div[text()='Login']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@id='main-nav']//a[@href='/contacts']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//td[text()='TestFname3 TestLname3']//parent::tr//preceding-sibling::td//div[@class='ui fitted read-only checkbox']")).click();		
//		driver.findElement(By.xpath("//td[text()='TestFname2 TestLname2']//parent::tr//preceding-sibling::td//div[@class='ui fitted read-only checkbox']")).click();		

	}
}
