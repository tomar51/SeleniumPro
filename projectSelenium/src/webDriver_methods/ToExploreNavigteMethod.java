package webDriver_methods;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToExploreNavigteMethod {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		//to maximize
		
		driver.manage().window().maximize();
		
		// to use navigate methods=
		
		driver.navigate().to("https://www.flipkart.com/");

	}

}
