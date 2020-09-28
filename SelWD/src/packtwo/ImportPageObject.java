package packtwo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class ImportPageObject {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rgundla\\Desktop\\Qshore\\Jars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();
		
		PageObj p = new PageObj();
		
		//initializing the page elements from Page Object Method
		PageFactory.initElements(driver, p);
		p.loginid.sendKeys("abcd");
		p.passwd.sendKeys("1234x");
		p.loginbtn.click();
		
		driver.close();
		

		
		
		
		

	}

}
