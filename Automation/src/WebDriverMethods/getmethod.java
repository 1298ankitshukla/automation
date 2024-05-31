package WebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getmethod {
	public static void main(String[] args) {
		
		// To Launch the chrome browser
		WebDriver driver = new ChromeDriver();
		
		//To launch the web application
		driver.get("https://www.amazon.com");
	}
}
