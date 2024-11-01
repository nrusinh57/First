package shammi_jha;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radio {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"G:\\software\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		/*List<WebElement> radio_button =driver.findElements(By.xpath ("//input[@type='radio']"));

		System.out.println("Total number of radio button is==="+radio_button.size());
		System.out.println(radio_button.get(0).isDisplayed());
		System.out.println(radio_button.get(1).isDisplayed());
		System.out.println(radio_button.get(2).isDisplayed());
		
	radio_button.get(0).click();
	Thread.sleep(2000);
	radio_button.get(1).click();
	Thread.sleep(2000);
	radio_button.get(2).click();
*/	
		List<WebElement> radio_button1 =driver.findElements(By.xpath ("//input[@type='radio']"));
		String exp="Female";
		for(int i=0;i<radio_button1.size();i++) {
		if (radio_button1.get(i).getText().equalsIgnoreCase(exp)){
			radio_button1.get(i).click();

		System.out.println(exp+"Clicked" );
		break;
		}
	}
	
	} 
}

