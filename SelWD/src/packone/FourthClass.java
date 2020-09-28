package packone;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class FourthClass {
	
	public static void main(String[] args){
		
		System.setProperty("webdriver.ie.driver", "C:\\Users\\rgundla\\Desktop\\Qshore\\Jars\\IEDriverServer.exe");
		WebDriver d=new InternetExplorerDriver();
		d.get("http://gmail.com");
		d.manage().window().maximize();
	}

}
