package webDriver_methods;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToCaptureSourceCode {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		// to get page source
		
		String srcCode = driver.getPageSource();
		
		System.out.println(srcCode );
 
	}

}
