package webDriver_methods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManageMethodGetSize {
	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
				
				driver.get("https://skillrary.com/");
				
				Thread.sleep(2000);
				
				// to maximize
				
				driver.manage().window().maximize();
				
			Dimension sizeOfBrowser = driver.manage().window().getSize();
			
			System.out.println(sizeOfBrowser);
				

}
}