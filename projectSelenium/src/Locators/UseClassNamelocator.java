package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class UseClassNamelocator {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
	
		driver.manage().window().maximize();
		
		/*driver.get("https://www.instagram.com/");
		
		Thread.sleep(2000);
		
	    driver.findElement(By.className("_aa4b _add6 _ac4d _ap35")).sendKeys("adb");
		*/
		
		driver.get("https://demowebshop.tricentis.com/");
		
		Thread.sleep(2000);
		
		driver.findElement(By.className("ico-login")).click();

	}

}
