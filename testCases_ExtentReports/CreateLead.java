package testCases_ExtentReports;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import basePage_ExtentReports.BasePage;
import createLead_ExtentReports.LoginPage;

public class CreateLead extends BasePage
{
	@BeforeTest
	public void setData()
	{
		testName="LeafTaps";
		TestDescription="Create Lead";
		Author="Thirumurugan";
		category="sanity";
	}
	
	@Test
	public void createLeadExtentReportTest() throws Exception {
		new LoginPage()
		.typeUserName("DemoCSR")
		.typePassword("crmsfa")
		.clickLogin1()
		.clickCRMSFA()
		.clickLeadsTab()
		.clickcreateLead()
		.enterFirstName("Thirumurugan")
		.enterLastName("G")
		.enterCompanyName("TestLeaf")
		.clickSubmit()
		.verifyFirstName();
	}
}
