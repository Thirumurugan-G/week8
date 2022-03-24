package createLead_ExtentReports;

import java.io.IOException;

import org.openqa.selenium.By;

import basePage_ExtentReports.BasePage;

public class MyLeadsPage extends BasePage
{
	public CreateLeadPage clickcreateLead() throws Exception 
	{
		try 
		{
			getDriver().findElement(By.xpath("//a[text()='Create Lead']")).click();	
			reportStep("Click on create lead ","pass");	
		}
		catch (Exception e) 
		{
			reportStep("Unable to click on create lead", "fail");
		}
		return new CreateLeadPage();
	}
}
