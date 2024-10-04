package webDriver_methods;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseGetMethod {

	public static void main(String[] args) {
	
		// for launch empty browser
		
		ChromeDriver driver = new ChromeDriver();
		
		// for launch site with get method
		
		driver.get("https://www.amazon.in/");
		
		driver.get("https://www.instagram.com/");
		
		// test with wrong url
		
		//driver.get("//www.amazon.in/");
		
		

	}

}
