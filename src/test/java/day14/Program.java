package day14;

public class Program  extends Framework{


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		startReport("demoapplication");
		startTest("demo", "testing application");
		browser("Chrome");
		appUrl("https://accounts.google.com/signup");
		typeIn("//input[@name='firstName']", "testA","firstName");
		typeIn("//input[@name='lastName']", "testA","lastName");
		clickIn("//input[@type='checkbox']","showPassword");
		
		endTest();
		endReport();

	}

}
