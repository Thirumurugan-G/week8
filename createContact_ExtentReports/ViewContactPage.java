package createContact_ExtentReports;

import java.io.IOException;

import org.openqa.selenium.By;

import basePage_ExtentReports.BasePage;

public class ViewContactPage extends BasePage
{
	public EditContactPage clickEditButton() throws Exception 
	{
		try
		{
			getDriver().findElement(By.linkText("Edit")).click();
			reportStep("Click Edit Button","pass");	
		}
		catch (Exception e) 
		{
		reportStep("Unable to click Edit button","fail");
		}
		return new EditContactPage();
	}
}
