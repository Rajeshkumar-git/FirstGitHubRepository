package packtwo;

import java.util.List;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TryAction {

	public static void main(String[] args) throws Exception{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rgundla\\Desktop\\Qshore\\Jars\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("http://naukri.com");
		d.manage().window().maximize();
		
		//Get WebElement of Companies location
		
		WebElement loc=d.findElement(By.xpath("/html/body/div[1]/div/div/ul[1]/li[3]/a"));
		//System.out.println(loc.getText());
		
		Thread.sleep(2000);
		
		//Implement Mouse Actions
		
		Actions a=new Actions(d);
		a.moveToElement(loc).build().perform();
		d.findElement(By.xpath("/html/body/div[1]/div[1]/div/ul[1]/li[3]/div/ul/li[3]/a")).click();
		
		List<WebElement> links=d.findElements(By.tagName("a"));
		System.out.println(links.size());
		
		int i;
		for(i=0;i<links.size();i++){
			System.out.println(d.findElements(By.xpath("")));
		}
		
		d.quit();
		
	}

}
