package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ORANGEHRM {

public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	
		driver.findElement(By.name("username")).sendKeys("Admin");
		
		driver.findElement(By.name("password")).sendKeys("admin123");
		
		driver.findElement(By.className("oxd-button")).click();
		
		String actual_title = driver.getTitle();
		String expected_Title = "OrangeHRM";
		
		if(actual_title.equals(expected_Title)) {
			System.out.println("Title is currect");
		}else {
			System.out.println("Title is wrong");
		}
		
	}
}
