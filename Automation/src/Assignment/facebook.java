package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook {
	public static void main(String[] args){
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.facebook.com");
		
		driver.findElement(By.className("_6lti")).click();
	
        driver.findElement(By.name("firstname")).sendKeys("ankit");
        driver.findElement(By.name("lastname")).sendKeys("shukla");
        driver.findElement(By.name("reg_email__")).sendKeys("9987654321");
        driver.findElement(By.name("reg_passwd__")).sendKeys("ankit98765");
        driver.findElement(By.name("birthday_day")).sendKeys("12");
        driver.findElement(By.id("month")).sendKeys("august");
        driver.findElement(By.id("year")).sendKeys("2001");
        driver.findElement(By.cssSelector("input[value='2']")).click();
      	driver.findElement(By.name("websubmit")).click();
		
	}
}
