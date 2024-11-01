package New_automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import common.Baseclass;

public class Radio_button extends Baseclass {
	@Test
	public void radio() throws Exception {
		List<WebElement> radio = driver.findElements(By.xpath("//input[@type='radio']"));
		Thread.sleep(5000);
		System.out.println("total radio button is -" + radio.size());

		radio.get(2).click();
	}
		
	
	@Test
	public void name() throws InterruptedException {
driver.findElement(By.name("firstname")).sendKeys("nrusinh");
Thread.sleep(2000);
driver.findElement(By.name("lastname")).sendKeys("shinde");
Thread.sleep(2000);
	driver.findElement(By.name("reg_email__")).sendKeys("9890953001");
	Actions action =new Actions(driver);
	action.contextClick().perform();
	
	
	}
	
}