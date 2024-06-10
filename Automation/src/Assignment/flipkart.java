
package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class flipkart {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.flipkart.com");
		
		 driver.findElement(By.xpath("//input[@class='Pke_EE']")).sendKeys("iphone",Keys.ENTER);
		 driver.findElement(By.xpath("//img[@alt='Apple iPhone 15 (Green, 128 GB)']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//button[@class='QqFHMw vslbG+ In9uk2']")).click();// click on add to cart
		
		
	}

}
