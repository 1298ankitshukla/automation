package WebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getcurrenturl {
		public static void main(String[] args) {
			
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.amazon.com");
			
			String url = driver.getCurrentUrl();
			System.out.println("Current URL is :  "+ url);
			
			
		}
}
