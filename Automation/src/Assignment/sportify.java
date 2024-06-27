package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sportify {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://open.spotify.com");
				
		driver.findElement(By.cssSelector("button[data-testid='login-button']")).click();

		driver.findElement(By.cssSelector("input[aria-describedby='username-error']")).sendKeys("shuklaankit1011@gmail.com");
		
		driver.findElement(By.cssSelector("input[autocomplete='current-password']")).sendKeys("ankit12345");
		
		driver.findElement(By.cssSelector("button[data-encore-id='buttonPrimary']")).click();
		
		driver.findElement(By.xpath("//span[text()='Search']")).click();
		
		
		driver.findElement(By.xpath("//input[@placeholder=\"What do you want to play?\"]")).sendKeys("Genda Phool");//search song
		
		 driver.findElement(By.xpath("/html/body/div[4]/div/div[2]/div[3]/div[1]/div[2]/div[2]/div[2]/main/div[2]/div/div/section[1]/div[2]/div/div/div/div[4]")).click();
	
		driver.findElement(By.xpath("//span[@class='IconWrapper__Wrapper-sc-1hf1hjl-0 cNvoOe']")).click();// play song
		Thread.sleep(9000);
		driver.findElement(By.xpath("//button[@class='mnipjT4SLDMgwiDCEnRC']")).click();//change song
		}
}
