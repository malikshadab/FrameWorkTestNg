package TestCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import PageOfObjectModel.LogInPageObject;
import PageOfObjectModel.SignUpPageObject;
import Resources.BaseClass;
import Resources.CommonUtilities;
import Resources.TestCaseData;

public class VerifySignUpTestCase extends BaseClass{

	
	@Test
	 public void SignUp () throws IOException, InterruptedException  {
		 
		
		  LogInPageObject lpo=new LogInPageObject(driver);
		  lpo.ClickonTryForFree().click();
		  Thread.sleep(4000);
		  
		  
	
		
		  SignUpPageObject spo=new SignUpPageObject(driver);
		  spo.EnterfirstName().sendKeys(TestCaseData.firstName);
		  spo.EnterlastName().sendKeys(TestCaseData.lasttName);
		  spo.workEmail().sendKeys(TestCaseData.workemail);
		  spo.Company().sendKeys(TestCaseData.company);
		  spo.Phone().sendKeys(TestCaseData.phone);
		  
		  
		  

		  String actualTitle=driver.getTitle();
		  String exceptedTitle=TestCaseData.expectedTitle;
		  CommonUtilities.handleAssertions(actualTitle, exceptedTitle);
		
	 
		 
		  CommonUtilities.dropdownhandle(spo.SelectJobTitle(),1);
		  CommonUtilities.dropdownhandle(spo.SelectEmployees(),2);
		  CommonUtilities.dropdownhandle(spo.SelectCountry(),3);
		
		  
		  
		
	}
	 
	
}
