package dat16;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Report1 {
static ExtentReports report;
static  ExtentTest test;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
report=new ExtentReports(".\\src\\test\\resources\\Sep11.html");
test=report.startTest("Login", "verify the user able  to login with valid data");
test.log(LogStatus.INFO, "Open Chrome browser");
test.log(LogStatus.INFO, "Open Application url");

test.log(LogStatus.INFO, "enter user name");
test.log(LogStatus.INFO, " enter password");
test.log(LogStatus.INFO, "click login");
report.endTest(test);
report.flush();


	}

}
