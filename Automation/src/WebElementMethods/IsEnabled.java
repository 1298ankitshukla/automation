package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabled {

public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		//identify the username text field
		WebElement usnTextField = driver.findElement(By.name("username"));
		if(usnTextField.isEnabled())
		{
			usnTextField.sendKeys("admin");
			System.out.println("Username TextField is enable");
		}
		else
		{
			System.out.println("Username text field is disabled");
		}
	}
}
