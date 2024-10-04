package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToPerformMoveByOffSet {

	public static void main(String[] args) {
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://yonobusiness.sbi");
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		
		driver.findElement(By.id("password")).sendKeys("45678");
		
		Actions action = new Actions(driver);
		action.moveByOffset(688,311).clickAndHold().perform();
		


	}

}
