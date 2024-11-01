package New_automation;

import org.testng.annotations.Test;

import common.Baseclass;

public class Listenerdemotest extends Baseclass {
	@Test
	public void launch() {
		driver.get("https://www.flipkart.com/");
	}

}
