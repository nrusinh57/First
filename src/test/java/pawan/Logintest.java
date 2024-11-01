package pawan;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Logintest {
	WebDriver driver;

	@BeforeClass
	 public void setup() throws Exception {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.get("https://automationexercise.com/login");
		driver.manage().window().maximize();
		Thread.sleep(3000);

	}

	@Test
	public void login() {
		Loginpage lp = new Loginpage(driver);
		lp.setusername("nrusinh57@gmail.com");
		lp.setpassword("Sarkar@4149");
		lp.signin();
		Assert.assertEquals(driver.getCurrentUrl(), "https://automationexercise.com/");
	}

	@AfterTest
	public void teardown() {
		driver.close();
		System.out.println("Driver instance is closed");
	}
}
