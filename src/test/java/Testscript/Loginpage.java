package Testscript;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.PropertyConfigurator;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import Base.Log;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;
//import com.aventstack.extentreports.LogStatus;



import org.openqa.selenium.support.PageFactory;

import Base.Browser;
import Base.WebDriverCommonLib;
import Pages.ApplicationNavigationPage;
import Pages.ClaimManagment;
import Pages.HomepAgeSherwin;
import Pages.LoginPagePges;

public class Loginpage {

	
	WebDriver driver;
	LoginPagePges lgnpg;
	ApplicationNavigationPage applctnpg;
	ClaimManagment claimpage;
	HomepAgeSherwin hmpg;
	WebDriverCommonLib wLib;
	Base.ExcelLib eLib = new Base.ExcelLib();
	public ExtentReports extent;
	public static ExtentTest test;
	public static String TC_ID;
	static int sNo=1;
	
	
	@BeforeSuite
	public void setResorces()
	{
		ClassLoader classLoader = getClass().getClassLoader();

	}
	@BeforeMethod
	public void invokebrowser()
	{
		
		driver=Browser.getBrowser();
	//	Base.Log.info("Browser is set as :::"+driver);
		driver.manage().window().maximize();
		driver.get("https://www.sherwin-williams.com/");
						
		

		wLib = new WebDriverCommonLib();
		lgnpg=new LoginPagePges();
		applctnpg=new ApplicationNavigationPage();
		claimpage=new ClaimManagment();
		hmpg=new HomepAgeSherwin();
		
		
		
	}
	@AfterMethod
	public void Quitbrowser() throws InterruptedException
	{
		Thread.sleep(20000);
		driver.quit();
	}
	
	@Test(priority=1)
	public void startapplication() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		
		
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		
		hmpg.loginToApp();
		
		
	}
	
	
	
	
	/*@Test(priority=1)
	public void startapplication() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		
		
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		
		String username=eLib.getExcelData("Sheet1", 1, 0);
		String password=eLib.getExcelData("Sheet1", 1, 1);
		String companyid=eLib.getExcelData("Sheet1", 1, 2);
		lgnpg.loginToApp(companyid,username,password);
		eLib.setExcelData("Sheet1", 1, 5, "Testcase Passed");
		
	}
	
	@Test(priority=2)
	public void navigateApplication() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		//wLib.getDBConnection();
		String value=wLib.getMultipleValueDBResult("select * from party_person_name where PARTY_PERS_NM_NM_FST='Sarah'");
		System.out.println(value);
		String username=eLib.getExcelData("Sheet1", 1, 0);
		String password=eLib.getExcelData("Sheet1", 1, 1);
		String companyid=eLib.getExcelData("Sheet1", 1, 2);
		lgnpg.loginToApp(companyid,username,password);
		applctnpg.clickNewproject();
	}
	
	@Test(priority=3)
	public void CreateClaim() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
	
		String noofpolicyrequired=eLib.getExcelData("Sheet1", 1, 4);
		int noofpolicyrequireds = Integer.parseInt(noofpolicyrequired);	
		System.out.println(noofpolicyrequireds);
	//	int noofpolicyrequireds=2;
		String username=eLib.getExcelData("Sheet1", 1, 0);
		String password=eLib.getExcelData("Sheet1", 1, 1);
		String companyid=eLib.getExcelData("Sheet1", 1, 2);
		lgnpg.loginToApp(companyid,username,password);
		claimpage.CreateClaim(noofpolicyrequireds);
		
		
	}
*/	


}
