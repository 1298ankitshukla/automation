package dropdownoperationalmethods;


import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class getallselectedOptions {

public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/ui/dropdown?sublist=0");
		driver.findElement(By.xpath("//a[text()='Multi Select']")).click();
		
		//identify the static dropdown
		WebElement dropdown = driver.findElement(By.id("select-multiple-native"));
		
		//creat the object of select class 
		Select s = new Select(dropdown);
		
		for(int i = 0; i<4 ; i++)
		{
			s.selectByIndex(i);
			Thread.sleep(2000);
		}
		List<WebElement>SelectedOptions = s.getAllSelectedOptions();
		for(WebElement Option : SelectedOptions)
		{
			System.out.println(Option.getText());
		}
}
}
