package day08;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Program04 {
	@Test
	public void testCase_Edge_1()
	{
		WebDriver driver;
		driver = new EdgeDriver();
		driver.get("https://demo.guru99.com/V1/index.php");
		driver.findElement(By.name("uid")).sendKeys("EdgeUser1");
		driver.findElement(By.name("password")).sendKeys("password");
	}
	@Test
	public void testCase_Edge_2()
	{
		WebDriver driver;
		driver = new EdgeDriver();
		driver.get("https://demo.guru99.com/V1/index.php");
		driver.findElement(By.name("uid")).sendKeys("EdgeUser2");
		driver.findElement(By.name("password")).sendKeys("password");
	}
}
