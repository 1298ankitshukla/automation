package DataDrivenFramework;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FatchingDataFromPropertyFile {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("./src/test/resources/TestData/CommonData.properties");
	
	Properties p = new Properties();
	p.load(fis);
	String url = p.getProperty("username");
	System.out.println(url);
	}
}
