package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class googlemap {

	public static void main(String[] args)  {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.google.com/");
		
		driver.findElement(By.xpath("//a[@href='https://www.google.co.in/intl/en/about/products']")).click();
		//by using frame of indexing
//		driver.switchTo().frame(1);
		
		WebElement frame = driver.findElement(By.xpath("//iframe[@name='app']"));
		driver.switchTo().frame(frame);
		driver.findElement(By.xpath("//a[@href='https://maps.google.com/']")).click();
	}
}
