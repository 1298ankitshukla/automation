package relativeXpath;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathbyMultipleAttribute {

	public static void main(String[] args) {
		
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get("https://www.instagram.com/");
			
			//X Path By Multiple Attribute
			driver.findElement(By.xpath("//input[@type='text' and @name='username' and @class='_aa4b _add6 _ac4d _ap35']")).sendKeys("ANKIT SHUKLA");
	}
}
