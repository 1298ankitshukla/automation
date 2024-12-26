package leraningtestng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestngPriorityAttribute {

	@Test(priority = 1)
	public void register() {
		Reporter.log("Registration successfully");
	}
	@Test(priority = 2)
	public void Login() {
		Reporter.log("Login successfully");
	}
	
	@Test(priority = 3)
	public void Addtocart() {
		Reporter.log("Add to cart successfully");
	}
	@Test(priority = 4)
	public void logout() {
		Reporter.log("logout successfully");
	}
}
