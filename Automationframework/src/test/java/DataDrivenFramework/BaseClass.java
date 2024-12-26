package DataDrivenFramework;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {

	static WebDriver driver;
	
	public void launchBrowser() throws IOException 
	{
		Flib f = new Flib();
		String browser = f.getDataFromPropertyFile("./src/test/resources/TestData/CommonData.properties","browser");
		String url = f.getDataFromPropertyFile("./src/test/resources/TestData/CommonData.properties","url");
		if(browser.equals("chrome")) {
			driver = new ChromeDriver();
		}
		else if(browser.equals("firefox")) {
			driver = new FirefoxDriver();
		}
		else if(browser.equals("edge")) {
			driver = new EdgeDriver();
		}
		else {
			System.out.println("Invalid browser");
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(url);
	}
		public void closeBrowser() {
			driver.quit();
		}
}
