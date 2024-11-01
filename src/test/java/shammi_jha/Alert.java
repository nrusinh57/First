package shammi_jha;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Alert {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"G:\\software\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://demoqa.com/alerts");
		driver.findElement(By.xpath("//button[@id='alertButton']")).click();
		Thread.sleep(5000);
		System.out.println(driver.switchTo().alert().getText());
		String exp="You clicked a button";
		Assert.assertEquals(driver.switchTo().alert().getText(), exp);
		System.out.println("Assert Text Verified");
		driver.switchTo().alert().accept();
		driver.navigate().refresh();
		driver.findElement(By.xpath("//*[@id='confirmButton']")).click();
		Thread.sleep(5000);
		driver.switchTo().alert().dismiss();
		System.out.println("Desline");
		driver.close();
		

	}

}
