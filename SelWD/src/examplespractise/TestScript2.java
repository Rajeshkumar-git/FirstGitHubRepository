package examplespractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.FindElement;

import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium;


public class TestScript2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rgundla\\Desktop\\Qshore\\Jars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();

		//Getting title of the webpage
		String name=driver.getTitle();
		System.out.println(name);
		
		//check the conditions in title
		boolean a=name.startsWith("f");
		if(a==true)
			System.out.println("Title start with f");
		else
			System.out.println("Title doesnt start with f");
		boolean b=name.endsWith("m");
		if(b==true)
			System.out.println("Title ends with m");
		else
			System.out.println("Title doesnt end with m");
		

		WebDriverBackedSelenium o=new WebDriverBackedSelenium(driver, "http://facebook.com");
		
		System.out.println(name.length());
		
		
		
		driver.close();
		
	}

}
