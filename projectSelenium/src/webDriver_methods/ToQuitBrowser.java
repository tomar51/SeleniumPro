package webDriver_methods;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToQuitBrowser {

	public static void main(String[] args) throws InterruptedException {
	
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		Thread.sleep(3000);
		
		driver.quit();

	}

	
}
