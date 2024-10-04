package webDriver_methods;

import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManageMethodGetPosition {

	public static void main(String[] args) throws InterruptedException {
	
ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://skillrary.com/");
		
		Thread.sleep(2000);
		
		// get position
		
		/*Point pos = driver.manage().window().getPosition();
		
		System.out.println(pos);*/
		
		// set position 
		
		// type 1
		
		/*Point p = new Point(180,90);
		driver.manage().window().setPosition(p);*/
		
		// type 2
		
		driver.manage().window().setPosition(new Point(170,80)); 
		
		

	}

}
