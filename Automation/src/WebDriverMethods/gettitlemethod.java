package WebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class gettitlemethod {
	public static void main(String[] args) {
		
//		// To Launch the chrome browser
//		WebDriver driver = new ChromeDriver();
//			
//		// to maximize the window
//		driver.manage().window().maximize();
//					
//		//To launch the web application
//		driver.get("https://www.amazon.in");
//		
//		// to use get title method
//		String title = driver.getTitle();
//		System.out.println("Title is :  " + title);
//		
//====================================================================================================
		//================================================
		// there are two code run one by one
		
		
				// To Launch the chrome browser
				WebDriver driver = new ChromeDriver();
					
				// to maximize the window
				driver.manage().window().maximize();
							
				//To launch the web application
				driver.get("https://www.amazon.in");
				
				// to use get title method
				String actual_title = driver.getTitle();
				String expected_Title = "Amazon.in";
				
				if(actual_title.equals(expected_Title)) {
					System.out.println("Title is currect");
				}else {
					System.out.println("Title is wrong");
				}
				
				
		
	}
}
