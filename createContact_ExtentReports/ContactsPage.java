package createContact_ExtentReports;

import java.io.IOException;

import org.openqa.selenium.By;

import basePage_ExtentReports.BasePage;

public class ContactsPage extends BasePage
{
	public ContactsPage clickContacts() throws Exception
	{
		try 
		{
			getDriver().findElement(By.partialLinkText("Contacts")).click();
			reportStep("Click Contact Link Tab", "Pass");
		}
		catch (Exception e) 
		{
			reportStep("Unable to Click Contact Link Tab", "fail");
		}
		return this;
	}
	
	public MyContactDetails clickCreateContact() throws Exception 
	{
		try 
		{
			getDriver().findElement(By.partialLinkText("Create Contact")).click();
			reportStep("Click Create Contact Link", "Pass");
		}
		catch (Exception e) 
		{
			reportStep("Unable to Click Create Contact Link", "fail");
		}
		return new MyContactDetails();
	}

}
