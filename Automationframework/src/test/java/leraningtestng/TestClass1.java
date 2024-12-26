package leraningtestng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestClass1 {

	@Test
	public void testscript1()
	{
		Reporter.log("Test script 1 executed successfully", true);// true is use to print statement in console
	}
	@Test
	public void Testscript2()
	{
		Reporter.log("Test script 1 executed successfully");
	}
	//in test ng class we use multiple testng
}
