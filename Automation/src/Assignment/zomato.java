package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class zomato {

public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.zomato.com/");
		
		WebElement privacy = driver.findElement(By.xpath("//p[text() = 'Privacy']"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)",privacy);
		
		Thread.sleep(2000);
		WebElement link = driver.findElement(By.xpath("//a[@href='https://in.linkedin.com/company/zomato']"));
		link.click();
		Thread.sleep(2000);
		driver.navigate().back();
}
		
}
