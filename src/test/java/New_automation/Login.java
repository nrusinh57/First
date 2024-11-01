package New_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import common.Basetest;

public class Login extends Basetest {
	

	@Test()
	public void logit_valid() throws Exception {
		driver.findElement(By.xpath(loc.getProperty("signup"))).click();
		driver.findElement(By.xpath(loc.getProperty("login_email"))).sendKeys("nrusinh57@gmail.com");
		driver.findElement(By.xpath(loc.getProperty("login_psw"))).sendKeys("Sarkar@4149");
		Thread.sleep(2000);
	driver.findElement(By.xpath(loc.getProperty("login"))).click();
	}

	@AfterTest()
	public void logout(){
		
		driver.findElement(By.xpath(loc.getProperty("logout"))).click();
		System.out.println("logout succesfully done");
	}

}
