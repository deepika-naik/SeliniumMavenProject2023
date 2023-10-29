package day14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Framework {
	static ExtentReports report;
	static ExtentTest test;
	static WebDriver driver;
	
	
	
	public static void browser(String browser) {
		switch(browser) {
		case "Chrome":
			
			driver=new ChromeDriver();
			test.log(LogStatus.INFO,"open chrome application");
		
			break;
			
			
	}
	}
	public static void appUrl(String Url) {
		driver.get(Url);
		test.log(LogStatus.INFO," open application url:+url");
	}
	public static void typeIn(String xpathValue,String dataValue,String fieldName)
	{
		driver.findElement(By.xpath(xpathValue)).sendKeys(dataValue);
		test.log(LogStatus.INFO, "user enter data  "+fieldName+" as "+dataValue);
	}
	public static void clickIn(String xpath,String fieldName)
	{
		driver.findElement(By.xpath(xpath)).click();
		test.log(LogStatus.INFO, "user clickedIn "+fieldName);
		
		}
	public static  void startReport(String fileName)
	{
		report=new ExtentReports(".\\src\\test\\resources\\"+fileName+".html");
		
	}
	public static void endReport()
	{
		report.flush();
	}
	
	
	public static void startTest(String testname,String description)
	{
		test=report.startTest(testname, description);
		
		}
	public static void endTest()
	{
		report.endTest(test);
	
	
	}}


