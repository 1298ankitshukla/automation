package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected {


	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://laptop-eeas1cv9/login.do");
		WebElement checkbox = driver.findElement(By.id("keepLoggedInCheckBox"));
		checkbox.click();
		if(checkbox.isSelected())
		{
			System.out.println("Checkbox is already selected");
		}
		else
		{
			checkbox.click();
		}
		
	}

}
