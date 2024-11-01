package New_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Auto_sugestionhandle {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"G:\\software\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://paytm.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[normalize-space()='From']")).click();

		Thread.sleep(5000);
		WebElement from = driver.findElement(By.xpath("//input[@id='text-box']"));
		Thread.sleep(5000);
		from.sendKeys(Keys.CONTROL+"A");
		Thread.sleep(2000);
		from.sendKeys(Keys.BACK_SPACE);

		Thread.sleep(5000);

		from.sendKeys("mumbai");
		Thread.sleep(2000);
		from.sendKeys(Keys.ARROW_DOWN);
		from.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
	}

}
