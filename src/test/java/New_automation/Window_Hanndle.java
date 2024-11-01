package New_automation;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_Hanndle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"G:\\software\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

	  	WebDriver driver = new ChromeDriver();
	  	
	  	driver.get("https://www.salesforce.com/in/?ir=1https://www.salesforce.com/in/?ir=1");
	  	driver.manage().window().maximize();
	  	driver.findElement(By.xpath("//a[@aria-label='Start free trial: Try Salesforce Starter Suite for free.']")).click();
	  Set<String> windowshandle=driver.getWindowHandles();
	  
	  System.out.println(windowshandle);
	Iterator<String> iterator=  windowshandle.iterator();
	String parent =iterator.next();
	System.out.println(iterator);
	String child=iterator.next();
	System.out.println(child);
	driver.switchTo().window(child);
	driver.findElement(By.name("UserFirstName")).sendKeys("nrusinh");
	
	driver.findElement(By.name("UserLastName")).sendKeys("shinde");
	driver.switchTo().window(parent);
	
	}

}
