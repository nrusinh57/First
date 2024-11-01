package shammi_jha;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Check_list {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"G:\\software\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		

		driver.get("https://testautomationpractice.blogspot.com/");
	

		driver.manage().window().maximize();
		Thread.sleep(5000);
		List<WebElement> checkbox = driver.findElements(By.xpath("//*[@type='checkbox'] [@class='form-check-input']"));
		System.out.println("total number of list box is-" + checkbox.size());
		
		for (int i = 0; i < checkbox.size(); i++) {
			
				
			
				checkbox.get(i).click();
			
			
				
		}

	}}


