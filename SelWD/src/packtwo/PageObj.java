package packtwo;

import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageObj {
	
//	By uid = By.id("login1");
//	By pwd = By.id("password");
	

	@FindBy(id="login1") WebElement loginid;
	@FindBy(id="password") WebElement passwd;
	@FindBy(name="proceed") WebElement loginbtn;
	
}
	

	

