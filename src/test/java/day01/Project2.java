package day01;

public class Project2  extends Framework01{

	public static void main(String[] args) {
		browser("Edge");
		appUrl("https://accounts.google.com/signup");
		typeIn("//input[@name='firstName']", "testA");
		typeIn("//input[@name='lastName']", "testB");
		clickIn("//input[@type='checkbox']");
		clearAll("//input[@name='firstName']");
	}

	

}
