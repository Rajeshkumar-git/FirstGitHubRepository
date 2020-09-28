package packtwo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdvWD {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rgundla\\Desktop\\Qshore\\Jars\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("http://google.com");
		d.manage().window().maximize();
		
		d.findElement(By.xpath("//input[@name='q']")).sendKeys("Selenium API");
		Thread.sleep(1000);
		d.findElement(By.xpath("//input[@value='Google Search']")).click();

	}

}
