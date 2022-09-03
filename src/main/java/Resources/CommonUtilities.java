package Resources;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

public class CommonUtilities {

 
	
	// this is common method for dropdownhandle 
		 public static void dropdownhandle (WebElement dropdownXpath ,int dropdownvalue)     {
		   
			  Select s=new Select(dropdownXpath);
			  s.selectByIndex(dropdownvalue); 
		   
	   }

	        public  static void handleAssertions(String actual, String expected) {
			 
			   SoftAssert assertion=new SoftAssert();
		         assertion.assertEquals(actual,expected);
		         
		          assertion.assertAll();     // this is mandatory line
		
			 
			 
			 
			 
			 
		 
		 
	 }	 
		 
} 
