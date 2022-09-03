package Resources;

import org.openqa.selenium.By;

public class TestCaseData {


	public static String username="khan";
	public static String password="123";
	public static String firstName="Shadab";
	public static String lasttName="malik";
	public static String workemail ="shadabmalik7496@gmail.com"; 
	public static String company ="walmart";
	public static String phone ="9595783873";
	
	  
	
	public static String expectedTitle="Free CRM Trial: Salesforce 30-Day Trial- Salesforce IN";
	public static String expectedString="Please check your username . If you still can't log in, contact your Salesforce administrator.";
	public static String actualString="driver.findElement(By.xpath(\"//div[@id='error']\")).getText()";
	
	
	
}
