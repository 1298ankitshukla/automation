package leraningtestng;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
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

public class demoWebShopAssignment2 {

	public WebDriver driver;
	
	@BeforeSuite
	public void beforeSuite() {
		Reporter.log("Connect with the server", true);
	}
	
	@BeforeTest
	public void beforeTest() {
		Reporter.log("Connect with the DataBase", true);
	}
	
	@BeforeClass
	public void beforeClass() {
		//Connect with the browser
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demowebshop.tricentis.com/");
		//Reporter.log("Connect with the DataBase", true);
	}
	
	@BeforeMethod
	public void beforemethod() {
		Reporter.log("Login Successfully", true);
	}

	@Test(priority = 1)
	public void Register() {
		driver.findElement(By.xpath("//a[@class='ico-register']")).click();
		driver.findElement(By.xpath("//input[@id='gender-male']")).click();
		driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("ankit",Keys.TAB,"shukla",Keys.TAB,"ankit1011@gmail.com",Keys.TAB,"12345",Keys.TAB,"12345",Keys.TAB,Keys.ENTER);
	}
	
	@Test(priority = 2)
	public void Login() {
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("ankit1011@gmail.com",Keys.TAB,"12345",Keys.TAB,Keys.ENTER,Keys.TAB,Keys.ENTER);
		Reporter.log("Connect with the browser", true);
	}
	
	@Test(priority = 3)
	public void addtocart() {
		driver.findElement(By.linkText("Books")).click();
		driver.findElement(By.xpath("//input[@class='button-2 product-box-add-to-cart-button'][1]")).click();
		Reporter.log("Connect with the browser", true);
	}
	
	@AfterMethod
	public void Aftermethod() {
		Reporter.log("Logout Successfully", true);
	}
	
	@AfterClass
	public void Afterclass() {
		Reporter.log("disconnect with the browser", true);
	}
	
	@AfterTest
	public void Aftertest() {
		Reporter.log("disconnect with the database", true);
	}
	
	@AfterSuite
	public void Aftersuite() {
		Reporter.log("disconnect with the server", true);
	}
}
