package WebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getpagesource {
	
	public static void main(String[] args) {
		
		// To Launch the chrome browser
		WebDriver driver = new ChromeDriver();
			
		// to maximize the window
		driver.manage().window().maximize();
					
		//To launch the web application
		driver.get("https://www.swiggy.com");
		
		// To use get page source()
		String source = driver.getPageSource();
		System.out.println(source);
	}
}
