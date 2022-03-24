package createLead_ExtentReports;

import java.io.IOException;

import org.openqa.selenium.By;

import basePage_ExtentReports.BasePage;

public class HomePage extends BasePage
{
	public MyHomePage clickCRMSFA() throws Exception 
	{
		try 
		{
			getDriver().findElement(By.linkText("CRM/SFA")).click();
			reportStep("Click the CRM/SFA link", "pass");	
		}
		catch (Exception e) 
		{
			reportStep("Unable to click CRM/SFA link ", "fail");
		}
		return new MyHomePage();
	}
}
