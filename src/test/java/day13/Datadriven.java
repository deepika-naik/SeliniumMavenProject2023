package day13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Datadriven {
	WebDriver driver;
@Test(dataProvider="demoTest")
	public void testCase(String userName,String password)
	{
	EdgeOptions options=new EdgeOptions();
	options.addArguments("--remote-allow-origins=*");
	 
	
	driver=new EdgeDriver(options);
		driver.get("https://demo.guru99.com/V1/index.php");
		driver.findElement(By.name("uid")).sendKeys(userName);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.name("btnLogin")).click();
	}
	
	@DataProvider(name="demoTest")
	public Object[][] testData1()
	{
		
		return new Object[][] {{"user1","pwd1"},
			{"user2","pwd2"},
			{"user3","pwd3"}};
	}}