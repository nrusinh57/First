package shammi_jha;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_handling {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"G:\\software\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.automationtesting.in/Alerts.html");
driver.manage().window().maximize();
driver.findElement(By.xpath("//a[normalize-space()='Alert with OK & Cancel']")).click();

driver.findElement(By.xpath("//button[normalize-space()='click the button to display a confirm box']")).click();
Thread.sleep(5000);
driver.switchTo().alert().accept();

driver.findElement(By.xpath("//a[normalize-space()='Alert with Textbox']")).click();
driver.findElement(By.xpath("//button[normalize-space()='click the button to demonstrate the prompt box']")).click();
Thread.sleep(8000);

driver.switchTo().alert().sendKeys("Nrusinh");
driver.switchTo().alert().accept();
}

}
