package leraningtestng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestgnAndMainMethodbothUse {

	@Test
	public void testcript1()
	{
		Reporter.log("test scrpt 1 execute successfully",true);
	}
	public static void main(String[] args) {
		System.out.println("test Scrpt 2 execute successfully");
	}
	
	// If you use both @test ng and main method than it will ask permition to execute
}
