package testCases_ExtentReports;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import basePage_ExtentReports.BasePage;
import createContact_ExtentReports.LoginPage;

public class CreateContact extends BasePage 
{
	@BeforeTest
	public void setData()
	{
		testName="Leaf Taps";
		TestDescription="Create contact";
		Author="Thirumurugan";
		category="smoke";
	}
	
	@Test
	public void createContactExtentReportTest() throws Exception {
		new LoginPage()
		.typeUserName("DemoCSR")
		.typePassword("crmsfa")
		.clickLogin1()
		.clickCRMSFA()
		.clickContacts()
		.clickCreateContact()
		.typeFirstName("Thirumurugan")
		.typeLastName("G")
		.typeFirstNameLocal("Dinesh")
		.typeLastNameLocal("G")
		.typeDepartmentName("CS")
		.typeDescription("Computer Science")
		.typeprimaryEmail("thiru110298@gmail.com")
		.clickCreateContactButton()
		.clickEditButton()
		.clearAndTypeDescription()
		.clickUpdateContact()
		.verifyContact();
		
	}
}
