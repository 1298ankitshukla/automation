package popups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class workingwithpromptpopup {

public static void main(String[] args) throws InterruptedException {
		
	WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/ui/alert/prompt?sublist=2");
		driver.findElement(By.id("buttonAlert1")).click();
		Thread.sleep(2000);
		//switch the control into alert popup
		Alert a = driver.switchTo().alert();
		a.sendKeys("yes");
		a.accept();
		
		
	}
}
