package windowbasedpopup;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fileuploadpopupbyusingSendkey {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/ui/fileUpload?sublist=0");
		
		WebElement fileupload = driver.findElement(By.xpath("//input[@id='fileInput']"));
		fileupload.sendKeys("C:\\Users\\Asus\\OneDrive\\Desktop\\mohit_new Manual_+_SQL_+_JAVA_Resume[1] (1)[1].pdf");
	}
}
