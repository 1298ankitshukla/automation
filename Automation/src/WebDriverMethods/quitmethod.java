package WebDriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class quitmethod {
		public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		// to click on link
		driver.findElement(By.linkText("open a popup window")).click();
		
		//driver.close();
		
		// to use quit method
		driver.quit();
		}
}
