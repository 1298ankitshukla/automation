package LearningPom;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getStaleEleRefreEXce {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://desktop-1q5mrb2/login.do");
		
		//Identify  my username text field and then i will into one variable i.e username
		WebElement username = driver.findElement(By.name("username"));
		System.out.println(username);
		
		driver.navigate().refresh();
		username.sendKeys("admin"); /// get Stale Element Refresh Exception
	}
}
