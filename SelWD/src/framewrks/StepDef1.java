package framewrks;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDef1 {

	WebDriver driver;

	@Given("^Url is entered and application is launced$")
	public void url_is_entered_and_application_is_launced() throws Exception{
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rgundla\\Desktop\\Qshore\\Jars\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://facebook.com");
		driver.manage().window().maximize();	
		
		File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File("C:\\Users\\rgundla\\Desktop\\Qshore\\scrsht\\s1.jpeg"));
		
	}

	@When("^Typein username and password$")
	public void typein_username_and_password() throws Exception{
		driver.findElement(By.id("email")).sendKeys("Cucumber");
		driver.findElement(By.id("pass")).sendKeys("ajhd2");
		
		File f1=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f1,new File("C:\\Users\\rgundla\\Desktop\\Qshore\\scrsht\\s2.jpeg"));
	    
	}

	@Then("^Close the application$")
	public void close_the_application() {
	    driver.close();
	}
	
}
