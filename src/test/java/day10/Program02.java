package day10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Listener.class)

public class Program02  extends Framework{

	@Test
	public void testCase()
	{
		WebDriver driver;
	ChromeOptions options=new ChromeOptions();
	options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		driver.get("https://demo.guru99.com/V1/index.php");
		driver.findElement(By.name("uid")).sendKeys("ChromeUsr1");
		driver.findElement(By.name("password22")).sendKeys("password");
	}
		
		
		
		
	}


