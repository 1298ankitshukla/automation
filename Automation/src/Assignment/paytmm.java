package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class paytmm {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://paytm.com/");
		
		
		Actions a = new Actions(driver);
		
		//identify the webelement
		WebElement mouseHover = driver.findElement(By.linkText("Paytm for Consumer"));
		
		//use the method
		a.moveToElement(mouseHover).perform();
	}
	

}
