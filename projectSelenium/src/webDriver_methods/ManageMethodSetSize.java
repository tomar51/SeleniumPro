package webDriver_methods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManageMethodSetSize {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://skillrary.com/");
		
		Thread.sleep(2000);
		
		// for set size
		
		// type 1
		
		/*Dimension d = new Dimension(800,500);
		
		driver.manage().window().setSize(d);*/
		
		//type 2
		
		driver.manage().window().setSize(new Dimension(500,600));

	}

}
