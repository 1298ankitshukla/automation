package launchbrowser;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RTPP {
	static WebDriver driver;
	public static void main(String[] args) {
		
	while(true) {
		Scanner sc = new Scanner(System.in);
		 System.out.println("enter your Brower name  ");
		String browser = sc.next();
		
		if(browser.equals("chrome")){
			driver = new ChromeDriver();
		}else if(browser.equals("edge")){
			 driver = new EdgeDriver();
		}
		else if(browser.equals("firefox")){
			 driver = new FirefoxDriver();
		}else {
			System.out.println("invalid browser  ");
		}
	}
	}
}
