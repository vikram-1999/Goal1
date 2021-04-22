package frameworkdemo;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Assignment6_q1_q2 {
  

	@Parameters({"num1" , "num2"})
	  @Test
	  public void checkNum1AndNum2AreNotEqual(int num1 , int num2) {
			  Assert.assertNotEquals(num1, num2," "+num1+" and "+num2+" are not equal");
	}
	
	@Parameters({"num1" , "num2"})
	@Test
	public void verifyCondition(int num1, int num2) {
		Assert.assertFalse(num1>num2);
	}
}	

