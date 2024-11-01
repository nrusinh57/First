package New_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;

public class Mouse_overing {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"G:\\software\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

	  	WebDriver driver = new ChromeDriver();
	  	
	  	driver.get("https://www.flipkart.com/");
	  	driver.manage().window().maximize();
	  	driver.findElement(By.xpath("//span[contains(text(),'Fashion')]")).click();
	  	Thread.sleep(3000);
	  WebElement web=	driver.findElement(By.xpath("//a[@class='_1BJVlg _11MZbx']"));
	  	Actions action=new Actions(driver);
	  	
	  	action.moveToElement(web).click().perform();
	  	
	}

}