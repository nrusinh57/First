package New_automation;

import org.testng.annotations.Test;

import common.Basetest;
import common.pageobject;

public class po_login extends Basetest {
	@Test
	public void login() throws Exception {
		pageobject lp = new pageobject();
		lp.setusename("nrusinh57@gmail.com");
		lp.setpwd("Sarkar@gmail.com");
		Thread.sleep(3000);

		lp.signin();
	}

}
