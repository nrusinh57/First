package shammi_jha;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Incognito {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options= new ChromeOptions();
		options.addArguments("--incognito");
		 WebDriverManager.chromedriver().setup();
	WebDriver driver =new ChromeDriver(options);
		driver.get("https://www.youtube.com/");
		

	}

}
