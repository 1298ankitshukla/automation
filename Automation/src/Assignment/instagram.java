package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class instagram {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com");
		
		 driver.findElement(By.name("username")).sendKeys("ankit");
		
		 driver.findElement(By.name("password")).sendKeys("123456");
		 
		 driver.findElement(By.className("_acas")).click();
	}
}
