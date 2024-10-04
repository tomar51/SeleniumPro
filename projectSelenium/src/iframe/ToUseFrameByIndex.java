package iframe;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseFrameByIndex {

	public static void main(String[] args) {
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(14));
		
		driver.get("https://www.dream11.com/");
		
		//using index
		
	    //driver.switchTo().frame(0);
		
		//Using string name or id
		//driver.switchTo().frame("send-sms-iframe");
		
		
		//Using by WebElement
		
		 WebElement iframe = driver.findElement(By.xpath("//iframe[@title='Iframe Example']"));
		 driver.switchTo().frame(iframe);
		 
		driver.findElement(By.id("regEmail")).sendKeys("9683457652");
		
		// to switch parent window
		//driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();
		
		driver.findElement(By.linkText("About Us")).click();


	}

}
