package packtwo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReddifMailAccount {

	public static void main(String[] args) throws Exception{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rgundla\\Desktop\\Qshore\\Jars\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("http://mail.rediff.com");
		d.manage().window().maximize();
		
		//Opening first rediff webpage
		d.findElement(By.xpath("//a[@href='https://mail.rediff.com/cgi-bin/login.cgi' and @title='Lightning fast free email']")).click();
		Thread.sleep(1000);
		//Selecting New User Registration Link
		d.findElement(By.xpath("//a[@href='//register.rediff.com/register/register.php?FormName=user_details']")).click();
		Thread.sleep(1000);
		//Input User Fullname
		d.findElement(By.xpath("//input[@name='name2cbbdc7b']")).sendKeys("Ganapathi");
		//Select email id
		d.findElement(By.xpath("//input[@name='login2cbbdc7b']")).sendKeys("Ganapathi_01");
		//select password
		d.findElement(By.xpath("//input[@name='passwd2cbbdc7b']")).sendKeys("MATHA1");
		//Confirming the selected password
		d.findElement(By.xpath("//input[@name='confirm_passwd2cbbdc7b']")).sendKeys("MATHA1");
		//Mention alternate email id
		d.findElement(By.xpath("//input[@name='altemail2cbbdc7b']")).sendKeys("abcd@gmail.com");
		

	}

}
