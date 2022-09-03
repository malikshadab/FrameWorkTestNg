package Resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	   public WebDriver driver;
	   public Properties prop;
	   
	  public WebDriver browserLaunch () throws IOException {
	
	     	 // This will read help us to data.properties file 
      FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\Resources\\data.properties");
				
         	// This will Access the data.properties
		        prop=new Properties();
		  
		        prop.load(fis);
		   
		   String browserName= prop.getProperty("browser");
		   
		   if(browserName.equalsIgnoreCase("chrome"))     {
			   
		     WebDriverManager.chromedriver().setup(); //this driver can latest version no need to update chrome
		//    WebDriverManager.chromedriver.version("102.0").setup(); this driver can old chrome
		    
		     driver= new ChromeDriver ();
				
			
		   }else if(browserName.equalsIgnoreCase("firefox"))   {
			   
			   // FireFox Code
			 
		   }   
		   else if(browserName.equalsIgnoreCase("Edge"))     {
			   
			   //Edge Code
			     
		   }
		   else {
			   
			  System.out.println("Please select valid browser"); 
			   
			   
		   }
		   
	           return driver;
		   
	  }	
	       @BeforeMethod
	       public void launchBrowser() throws IOException {
	    	   
	    	   browserLaunch();
			   driver.get(prop.getProperty("url"));  
	    	   
	       }
	  

	   /*    @AfterMethod
	       public void tearDown() throws IOException {
	    	   
	    	  browserLaunch();
			  
	    	   
	      }
	       */

}
