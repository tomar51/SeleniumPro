package webDriver_methods;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToExploreManageMethodMaxi {

	public static void main(String[] args) {
	
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://skillrary.com/");
		
		// to maximize
		
		driver.manage().window().maximize();

	}

}
