package New_automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Setup_browser {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"G:\\software\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

	  	WebDriver driver = new ChromeDriver();
	  	
	  	driver.get("https://www.makemytrip.com/");
	  	driver.manage().window().maximize();
	  	
	}

}
