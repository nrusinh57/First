package shammi_jha;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"G:\\software\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		// driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		driver.get("https://www.facebook.com/");

		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		List<WebElement> day = driver.findElements(By.xpath("//select[@name='birthday_day']/option"));

		System.out.println("lisdt of day " + day.size());
		day.get(19).click();

		List<WebElement> month = driver.findElements(By.xpath("//select[@id='month']/option"));
		System.out.println("total month is " + month.size());
		String exp = "aug";

		for (int i = 0; i < month.size(); i++) {
			if (month.get(i).getText().equalsIgnoreCase(exp)) {
				month.get(i).click();

				break;

			}
		}
		List<WebElement> year = driver.findElements(By.xpath("//select[@name='birthday_year']/option"));
		System.out.println("total year is" + year.size());
		String e = "1992";
		for (int i = 0; i < year.size(); i++) {
			if (year.get(i).getText().equalsIgnoreCase(e)) {
				year.get(i).click();
				System.out.println(e);
				break;

			}

		}
	}
}
