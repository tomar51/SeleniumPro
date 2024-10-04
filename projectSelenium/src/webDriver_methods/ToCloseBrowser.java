package webDriver_methods;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToCloseBrowser {
	
	public static void main(String[]args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://cornerhouseicecreams.com/");
		
		Thread.sleep(3000); // for wait
		
		// for close
		 
		driver.close();
	}

}

