package windowHandle;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class switchungthewindowAmazon {


public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("iphone",Keys.ENTER);
		driver.findElement(By.xpath("//span[text()='Apple iPhone 15 (128 GB) - Black']")).click();
		
		Set<String> allwindowId = driver.getWindowHandles();
		for(String id: allwindowId)
		{
			driver.switchTo().window(id);
			if(driver.getTitle().equals("Apple iPhone 15 (128 GB) - Black"))
			{
				break;
			}
			
		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='button'and @value='Add to Cart']")).click();
}
}
