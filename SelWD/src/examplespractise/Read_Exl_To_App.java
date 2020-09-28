package examplespractise;

import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.FindElement;

import jxl.Sheet;
import jxl.Workbook;

public class Read_Exl_To_App {

	public static void main(String[] args) throws Exception{
		
		//Identifying file
		FileInputStream f=new FileInputStream("‪C:\\Users\\rgundla\\Desktop\\Qshore\\InputFiles\\UserCred.xls");
		
		//Opening file
		Workbook wb=Workbook.getWorkbook(f);
		
		//Opening Sheet
		Sheet s=wb.getSheet("Sheet1");
		
		//Opening webBrowser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rgundla\\Desktop\\Qshore\\Jars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get(s.getCell("A1").getContents());
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		//Identify email, password fields and input data from excel sheet into webpage
		driver.findElement(By.id(s.getCell(0, 1).getContents())).sendKeys(s.getCell(1,1).getContents());
		driver.findElement(By.id(s.getCell(0, 2).getContents())).sendKeys(s.getCell("B3").getContents());
	
			
		

	}

}
