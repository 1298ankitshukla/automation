package WebElementMethods;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getText {

public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.flipkart.com/");

		driver.findElement(By.name("q")).sendKeys("iPhone",Keys.ENTER);
		
//		WebElement product = driver.findElement(By.xpath("//div[@class='KzDlHZ']"));
//		System.out.println(product.getText());
		
		List<WebElement> allProductName = driver.findElements(By.xpath("//div[@class='KzDlHZ']"));
//		String name = allProductName.get(1).getText();
//		System.out.println(name);
		System.out.println( allProductName.get(1).getText());

}
}
