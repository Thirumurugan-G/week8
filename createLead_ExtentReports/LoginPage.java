package createLead_ExtentReports;

import java.io.IOException;

import org.openqa.selenium.By;

import basePage_ExtentReports.BasePage;

public class LoginPage extends BasePage
{
	public LoginPage typeUserName(String username) throws IOException 
	{
		try 
		{
			getDriver().findElement(By.id("username")).sendKeys(username);
			reportStep("Enter the Username ", "pass");	
		}
		catch (Exception e) 
		{
			reportStep("Unable to enter username ","fail");
		}
		return this;
	}
	public LoginPage typePassword(String password) throws IOException 
	{
		try 
		{
			getDriver().findElement(By.id("password")).sendKeys(password);
			reportStep("Enter the password ", "Pass");
		}
		catch(Exception e1)
		{
			reportStep("Unable to enter password ", "Fail");
		}
		return this; 
	}
	public HomePage clickLogin1() throws Exception
	{
		try 
		{
			getDriver().findElement(By.className("decorativeSubmit")).click();
			reportStep("Click the Login button","pass");	
		} 
		catch (Exception e) 
		{
			reportStep("Unable to click Login BUtton", "fail");
		}
		return new HomePage();
	}
}
