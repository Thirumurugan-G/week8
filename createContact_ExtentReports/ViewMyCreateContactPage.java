package createContact_ExtentReports;

import org.openqa.selenium.By;

import basePage_ExtentReports.BasePage;

public class ViewMyCreateContactPage extends BasePage
{
	public ViewMyCreateContactPage verifyContact() 
	{
		String contactName = getDriver().findElement(By.id("viewContact_fullName_sp")).getText();
		System.out.println("Created Contact Name is :: "+contactName);
		return this;
	}
}
