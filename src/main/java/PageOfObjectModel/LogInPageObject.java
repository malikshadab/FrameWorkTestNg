package PageOfObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogInPageObject {

	public WebDriver driver;
	// driver.findElement(By.xpath("")).sendKeys();
	// we have achieve encapsulation
	
	  private By username=By.xpath("//input[@id='username']");
	  private By password=By.xpath("//input[@id='password']");
	  private By loginbutton=By.xpath("//input[@id='Login']");
	  private By tryforfree=By.xpath("//a[@id='signup_link']");
	   
	    public LogInPageObject(WebDriver driver2) {
		  this.driver=driver2;
	}

		public WebElement EnterUsername()   {
	    	//driver.findElement(By.xpath("//input[@id='username']");
	      return driver.findElement(username);
	    }
	   
	    public WebElement EnterPassword()   {
	    	return  driver.findElement(password);
	    }	
	    	
	     public WebElement Enterclicklogin()   {
	    	 return driver.findElement(loginbutton);
	     }	
	    	
	     public WebElement ClickonTryForFree()   {
	    	 return driver.findElement(tryforfree);
	     }	
	    	
	     
}
