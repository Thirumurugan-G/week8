package createContact_ExtentReports;

import java.io.IOException;

import org.openqa.selenium.By;

import basePage_ExtentReports.BasePage;

public class HomePage extends BasePage
{
	public ContactsPage clickCRMSFA() throws Exception 
	{
		try 
		{
			getDriver().findElement(By.linkText("CRM/SFA")).click();
			reportStep("Click MyHomePage Link", "pass");
		}
		catch (Exception e) 
		{
			reportStep("Unable to Click MyHomePage Link", "fail");
		}
		return new ContactsPage();
	}
}
