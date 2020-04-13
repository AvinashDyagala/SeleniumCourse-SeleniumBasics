package BasicWeb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IdXPATHDemo {

	public static void main(String[] args) {
		WebDriver driver;
    	System.setProperty("webdriver.gecko.driver", 
				"/Selenium-3.141.59/geckodriver.exe");		
		driver = new FirefoxDriver();
		String baseURL = "http://www.netflix.com";
		driver.manage().window().maximize();
		driver.get(baseURL);
		
		driver.findElement(By.id("id_email")).sendKeys("adyagala7911@gmail.com");
		driver.findElement(By.xpath("//button[@class='close-button']")).click();
		driver.findElement(By.xpath("//a[text()='Sign In']")).click();
	}
}