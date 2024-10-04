package webDriver_methods;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToCaptureTitleOfWebpage {
	
	public static void main(String[]args) {
		
		// to launch empty browser
		
		ChromeDriver driver = new ChromeDriver();
		
		// to open flipkart
		
		driver.get("https://www.flipkart.com/");
		
		// for get title getTitle methodoc
		
		String titleofWebpage = driver.getTitle();
		
		System.out.println(titleofWebpage);
	}

}
