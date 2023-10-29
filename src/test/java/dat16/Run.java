package dat16;

public class Run  extends Framework{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		browser("edge");
		appUrl("https://demo.automationtesting.in/Register.html");
		typeIn("//input[@placeholder='First Name']", "testA");
		typeIn("//input[@placeholder='Last Name']", "testb");
		clickIn("//input[@value='Male']");
		clearAll("//input[@placeholder='First Name']");
		selDropdownByValue("//select[@id='yearbox']","1916");
		

	}

	}


