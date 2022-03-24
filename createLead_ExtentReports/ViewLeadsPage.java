package createLead_ExtentReports;

import org.openqa.selenium.By;

import basePage_ExtentReports.BasePage;

public class ViewLeadsPage extends BasePage
{
	public ViewLeadsPage verifyFirstName() 
	{
		String text = getDriver().findElement(By.id("viewLead_firstName_sp")).getText();
	    System.out.println("First name = "+text);
		return this;
	}
}
