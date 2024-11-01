package shammi_jha;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mause_over {
@SuppressWarnings("deprecation")
public static void main(String[] args) throws Exception {
	
	System.setProperty("webdriver.chrome.driver", "G:\\software\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	driver.get("https://www.google.co.in/");
	driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("Download jdk8");
	Thread.sleep(5000);
	
	List<WebElement> allserach	 = driver.findElements(By.xpath("//div[@class='eIPGRd']"));
	Thread.sleep(5000);
	
				for(int i =0;i<allserach.size();i++) {
		
		
			String allsearchtext  =allserach.get(i).getText();
			String exp="download jdk 8 zip";
			
			if(allsearchtext.equalsIgnoreCase(exp)){
				allserach.get(i).click();
				break;
			}
	
	}
}
}
