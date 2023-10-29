package day01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;


public class Framework01 {
static WebDriver driver;
public  static void  browser(String browserValue)
{
	switch( browserValue)
	{
	case "Edge":
		
		EdgeOptions options=new EdgeOptions();
		options.addArguments("--remote-allow-origins=*");
		 
		
		driver=new EdgeDriver(options);
	break;
	}
}
public static void appUrl(String appUrl) {
	driver.get(appUrl);
}

public static void typeIn(String xpathValue,String dataValue)
{
	driver.findElement(By.xpath(   xpathValue)).sendKeys(dataValue);
}

public static void clickIn(String xpathValue)
{
	driver.findElement(By.xpath( xpathValue  )).click();
}




public static void clearAll(String xpathValue)
{
	driver.findElement(By.xpath( xpathValue  )).click();
}



}
