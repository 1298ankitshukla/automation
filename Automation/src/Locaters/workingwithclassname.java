package Locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class workingwithclassname {
		
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentic.com/");
		
		//search books inside demoweb shop		
		WebElement searchTextField = driver.findElement(By.tagName("input"));
		
		searchTextField.sendKeys("books");
		
		//click on search button
		WebElement searchButton = driver.findElement(By.className("search-box-button"));
		searchButton.click();
	}
}
