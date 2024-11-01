package TestNg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Testng2 {

	@Test
	public void a() {

		
			String exp_result = "murari ";
			String ACt_Result = "murari";
			//Assert.assertEquals(ACt_Result, exp_result);

			Assert.assertEquals(ACt_Result,exp_result);
		} 
	
		
	

	@Test(priority = -20)
	public void b() {
		System.out.println("Mrthod B is executed first");

	}
}