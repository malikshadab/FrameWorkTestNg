package PageOfObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUpPageObject {
	public WebDriver driver;
	// driver.findElement(By.xpath("")).sendKeys();
	// we have achieve encapsulation
	
	  private By firstName=By.xpath("//input[@name='UserFirstName']");
	  private By lastName=By.xpath("//input[@name='UserLastName']");
	  private By workEmail=By.xpath("//input[@name='UserEmail']");
	  private By Company =By.xpath("//input[@name='CompanyName']");
	  private By Phone =By.xpath("//input[@name='UserPhone']");
	  private By JobTitle= By.xpath("//select[@name='UserTitle']");
	  private By Employees= By.xpath("//select[@name='CompanyEmployees']");
	  private By Country= By.xpath("//select[@name='CompanyCountry']");
	  
	  
	  
	  
	  public SignUpPageObject(WebDriver driver2) {
		this.driver=driver2;
	}

	public WebElement EnterfirstName ()   {
	    
	   return driver.findElement(firstName);
	 }
	  
	    public WebElement EnterlastName ()   {
	    
	    return driver.findElement(lastName);
	  }
	  
	       
	    public WebElement workEmail ()   {
	   	    
	    return driver.findElement(workEmail);
	  }
	 	  
	    
	  
	     public WebElement Company ()   {
	  	   	    
		 return driver.findElement(Company);
	 }
		 	  

	      public WebElement Phone ()   {
	  	   	    
		  return driver.findElement(Phone);
	}
		 
	      

	      public WebElement SelectJobTitle ()   {
	  	   	    
		  return driver.findElement(JobTitle);
	  }   
		  

	      public WebElement SelectEmployees ()   {
	  	   	    
		  return driver.findElement(Employees);
	  }   
		
	      
	      

	      public WebElement SelectCountry ()   {
	  	   	    
		  return driver.findElement(Country);
	  }   
		
	      
    
	      
}
