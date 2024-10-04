package Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UseTagNameLocator {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.amazon.in/");
		
		Thread.sleep(2000);

		List<WebElement> images = driver.findElements(By.tagName("img"));
		
		System.out.println(images.size());

	}

}
