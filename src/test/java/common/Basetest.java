package common;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Basetest {

	public static WebDriver driver;
	public static Properties pro = new Properties();
	public static Properties loc = new Properties();
	public static FileReader fr;
	public static FileReader fr1;

	@BeforeMethod
	public void setup() throws IOException {
		if (driver == null) {
			fr = new FileReader(
					"C:\\Users\\DELL\\eclipse-workspace\\First\\src\\test\\resources\\config\\config.proprerties");

			fr1 = new FileReader(
					"C:\\Users\\DELL\\eclipse-workspace\\First\\src\\test\\resources\\config\\loc.properties");
			pro.load(fr);
			loc.load(fr1);
		}
		if (pro.getProperty("browser").equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get(pro.getProperty("url"));
			driver.manage().window().maximize();
		}
		else if (pro.getProperty("browser").equalsIgnoreCase("firefox")) {
			WebDriverManager.chromedriver().setup();
			driver = new FirefoxDriver();
			driver.get(pro.getProperty("url"));
			driver.manage().window().maximize();
		}
	}

	@AfterMethod
	public void teardown() {
		driver.close();
		System.out.println("browser instance is closed");
	}

}
