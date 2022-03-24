package createLead_ExtentReports;

import java.io.IOException;

import org.openqa.selenium.By;

import basePage_ExtentReports.BasePage;

public class CreateLeadPage extends BasePage
{
	public CreateLeadPage enterFirstName(String fname) 
	{
		getDriver().findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
		return this;
	}
	
	public CreateLeadPage enterLastName(String lname) 
	{
		getDriver().findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
		return this;
	}
	
	public CreateLeadPage enterCompanyName(String compname) 
	{
		getDriver().findElement(By.id("createLeadForm_companyName")).sendKeys(compname);
		return this;
	}

	public ViewLeadsPage clickSubmit() throws Exception 
	{
		try 
		{
			getDriver().findElement(By.xpath("//input[@value='Create Lead']")).click();
			reportStep("Click on viewLeadPage Submit button", "pass");	
		}
		catch (Exception e) 
		{
			reportStep("Unable to click on viewLeadPage submit button", "fail");
		}
		return new ViewLeadsPage();
	}
}
