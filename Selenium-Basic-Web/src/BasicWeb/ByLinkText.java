package BasicWeb;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ByLinkText {

	public static void main(String[] args) throws Exception {
		WebDriver driver;
    	System.setProperty("webdriver.gecko.driver", 
				"/Selenium-3.141.59/geckodriver.exe");		
		driver = new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String baseURL = "https://letskodeit.teachable.com/";
		driver.get(baseURL);
		
		driver.findElement(By.linkText("Login")).click();
		Thread.sleep(10000);
		
		driver.findElement(By.partialLinkText("Forgot")).click();
	}
}