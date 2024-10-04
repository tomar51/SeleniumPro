package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToPerformScrollingAction {

	public static void main(String[] args) {
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.google.co.in/");
		driver.findElement(By.name("q")).sendKeys("flowers",Keys.ENTER);
		driver.findElement(By.xpath("(//div[text()='Images'])[1]")).click();
		
		// To use javaScriptExecutor
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		for(;;) {
			
			try {
				driver.findElement(By.xpath("//div[text()='destinations for blooms']")).click();
				break;
			}
			catch(Exception e) {
				
				js.executeScript("window.scrollBy(0,500)");
				
			}
		}

	}

}
