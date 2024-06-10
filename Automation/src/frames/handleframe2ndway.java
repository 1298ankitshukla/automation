package frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handleframe2ndway {


public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.dream11.com/");
		
		
		
		//identify frames and use id or name Attribute
		driver.switchTo().frame("send-sms-iframe");
		 driver.findElement(By.xpath("//input[@name='regEmail']")).sendKeys("9140068922");
}
}
