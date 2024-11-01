package shammi_jha;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"G:\\software\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://paytm.com/");
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[normalize-space()='Sign In']")).click();
		int  frame =driver.findElements(By.tagName("iframe")).size();
	System.out.println("Total Frame is -"+frame);
	for (int i=0;i<frame;i++) {
		driver.switchTo().frame(i);
		
		driver.findElement(By.xpath("//a[@oauth-id='qrPrivacyPolicy']")).click();
		
	}
	}

}
