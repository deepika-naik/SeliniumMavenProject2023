package dat16;

public class Sunday extends Deepa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
startReport("demoapplication");
startTest("demo","testing application");
browser("Edge");
appUrl("https://demo.automationtesting.in/Register.html");
typeIn("//input[@placeholder='First Name']", "testA","First Name");
typeIn("//input[@placeholder='Last Name']", "testb","Last Name");

clear("//input[@placeholder='First Name']","First Name");

endTest();
endReport();
	}

}
