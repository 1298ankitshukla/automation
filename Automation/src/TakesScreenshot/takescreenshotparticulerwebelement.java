package TakesScreenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class takescreenshotparticulerwebelement {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.zomato.com");
		
		//take the screenshot of particuler web element
		WebElement screenshot = driver.findElement(By.xpath("//h1[@class='sc-7kepeu-0 kYnyFA description']"));
		File src = screenshot.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshot/webelement.png");
		try {
			Files.copy(src,dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
