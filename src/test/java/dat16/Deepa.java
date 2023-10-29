package dat16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Deepa {
	static ExtentReports report;
	static ExtentTest test;
	static WebDriver driver;
	
	public  static void browser(String browserValue)
	{
		switch(browserValue) {
		case "Edge":
			EdgeOptions option=new EdgeOptions ();
			option.addArguments("--remote -allow -origins=*");
			driver=new EdgeDriver(option);
			test.log(LogStatus.INFO, "open Edge browser");
			break;
	}
	}
	public  static void appUrl(String url)
	{
		driver.get(url);
		test.log(LogStatus.INFO, "open application url:"+url);

	}
	
	
	public static void typeIn(String xpathValue,String dataValue,String fieldName)
	{
		driver.findElement(By.xpath(xpathValue)).sendKeys(dataValue);
		test.log(LogStatus.INFO, "user enter value in"+fieldName+" as "+dataValue);
	}
	
	public static void clickIn(String xpathValue,String fieldName)
	{
		driver.findElement(By.xpath(xpathValue)).click();
		test.log(LogStatus.INFO, "user enter clickedin"+fieldName);


	}
	public static void clear(String xpathValue,String fieldName)
	{
		
		driver.findElement(By.xpath(xpathValue)).clear();
		test.log(LogStatus.INFO, "user enter clearin"+fieldName);

	
		
}
	public static void  startReport(String fileName)
	{
		report=new ExtentReports("\\src\\test\\resources\\"+fileName+".html");
	}
	
	
	public static void  startTest(String  testName,String description)
	{
		test=report.startTest(testName,description);
	}
	public static void  endTest()
	{
		report.endTest(test);
	}

	public static void  endReport()
	{
		report.flush();
	}

	
	
	
	public static void selDropdownByValue(String xpathValue,String dataValue)
	{
		Select dropDown=new Select(driver.findElement(By.xpath(xpathValue)));
		dropDown.selectByValue(dataValue);
	}
	public static void selDropdownByIndex(String xpathValue,int dataValue)
	{
		Select dropDown=new Select(driver.findElement(By.xpath(xpathValue)));
		dropDown.selectByIndex(dataValue);	}
	public static void selDropdownByText(String xpathValue,String dataValue)
	{
		Select dropDown=new Select(driver.findElement(By.xpath(xpathValue)));
		dropDown.selectByVisibleText(dataValue);
	}





	
	
	
	
	
	
	
	
	
	
	
	
	

}
