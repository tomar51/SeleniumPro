package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class UseXpathByAttribute {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Log in ")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
	

	}
	

}
