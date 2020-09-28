package packone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ThirdClass {
	
	public static void main(String[] args) throws Exception
	{
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\rgundla\\Desktop\\Qshore\\Jars\\chromedriver.exe");
	WebDriver d=new ChromeDriver();
	d.get("http://bharatmatrimony.com");
	d.manage().window().maximize();
	
	d.findElement(By.id("NAME")).sendKeys("RAJESH");
	Thread.sleep(2000);
	d.findElement(By.id("MOBILENO")).sendKeys("1234567899");
	d.findElement(By.id("NAME")).clear();
	
		
	}

}
