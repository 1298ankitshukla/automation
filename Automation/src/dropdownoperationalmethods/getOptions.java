package dropdownoperationalmethods;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class getOptions {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/ui/dropdown?sublist=0");
		
		//identify the static dropdown
		WebElement dropdown = driver.findElement(By.id("select3"));
		Select s = new Select(dropdown);
		
		List<WebElement> allOptions = s.getOptions();
		for(WebElement Option : allOptions)
		{
			System.out.println(Option.getText());
		}
		
	}
}
