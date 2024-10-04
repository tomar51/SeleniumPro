package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class UseIDLocator {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");

		Thread.sleep(2000);

		driver.findElement(By.id("email")).sendKeys("atrigudiya60@gmail.com");

		Thread.sleep(2000);

		driver.findElement(By.id("pass")).sendKeys("aditiatri7017@gmail");

		Thread.sleep(2000);

	}

}
