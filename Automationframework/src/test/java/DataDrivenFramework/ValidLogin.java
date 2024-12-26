package DataDrivenFramework;

import java.io.IOException;

import org.openqa.selenium.By;

public class ValidLogin extends BaseClass {

	public static void main(String[] args) throws IOException {
		
		BaseClass b = new BaseClass();
		b.launchBrowser();
		Flib lib = new Flib();
		String username = lib.getDataFromPropertyFile("./src/test/resources/TestData/CommonData.properties","username");
		String password = lib.getDataFromPropertyFile("./src/test/resources/TestData/CommonData.properties","password");
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.id("loginButton")).click();
		b.closeBrowser();
	}
}
