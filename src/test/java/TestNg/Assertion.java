package TestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import junit.framework.Assert;



public class Assertion {
	
@Test
	public void setup()
	{
		String exp="MakeMyTrip - #1 Travel Website 50% OFF on Hotels, Flights & Holiday";
		System.setProperty("webdriver.chrome.driver",
				"G:\\software\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

	  	WebDriver driver = new ChromeDriver();
	  	
	  	driver.get("https://www.makemytrip.com/");
	  	driver.manage().window().maximize();
	
		
	String actual=driver.getTitle();
	System.out.println(actual);
Assert.assertEquals(exp, actual);
	
	}
	

}
