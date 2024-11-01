package TestNg;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_provider {
	@DataProvider
public Object[][] dataset()
{
	Object[][] dataset=new Object[3][2];
	dataset[0][0]="username1";
	dataset[0][1]="passwortd125";
dataset[1][0]="usermame";
dataset[1][1]="passwor";
return dataset;
}
	@Test(dataProvider="dataset")
	public void test(String username,String password) {
	System.out.println(username+"----"+password);	
	}
}
