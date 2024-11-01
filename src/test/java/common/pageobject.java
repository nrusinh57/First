package common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class pageobject extends Basetest {
	//public static WebDriver driver;

	// constructor
	//public void login(WebDriver driver) {

		//this.driver = driver;
	///}

	WebElement txt_username = driver.findElement(By.xpath("//input[@data-qa='login-email']"));
WebElement txt_pwd = driver.findElement(By.xpath("//input[@data-qa='login-password']"));
WebElement btn_login = driver.findElement(By.xpath("//button[@data-qa='login-button']"));

	public void setusename(String username) {
		txt_username.sendKeys("nrusinh57@gmail.com");

	}

	public void setpwd(String password) {
		txt_pwd.sendKeys("Sarkar@4149");
	}

	public void signin() {
		btn_login.click();
	}

}
