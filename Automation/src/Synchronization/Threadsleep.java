package Synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Threadsleep {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.airvistara.com/in/en");
		Thread.sleep(2000);
		driver.findElement(By.id("acceptAllBtn")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("onewaytrip")).click();
		
		driver.findElement(By.xpath("//input[@name=\"flightSearchFrom\"]")).sendKeys("Delhi (DEL) ");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@aria-label=\"Search destination\"]")).sendKeys("Dubai (DXB) ");
		driver.findElement(By.xpath("//input[@id='departCalendar']")).click();
		Thread.sleep(2000);
	    driver.findElement(By.xpath("//a[text()='31']")).click();
	    Thread.sleep(5000);
	    driver.findElement(By.id("book-flight-widget")).click();

	}
}
