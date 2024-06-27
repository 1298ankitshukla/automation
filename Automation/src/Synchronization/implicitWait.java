package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class implicitWait {
public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//use implicit Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://shoppersstack.com");
		
		driver.findElement(By.xpath("//span[text()='Santoor']")).click();
		
		driver.findElement(By.xpath("//input[@id='Check Delivery']")).sendKeys("23134");
	}

}
