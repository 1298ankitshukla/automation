package WebElementMethods;



import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class GetRect {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://desktop-1q5mrb2/login.do");
		WebElement checkbox = driver.findElement(By.id("keepLoggedInCheckBox"));
		
		Rectangle axis = checkbox.getRect();
		
		System.out.println(axis.getHeight());
		System.out.println(axis.getWidth());
		System.out.println(axis.getX());
		System.out.println(axis.getY());
		
		
	}

}
