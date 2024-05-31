package launchbrowser;

import java.util.Scanner;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RTP {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 System.out.println("enter your Brower name  ");
		String browser = sc.next();
		
		if(browser.equals("chrome")){
			ChromeDriver driver = new ChromeDriver();
		}else if(browser.equals("edge")){
			EdgeDriver driver = new EdgeDriver();
		}
		else if(browser.equals("firfox")){
			FirefoxDriver driver = new FirefoxDriver();
		}else {
			System.out.println("invalid browser");
		}
	}

}
