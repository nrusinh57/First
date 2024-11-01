package shammi_jha;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_table {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"G:\\software\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://money.rediff.com/losers");
		Thread.sleep(5000);
		List<WebElement> comp = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[1]/a"));
		System.out.println("total company availebale in table is:-" + comp.size());
		List<WebElement> mutualvalue = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[4]"));
		System.out.println("total mutual availebale in table is:-" + mutualvalue.size());

		String exp = "GTL LTD.";
		for (int i = 0; i < comp.size(); i++) {
			if (comp.get(i).getText().equalsIgnoreCase(exp))
				
			{
				comp.get(i).click();
				System.out.println( mutualvalue);
				break;
			}

		}

	}
}
