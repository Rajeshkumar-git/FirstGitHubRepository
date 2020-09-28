package examplespractise;

import java.io.FileInputStream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import jxl.Sheet;
import jxl.Workbook;
import jxl.biff.WorkbookMethods;
import jxl.biff.drawing.SheetDrawingWriter;

public class ReadExcel {

	public static void main(String[] args) throws Exception{
		
		//Identifying Excel File Location
		FileInputStream f=new FileInputStream("C:\\Users\\rgundla\\Desktop\\Qshore\\InputFiles\\Excelinput.xls");
		
		//Opening Excel File
		Workbook wb=Workbook.getWorkbook(f);
		
		//Opening required sheet in excel file
		Sheet s =wb.getSheet("Sheet1");
		
		
		
		/*
		int c; int r;
		c=s.getColumns();
		r=s.getRows();
		
			for(int i=0;i<c;i++){
				for(int j=0;j<r;j++)
					System.out.println(s.getCell(j, i).getContents());*/
		
		
		
		//Opening webBrowser
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\rgundla\\Desktop\\Qshore\\Jars\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				
				
				driver.get(s.getCell("A1").getContents());
				driver.manage().window().maximize();
				
				//Identify email, password fields and input data from excel sheet into webpage
				driver.findElement(By.id(s.getCell(0, 1).getContents())).sendKeys(s.getCell(1,1).getContents());
				driver.findElement(By.id(s.getCell(0, 2).getContents())).sendKeys(s.getCell("B3").getContents());
		
		
		
		
		
		
		}
			
	}


