package shammi_jha;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Send_text {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"G:\\software\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		// driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		driver.get("https://www.facebook.com/");

		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		driver.findElement(By.xpath("//input[@data-type='text'] [@name='firstname']")).sendKeys("nrusinh");
		driver.findElement(By.xpath("//input[@data-type='text'] [@name='lastname']")).sendKeys("shinde");
		driver.close();
	}

}
