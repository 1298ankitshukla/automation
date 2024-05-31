package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sportify {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://open.spotify.com");
				
		driver.findElement(By.cssSelector("button[data-testid='login-button']")).click();
		Thread.sleep(3000);

		driver.findElement(By.cssSelector("input[aria-describedby='username-error']")).sendKeys("shuklaankit1011@gmail.com");
		
		driver.findElement(By.cssSelector("input[autocomplete='current-password']")).sendKeys("ankit12345");
		
		driver.findElement(By.cssSelector("button[data-encore-id='buttonPrimary']")).click();
		Thread.sleep(5000);	
		driver.findElement(By.xpath("//span[text()='Search']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@placeholder=\"What do you want to play?\"]")).sendKeys("Genda Phool");
		Thread.sleep(2000);
		 driver.findElement(By.xpath("/html/body/div[4]/div/div[2]/div[3]/div[1]/div[2]/div[2]/div[2]/main/div[2]/div/div/section[1]/div[2]/div/div/div/div[4]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class=\"IconWrapper__Wrapper-sc-16usrgb-0 jEDcnm\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class=\"Button-sc-qlcn5g-0 aKwAm\"]")).click();
		}
}
