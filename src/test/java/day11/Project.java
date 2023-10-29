package day11;

public class Project extends framework {

	public static void main(String[] args) {
		
		startReport("demoapplication");
		startTest("demo", "testing application");
		browser("Edge");
		appUrl("https://accounts.google.com/signup");
		typeIn("//input[@name='firstName']", "testA","firstName");
		typeIn("//input[@name='lastName']", "testA","lastName");
		clickIn("//input[@type='checkbox']","showPassword");
		
		endTest();
		endReport();


	}

}
