package createContact_ExtentReports;

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
			reportStep("Entered username ", "Pass");
		}
		catch(Exception e) 
		{
			reportStep("Unable to enter username", "Fail");
		}
		return this;
	}

	public LoginPage typePassword(String password) throws IOException 
	{
		try
		{
			getDriver().findElement(By.id("password")).sendKeys(password);
			reportStep("Enter password","pass");
		}
		catch(Exception e)
		{
			reportStep("Invalid Password Credential", "Fail");
		}
		return this; 
	}
	public HomePage clickLogin1() throws Exception   
	{
		try 
		{
			getDriver().findElement(By.className("decorativeSubmit")).click();
			reportStep("Click Login Button", "pass");
		} catch (Exception e) 
		{
			reportStep("Unable to click Login button","Fail");
		}
		return new HomePage();
	}

}
