package packtwo;

import java.io.File;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameCount {

	public static void main(String[] args) throws Exception{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rgundla\\Desktop\\Qshore\\Jars\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("http://google.com");
		d.manage().window().maximize();	
	
		TakesScreenshot scrnsht=((TakesScreenshot)d);
		File srcfile=scrnsht.getScreenshotAs(OutputType.FILE);
		File destfile=new File("C:\\Users\\rgundla\\Desktop\\Qshore\\scrsht\\ss1.jpeg");
		FileUtils.copyFile(srcfile, destfile);
		
		
		d.findElement(By.xpath("//input[@name='q']")).sendKeys("Java API");
		Thread.sleep(3000);
		
		TakesScreenshot scrnsht1=((TakesScreenshot)d);
		File srcfile1=scrnsht1.getScreenshotAs(OutputType.FILE);
		File destfile1=new File("C:\\Users\\rgundla\\Desktop\\Qshore\\scrsht\\ss2.jpeg");
		FileUtils.copyFile(srcfile1, destfile1);
		
		d.findElement(By.xpath("//input[@name='btnK' and @type='submit' and @class='gNO89b']")).click();
		
		TakesScreenshot scrnsht2=((TakesScreenshot)d);
		File srcfile2=scrnsht2.getScreenshotAs(OutputType.FILE);
		File destfile2=new File("C:\\Users\\rgundla\\Desktop\\Qshore\\scrsht\\ss3.jpeg");
		FileUtils.copyFile(srcfile2, destfile2);
		
		Thread.sleep(3000);
		d.findElement(By.xpath("//a[@href='https://docs.oracle.com/javase/7/docs/api/']")).click();
		
		TakesScreenshot scrnsht3=((TakesScreenshot)d);
		File scrfile3=scrnsht3.getScreenshotAs(OutputType.FILE);
		File destfile3=new File("C:\\Users\\rgundla\\Desktop\\Qshore\\scrsht\\ss4.jpeg");
		FileUtils.copyFile(scrfile3, destfile3);
		
		List<WebElement> frms=d.findElements(By.tagName("Frame"));
		System.out.println("Number of Frames- " +frms.size());
		
		
		
		d.quit();
		
		System.out.println("Executed and Closed Windows Succesfully");
			

	}

}
