package dropdownselectclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectoptiononebyone {

	public static void main(String[] args) {
		
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://demowebshop.tricentis.com/books");
	
	WebElement dropdown=driver.findElement(By.id("products-orderby"));
	Select s = new Select(dropdown);
	for(int i = 0; i<7; i++)
	{
		s.selectByIndex(i);
		
	}
	// to get stale element refresh exception
	}
}
