package TestCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import PageOfObjectModel.LogInPageObject;
import Resources.BaseClass;
import Resources.CommonUtilities;
import Resources.TestCaseData;

public class VerifyLoginTestCase extends BaseClass {
       
	   // we have achieved in inheritance
	   
	    @Test
	   public void login(  ) throws IOException {
		   
		  
		   
		  LogInPageObject lpo=new LogInPageObject(driver);
		   
		   lpo.EnterUsername().sendKeys(TestCaseData.username);
		   lpo. EnterPassword().sendKeys(TestCaseData.password);
		   lpo.Enterclicklogin().click();
		   
		   
	      String expected="Please check your username and password. If you still can't log in, contact your Salesforce administrator.";
		   
		  String actual=driver.findElement(By.xpath("//div[@id='error']")).getText();
	     
		  CommonUtilities.handleAssertions(actual, expected);
		  
		   
	   }
		
}
