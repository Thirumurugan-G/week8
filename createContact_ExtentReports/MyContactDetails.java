package createContact_ExtentReports;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import basePage_ExtentReports.BasePage;

public class MyContactDetails extends BasePage
{
	public MyContactDetails typeFirstName(String fname) 
	{
		WebElement elementFirstName = getDriver().findElement(By.id("firstNameField"));
		elementFirstName.sendKeys(fname);
		return this;
	}
	
	public MyContactDetails typeLastName(String lName)
	{
		getDriver().findElement(By.id("lastNameField")).sendKeys(lName);
		return this;
	}
	
	public MyContactDetails typeFirstNameLocal(String fNameLocal) 
	{
		getDriver().findElement(By.id("createContactForm_firstNameLocal")).sendKeys(fNameLocal);
		return this;
	}
	
	public MyContactDetails typeLastNameLocal(String lNameLocal) 
	{
		getDriver().findElement(By.id("createContactForm_lastNameLocal")).sendKeys(lNameLocal);
		return this;
	}
	
	public MyContactDetails typeDepartmentName(String dept)
	{
		getDriver().findElement(By.id("createContactForm_departmentName")).sendKeys(dept);
		return this;
	}
	
	public MyContactDetails typeDescription(String descip) 
	{
		getDriver().findElement(By.id("createContactForm_description")).sendKeys(descip);
		return this;
	}
	
	public MyContactDetails typeprimaryEmail(String email) 
	{
		getDriver().findElement(By.id("createContactForm_primaryEmail")).sendKeys(email);
		return this;
	}
	
	public ViewContactPage clickCreateContactButton() throws Exception 
	{
		try 
		{
			getDriver().findElement(By.className("smallSubmit")).click();
			reportStep("Click Create Contact Submit Button", "pass");
		} 
		catch (Exception e) 
		{
			reportStep("Unable to Click Create Contact Submit Button", "fail");
		}
		return new ViewContactPage();
	}
}
