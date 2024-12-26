package leraningtestng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOnMethodAttribute {

	@Test
	public void register() {
		Reporter.log("Registration successfully");
	}
	@Test(dependsOnMethods = "register")
	public void Login() {
		Reporter.log("Login successfully");
	}
	
	@Test
	public void Addtocart() {
		Reporter.log("Add to cart successfully");
	}
	
}
