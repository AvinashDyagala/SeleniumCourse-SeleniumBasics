package BasicWeb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.remote.DesiredCapabilities;
//import static org.testng.Assert.*;
import org.testng.annotations.Test;
//import org.testng.*;
//import org.testng.annotations.AfterClass;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.BeforeMethod;

/**
 *
 * @author Avinash
 */
public class RunFireFox {
//    @SuppressWarnings("deprecation")
	@Test
    public static void RunTest() throws InterruptedException {
    	System.setProperty("webdriver.gecko.driver", 
				"/Selenium-3.141.59/geckodriver.exe");
        WebDriver driver;
//        DesiredCapabilities cap = DesiredCapabilities.firefox();
//        cap.setCapability("marionette", true);
        driver = new FirefoxDriver();

                
        String baseURL = "http://www.letskodeit.com/";
		try{
                    driver.get(baseURL);
                //    System.out.println("Testing here");
                }
		catch(Exception e){
                    System.out.println(e.getMessage());
                       }
		driver.findElement(By.id("i90scv3glabel")).click();
		driver.findElement(By.linkText("Practice")).click();
        Thread.sleep(3000);
        driver.quit();
    
    }
}