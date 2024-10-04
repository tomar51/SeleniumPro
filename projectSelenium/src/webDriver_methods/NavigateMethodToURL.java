package webDriver_methods;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethodToURL {
	
public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		
		//to maximize
		
		driver.manage().window().maximize();
		
		// navigate method to(URL url)
		
		//driver.navigate().to(new URL("https://www.flipkart.com/ "));  // URL -> Java.net package
		

		// navigate methods
		
		driver.get("https://www.flipkart.com/");
		
		Thread.sleep(2000);
		
		Navigation nav = driver.navigate();
		
		nav.back(); // empty browser
		
		Thread.sleep(2000);
		
		nav.forward();  // flipkart 
		Thread.sleep(2000);
		
		nav.refresh();
		
		
		
		
		
		
		
		
		
}
}