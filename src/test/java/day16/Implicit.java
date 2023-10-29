package day16;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.Select;

public class Implicit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		EdgeOptions options=new EdgeOptions();
		options.addArguments("--remote-allow-origins=*");
			driver = new EdgeDriver(options);
			driver.get("https://www.flipkart.com/");
			driver.findElement(By.xpath("//input[@title='Search for Products, Brands and More']")).sendKeys("lenovo"+Keys.ENTER);
			driver.findElement(By.xpath("//div[contains(text(),'Lenovo K8 Plus (Venom Black, 32 GB')]")).click();
			driver.findElement(By.xpath("//input[@value='3']"));
			
			
	}

	
}
