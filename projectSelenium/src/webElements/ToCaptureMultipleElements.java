package webElements;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToCaptureMultipleElements {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.woodenstreet.com/");
		driver.findElement(By.id("loginclose1")).click();
		
		List<WebElement> elementne = driver.findElements(By.xpath("//ul[@class='container flex']//li"));
		
		for(WebElement ele : elementne) {        // for each loop
			
			System.out.println(ele.getText());
		}
		
		
		
		
	}

}
