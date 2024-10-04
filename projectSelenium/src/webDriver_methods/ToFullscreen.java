package webDriver_methods;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToFullscreen {

	public static void main(String[] args) throws InterruptedException {
		
ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://skillrary.com/");
		
		Thread.sleep(2000);
		
		// to maximize
		
		driver.manage().window().maximize();
		

		Thread.sleep(2000); 
		
		// to minimize
		
		driver.manage().window().minimize();
		
		// to fullscreen
		
		driver.manage().window().fullscreen();


	}

}
