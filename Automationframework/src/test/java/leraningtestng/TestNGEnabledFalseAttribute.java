package leraningtestng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNGEnabledFalseAttribute {

	@Test(priority = 1)
	public void register() {
		Reporter.log("Registration successfully");
	}
	@Test(priority = 2)
	public void Login() {
		Reporter.log("Login successfully");
	}
	
	@Test(enabled = false)// Enabled = false Attribute
	public void Addtocart() {
		Reporter.log("Add to cart successfully");
	}
	@Test(priority = 4)
	public void logout() {
		Reporter.log("logout successfully");
	}
}
