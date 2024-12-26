package leraningtestng;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ConfigerAnotetionsinTestng {

	@BeforeSuite
	public void server() {
	Reporter.log("Connect with the server",true);
	}
	@BeforeTest
	public void Database() {
	Reporter.log("Connect with the DataBase",true);
	}
	@BeforeClass
	public void Class() {
	Reporter.log("Connect with the browser",true);
	}
	@BeforeMethod
	public void login() {
	Reporter.log("Login",true);
	}
	@Test
	public void Testscript() {
		Reporter.log("Test Script 1 execute successfully",true);
	}
	@Test
	public void Testscript2() {
		Reporter.log("Test Script 2 execute successfully",true);
	}
	@AfterMethod
	public void logout () {
		Reporter.log("logout",true);
	}
	@AfterClass
	public void close () {
		Reporter.log("Successfully close the browser",true);
	}
	@AfterTest
	public void DataBase() {
		Reporter.log("close the Connection with DataBase",true);
	}
	@AfterSuite
	public void Server() {
		Reporter.log("close the Connection with Server",true);
	}
}
