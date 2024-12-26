package leraningtestng;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

public class demowebshoploginAssignment {

	@Test(priority = 1)
	public void register(){
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[@href='/register']")).click();
		driver.findElement(By.xpath("//input[@id='gender-male']")).click();
//		driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("ankit");
//		driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("shukla");
//		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("ankit1011@gmail.com");
//		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("12345");
//		driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys("12345");
//		driver.findElement(By.xpath("//input[@name='register-button']")).click();
		
		driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("ankit",Keys.TAB,"shukla",Keys.TAB,"ankit1011@gmail.com",Keys.TAB,"12345",Keys.TAB,"12345",Keys.TAB,Keys.ENTER);
	}
	@Test(priority = 2)
	public void login() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Log in")).click();
//		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("ankit1011@gmail.com");
//		driver.findElement(By.xpath("//input[@class='password']")).sendKeys("12345");
//		driver.findElement(By.xpath("//input[@id='RememberMe']")).click();
//		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("ankit1011@gmail.com",Keys.TAB,"12345",Keys.TAB,Keys.ENTER,Keys.TAB,Keys.ENTER);
	}
	@Test(priority = 3)
	public void addtocart() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Books")).click();
		driver.findElement(By.xpath("//input[@class='button-2 product-box-add-to-cart-button'][1]")).click();
	}
	
}
