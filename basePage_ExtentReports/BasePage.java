package basePage_ExtentReports;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasePage 
{
	public static ExtentReports extent; 
	public static Properties prop1;
	public static ExtentTest test;
	public String testName,TestDescription,Author,category;
	public static String text;
	private static final ThreadLocal<ChromeDriver> tlDriver =new ThreadLocal<ChromeDriver>();

	public void setDriver(ChromeDriver driver)
	{
		tlDriver.set(driver);
	}
	
	public ChromeDriver  getDriver()
	{
		return tlDriver.get();
	}
	
	@BeforeMethod
	public void launch() throws IOException 
	{
		WebDriverManager.chromedriver().setup();
		setDriver(new ChromeDriver());
		getDriver().manage().window().maximize();
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		Properties prop=new Properties();
		FileInputStream fis= new FileInputStream
				(new File("./src/test/resources/Login.properties"));
		prop.load(fis);
		getDriver().get(prop.getProperty("url"));
		String lang = prop.getProperty("language");
		
		prop1=new Properties();
		FileInputStream fis1= new FileInputStream(new File("./src/test/resources/"+lang+".properties"));
		prop1.load(fis1);
	}
	
	public int takeSnaps() throws IOException
	{
		int random =(int) (Math.random() *99999999);
		File src = getDriver().getScreenshotAs(OutputType.FILE);
		File dest=new File("./src/test/resources/snaps/img"+random+".jpg");
		FileUtils.copyFile(src, dest);
		return random;
	}

	@BeforeSuite
	public void startReport() 
	{
		ExtentHtmlReporter reporter = new ExtentHtmlReporter("./src/test/resources/reports/result.html");
		extent = new ExtentReports();
		extent.attachReporter(reporter);

	}
	
	@BeforeClass
	public void createTest() 
	{
		test = extent.createTest(testName,TestDescription);
		test.assignAuthor(Author);
		test.assignCategory(category);
	}
	
	public void reportStep(String message,String Status) throws IOException 
	{
		if (Status.equalsIgnoreCase("Pass")) 
		{
			test.pass(message,MediaEntityBuilder.createScreenCaptureFromPath
					(".././snaps/img"+takeSnaps()+".jpg").build());
		} 
		else if(Status.equalsIgnoreCase("Fail"))
		{
			test.fail(message, MediaEntityBuilder.createScreenCaptureFromPath
					(".././snaps/img"+takeSnaps()+".jpg").build());
		}
	}
	
	@AfterSuite
	public void stopReports() 
	{
		extent.flush();
	}

	@AfterMethod
	public void tearDown() 
	{
		getDriver().close();
	}
}
