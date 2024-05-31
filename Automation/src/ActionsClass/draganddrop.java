package ActionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class draganddrop {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/ui/dragdrop/dragToCorrect?sublist=1");
		
		//create the object
		Actions a = new Actions(driver);
		
		//identify the drag and drop webelement
		WebElement drag = driver.findElement(By.xpath("//div[text()='Mobile Charger']"));
		WebElement drop = driver.findElement(By.xpath("//div[text()='Mobile Accessories']"));
		Thread.sleep(2000);
		//to use drag and drop method
		a.dragAndDrop(drag, drop).perform();				
	}
}
