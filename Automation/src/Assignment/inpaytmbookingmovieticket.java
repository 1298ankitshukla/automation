package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class inpaytmbookingmovieticket {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://paytm.com");
		
		driver.findElement(By.xpath("//img[@src=\'https://assetscdn1.paytm.com/images/catalog/view_item/733295/1626259710574.png\']")).click();
		
		driver.findElement(By.xpath("//div[text()='Delhi/NCR']")).click();
		
		driver.findElement(By.xpath("//label[text()='Hindi']")).click();
		
		driver.findElement(By.xpath("//img[@alt='Bhaiyya Ji']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='28']")).click();
		
		driver.findElement(By.xpath("//div[text()='06:15 PM']")).click();
		Thread.sleep(4000);
//		driver.findElement(By.xpath("//div[@class='FixedSeatingDesktop_zIndex___G0qz']")).click();
//		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='6']")).click();
//		
//		driver.findElement(By.xpath("//span[text() ='10']")).click();
		//driver.findElement(by.)
	}
}
