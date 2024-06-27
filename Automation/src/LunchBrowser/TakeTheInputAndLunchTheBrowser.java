package LunchBrowser;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TakeTheInputAndLunchTheBrowser {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Browser name");
		String browser = sc.next();
		if(browser.equals("Chrome")) {
			WebDriver driver = new ChromeDriver();
		}
		else if(browser.equals("Edge")) {
			WebDriver driver = new EdgeDriver();
		}
		else if(browser.equals("Firefox")) {
			WebDriver driver = new FirefoxDriver();
		}
		else {
			System.out.println("Invalid Browser");
		}
	}
}
