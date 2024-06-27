package Locaters;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class workingwithfindElements {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		
		driver.findElement(By.name("q")).sendKeys("iPhone",Keys.ENTER);
		
		List<WebElement> allProductName = driver.findElements(By.xpath("//div[@class='KzDlHZ']"));
		
		
		for(int i = 0; i < allProductName.size(); i++)
		{	
			
			System.out.println(allProductName.get(i).getText());
		}
	}
}
