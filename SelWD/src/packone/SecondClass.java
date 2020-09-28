package packone;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SecondClass {

	public static void main(String[] args) {
		
		WebDriver d=new FirefoxDriver();
		d.get("http://gmail.com");
		

	}

}
