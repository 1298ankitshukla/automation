package Assignment;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Paytm {

public static void main(String[] args) throws AWTException, InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://paytm.com/");
		
		Actions a = new Actions(driver);
		
		WebElement rightclick = driver.findElement(By.className("nWhEP"));
		
		a.contextClick(rightclick).perform();
		//use Robot class
		Robot r = new Robot();
		
		//press the right click button
		r.keyPress(KeyEvent.VK_DOWN);
		
		r.keyRelease(KeyEvent.VK_DOWN);
		
		for(int i = 0; i<13; i++)
		{
			r.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(2000);
			
		}
	
}
}
