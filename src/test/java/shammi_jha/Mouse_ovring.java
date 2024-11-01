package shammi_jha;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_ovring {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver",
				"G:\\software\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.flipkart.com/");
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[contains(text(),'Fashion')]")).click();
		WebElement fash=driver.findElement(By.xpath("//span[contains(text(),'Fashion')]"));
		
	Actions act=new Actions(driver);
	act.moveToElement(fash).build().perform();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//a[normalize-space()='Women Ethnic']")).click();
	driver.navigate().back();
	WebElement electro =driver.findElement(By.xpath("//div[@aria-label='Electronics']"));
		act.moveToElement(electro).build().perform();
		driver.findElement(By.xpath("//a[normalize-space()='Cameras & Accessories']")).click();
		
		act.contextClick(electro).build().perform();
		
		

	}

}
