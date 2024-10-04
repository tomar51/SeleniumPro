package webDriver_methods;

import org.openqa.selenium.chrome.ChromeDriver;


public class ToCaptureSessionId {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://skillrary.com/");

		Thread.sleep(2000);

		String sessionId = driver.getWindowHandle();

		System.out.println(sessionId); // 8F05351F9481D0AD0AA4395FEBF22016

	}

}
