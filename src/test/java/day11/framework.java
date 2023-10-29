package day11;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
public class framework {
	static WebDriver driver;
	static ExtentReports report;
	static ExtentTest test;

	
public static  void browser(String browserValue)

{
switch(browserValue) {	
case "Edge":
	EdgeOptions options=new EdgeOptions();
	options.addArguments("--remote-allow-origins=*");
	 
	
	driver=new EdgeDriver(options);
	
test.log(LogStatus.INFO,"open Edge browser");
break;

}
}


	public static void appUrl(String url)
	{
		driver.get(url);
		test.log(LogStatus.INFO, "Open application url: "+url);
	}

	
public static void typeIn(String fieldName,String xpathValue,String dataValue)
{
	driver.findElement(By.xpath(xpathValue)).sendKeys(dataValue);
	test.log(LogStatus.INFO, "enter value in:"+fieldName+"as "+dataValue);

}

public static void  clickIn(String fieldName,String xpathValue)
{
	driver.findElement(By.xpath(xpathValue)).click();
}
public static void startReport(String fileName)
{
	report = new ExtentReports(".\\src\\test\\resources\\"+fileName+".html");	
}

public static void endReport()
{
	report.flush();
}


public static void startTest(String testName,String description)
{
	test = report.startTest(testName,description);

}

public static void endTest()
{
	report.endTest(test);
}
}


