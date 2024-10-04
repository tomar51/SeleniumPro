package webElements;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class UseGetAttributeMethod {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.actitime.com/");
		Thread.sleep(3000);
		
		String value = driver.findElement(By.linkText("Try Free")).getAttribute("href");
		
		System.out.println(value);
		Thread.sleep(1000);
		
		driver.quit();

	}

}
