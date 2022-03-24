package createContact_ExtentReports;

import java.io.IOException;

import org.openqa.selenium.By;

import basePage_ExtentReports.BasePage;

public class EditContactPage extends BasePage
{
	public EditContactPage clearAndTypeDescription() 
	{
		getDriver().findElement(By.id("updateContactForm_description")).clear();
		getDriver().findElement(By.id("updateContactForm_importantNote")).sendKeys("Confidential");
		return this;
	}
	
	public ViewMyCreateContactPage clickUpdateContact() throws Exception 
	{
		try
		{
			getDriver().findElement(By.xpath("//input[@value='Update']")).click();
			reportStep("Click Update Buttton","pass");
		}catch (Exception e) 
		{
			reportStep("Unable to click Update button","fail");
		}
		return new ViewMyCreateContactPage();
	}
}
