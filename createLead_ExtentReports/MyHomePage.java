package createLead_ExtentReports;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.devtools.v95.network.model.ReportStatus;

import basePage_ExtentReports.BasePage;

public class MyHomePage extends BasePage
{
	public MyLeadsPage clickLeadsTab() throws Exception 
	{
		try 
		{
			getDriver().findElement(By.linkText("Leads")).click();
			reportStep("Click on Leads tab", "pass");
		}
		catch (Exception e) 
		{
		reportStep("Unable to click leads tab", "fail");
		}
		return new MyLeadsPage();
	}
}
