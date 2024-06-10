package popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class workingwithAuthenticationpopup {

public static void main(String[] args) throws InterruptedException {
		
		
	WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://desktop-1q5mrb2/login.do");
		
		driver.findElement(By.name("username")).sendKeys("admin",Keys.TAB,"manager",Keys.TAB,Keys.ENTER);
		
		driver.findElement(By.xpath("//img[@class='sizer'][1]")).click();
		driver.findElement(By.xpath("//a[@href='/project/customers_projects.do']")).click();
		driver.findElement(By.xpath("//a[text()='All']")).click();
		driver.findElement(By.xpath("//input[@value='Delete Selected']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@onclick='deleteConfirmDlg.close()']")).click();
	}
}
