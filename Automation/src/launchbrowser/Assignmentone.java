package launchbrowser;

import java.util.Scanner;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignmentone {

		public static void main(String[] args) {
		    
	   System.out.println("select any one Brower ");
	   System.out.println("1 for chrome ");
	   System.out.println("2 for Edge");
	   System.out.println("3 for firefox");
	   Scanner sc = new Scanner(System.in);
	   int a = sc.nextInt();
//		if(a==1) {
//	    	 System.out.println("Chrome");
//	    	 ChromeDriver  Driver = new ChromeDriver();
//	    	  }
//	     else if(a==2) {
//	    	 System.out.println("Edge");
//	    	 EdgeDriver Driver = new EdgeDriver();
//	    	 }
//	     else {
//	    	 
//	    	 FirefoxDriver driver = new FirefoxDriver();
//	     }
	     
	     
	     // there are two code run one by one
	     
	     
	     switch (a) {
	     case 1 : ChromeDriver  Driver = new ChromeDriver();
	     break;
	     case 2 : EdgeDriver driver1 = new EdgeDriver();
	     break;
	     case 3 :FirefoxDriver driver2 = new FirefoxDriver();
	     break;
	     default: System.out.println("Enter a correct brower");
		}
		}
}
