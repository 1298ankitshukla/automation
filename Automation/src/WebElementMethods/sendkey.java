package WebElementMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sendkey {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.instagram.com/");
		
		WebElement usernameTextField = driver.findElement(By.name("username"));
		
		usernameTextField.sendKeys("ankit");
		
		WebElement passwordTextField = driver.findElement(By.name("password"));
		
		passwordTextField.sendKeys("123456789");
		
	}
}
