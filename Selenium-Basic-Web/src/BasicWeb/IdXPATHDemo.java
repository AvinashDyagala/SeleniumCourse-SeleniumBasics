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
		driver.findElement(By.className("close-button")).click();
		driver.findElement(By.linkText("Sign In")).click();

//		driver.findElement(By.xpath("//button[@class='close-button']")).click();
//		driver.findElement(By.xpath("//a[text()='Sign In']")).click();
//		driver.findElement(By.className("our-story-cta")).click();
//		driver.findElement(By.className("authlinks")).click();
//		driver.findElement(By.xpath("//button[@type='submit']")).click();
//		/html/body/div[1]/div/div/div/div/div/div[2]/div[1]/div[2]/form/div/div/div/div/div/button
	}
}