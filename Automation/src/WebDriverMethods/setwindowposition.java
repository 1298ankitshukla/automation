package WebDriverMethods;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class setwindowposition {
		public static void main(String[] args) {
			
		WebDriver driver = new ChromeDriver();
			
		driver.manage().window().setPosition(new Point (200,100));
		}
}
