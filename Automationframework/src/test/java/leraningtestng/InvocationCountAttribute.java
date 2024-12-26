package leraningtestng;

import org.testng.annotations.Test;

public class InvocationCountAttribute {

	@Test(priority = 1)
	public void register() {
		System.out.println("Registration successfully");
	}
	@Test(priority = 2)
	public void Login() {
		System.out.println("Login successfully");
	}
	
	@Test(invocationCount = 5)
	public void Addtocart() {
		System.out.println("Add to cart successfully");
	}
	@Test(priority = 4)
	public void logout() {
		System.out.println("logout successfully");
	}
}
