package popups;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ToAvoidNotificationPopup {

	public static void main(String[] args) {
		
		// Change bowser settings
		
		ChromeOptions setting = new ChromeOptions();
		setting.addArguments("--disable-notifications");
		
		// 2 way to do 
		//setting.addArguments("--incognito");
		
		
		WebDriver driver = new ChromeDriver(setting); // pass the variable here
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(14));
		
		driver.get("https://www.yatra.com/");
		

	}

}
