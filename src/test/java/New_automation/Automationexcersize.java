package New_automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import common.Basetest;

public class Automationexcersize extends Basetest {
	@Test(priority = 1)
	public void sign_up() throws Exception {
		driver.findElement(By.xpath("//a[@href='/login']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(loc.getProperty("name"))).sendKeys("nrusinh shinde");
		Thread.sleep(3000);

		driver.findElement(By.xpath(loc.getProperty("email"))).sendKeys("nrusinh57@gmail.com");

		Thread.sleep(3000);
		driver.findElement(By.xpath(loc.getProperty("signup"))).click();

		Thread.sleep(3000);
		driver.findElement(By.xpath(loc.getProperty("fname"))).sendKeys("Nrusinh");
		driver.findElement(By.xpath(loc.getProperty("lname"))).sendKeys("shinde");
		driver.findElement(By.xpath(loc.getProperty("psw"))).sendKeys("Sarkar@4149");
		driver.findElement(By.xpath(loc.getProperty("fname"))).sendKeys("Nrusinh");
		driver.findElement(By.xpath(loc.getProperty("comapny"))).sendKeys("Acent llt pune");
		driver.findElement(By.xpath(loc.getProperty("fname"))).sendKeys("Nrusinh");
		driver.findElement(By.xpath(loc.getProperty("adress"))).sendKeys("pakni");
		driver.findElement(By.xpath(loc.getProperty("adress1"))).sendKeys("pakni solapur");
		driver.findElement(By.xpath(loc.getProperty("state"))).sendKeys("maharastra");
		driver.findElement(By.xpath(loc.getProperty("city"))).sendKeys("solapur");
		driver.findElement(By.xpath(loc.getProperty("zip"))).sendKeys("413255");
		driver.findElement(By.xpath(loc.getProperty("mobile"))).sendKeys("9890953001");
		Thread.sleep(5000);
		List<WebElement> radio_button = driver.findElements(By.xpath("//input[@type='radio']"));
		radio_button.get(0).isEnabled();
		radio_button.get(0).click();
		WebElement dropdown = driver.findElement(By.xpath("//select[@data-qa='days']"));

		Select day = new Select(dropdown);
		day.selectByVisibleText("20");
		Thread.sleep(5000);
		
		WebElement dropdown1 = driver.findElement(By.xpath("//select[@data-qa='months']"));
		Select month = new Select(dropdown1);
		month.selectByVisibleText("August");
		Thread.sleep(5000);
		WebElement dropdown2 = driver.findElement(By.xpath("//select[@data-qa='years']"));
		Select year = new Select(dropdown2);
		year.selectByVisibleText("1992");
		Thread.sleep(5000);
		driver.findElement(By.xpath(loc.getProperty("newsletter"))).click();
		driver.findElement(By.xpath(loc.getProperty("specialoffer"))).click();
		driver.findElement(By.xpath(loc.getProperty("createaccount"))).click();
		Thread.sleep(1000);
		

	}

}
