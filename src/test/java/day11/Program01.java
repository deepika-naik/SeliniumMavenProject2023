package day11;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Program01{
static ExtentReports report;
static ExtentTest test;
	public static void main(String[] args) {
	
report=new  ExtentReports(".\\src\\test\\resources\\may21.html");
test=report.startTest("Login","verify user able to  login with valid data");

test.log(LogStatus.INFO,"open Chrome browser");

test.log(LogStatus.INFO,"application url");
test.log(LogStatus.INFO,"enter uesr name");
test.log(LogStatus.INFO,"enter password");
test.log(LogStatus.INFO,"click  log in");
report.endTest(test);
report.flush();





















	}

}
