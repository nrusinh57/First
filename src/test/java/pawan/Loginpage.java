package pawan;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	WebDriver driver;
	
		
		//create constructor 
		Loginpage(WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver, this);//madtory filed
		}
		//locator
		@FindBy(xpath="//input[@data-qa='login-email']")
		WebElement txt_username;
		@FindBy(xpath="//input[@data-qa='login-password']")
		WebElement txt_password;
		@FindBy(xpath="//button[@data-qa='login-button']")
		WebElement btn_login;
		
		public void setusername(String username) {
			txt_username.sendKeys(username);
		}
		public void setpassword(String password) {
			txt_password.sendKeys(password);
		}
		public void signin() {
			btn_login.click();
		}
	
	
	}


