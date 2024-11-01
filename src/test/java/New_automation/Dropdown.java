package New_automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import common.Baseclass;

@Test
public class Dropdown extends Baseclass {
	public void dropdown() throws Exception {
		List<WebElement> alldropdown = driver.findElements(By.xpath("//select[@name='birthday_day']/option"));
		System.out.println("total Dropdown is:-" + alldropdown.size());

		// select by index
		alldropdown.get(19).click();
		Thread.sleep(5000);
		//using select class constructor
		WebElement day =driver.findElement(By.xpath("//select[@name='birthday_day']"));
	Select day1=new Select(day);
		day1.selectByValue("12");
		Thread.sleep(3000);
		day1.selectByVisibleText("15");
		Thread.sleep(3000);
		day1.getAllSelectedOptions();
		Thread.sleep(3000);
		day1.isMultiple();
		
				
		}
	}


