package common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
	public static WebDriver driver;
	@BeforeSuite
	public void setup() {
 WebDriverManager.chromedriver().setup();
	
  driver = new ChromeDriver();
  	  driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
	}
	@AfterSuite
	public void closebroser() {
		driver.close();
	}
}
