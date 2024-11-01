package New_automation;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import common.Basetest;

public class Signup_form extends Basetest{
@Test(priority=2)	
	public void signupform() throws Exception{
	driver.findElement(By.xpath(loc.getProperty("fname"))).sendKeys("Nrusinh");
	driver.findElement(By.xpath(loc.getProperty("lname"))).sendKeys("shinde");
	driver.findElement(By.xpath(loc.getProperty("psw"))).sendKeys("Sarkar@4149");
	driver.findElement(By.xpath(loc.getProperty("fname"))).sendKeys("Nrusinh");
	driver.findElement(By.xpath(loc.getProperty("company"))).sendKeys("Acent llt pune");
	driver.findElement(By.xpath(loc.getProperty("fname"))).sendKeys("Nrusinh");
	driver.findElement(By.xpath(loc.getProperty("adress"))).sendKeys("pakni");
	driver.findElement(By.xpath(loc.getProperty("adress1"))).sendKeys("pakni solapur");
	driver.findElement(By.xpath(loc.getProperty("state"))).sendKeys("maharastra");
	driver.findElement(By.xpath(loc.getProperty("city"))).sendKeys("solapur");
	driver.findElement(By.xpath(loc.getProperty("zip"))).sendKeys("413255");
	driver.findElement(By.xpath(loc.getProperty("mobile"))).sendKeys("9890953001");
	Thread.sleep(5000);
	
	}

}
