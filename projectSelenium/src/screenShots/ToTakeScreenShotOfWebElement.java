package screenShots;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ToTakeScreenShotOfWebElement {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.udemy.com/");
		Thread.sleep(3000);
		
		File temp = driver.findElement(By.xpath("//img[@loading='lazy'and@alt='Udemy']")).getScreenshotAs(OutputType.FILE);
		File src = new File("./errorShots/Udemylogo.png");
		FileHandler.copy(temp, src);
		
		driver.quit();

	}

}
