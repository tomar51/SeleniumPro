package webElements;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleAutoSuggestion {

	public static void main(String[] args) {
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone");
		
		 List<WebElement> elementp = driver.findElements(By.xpath("//div[@class='left-pane-results-container']/div"));
		 
		 for(WebElement ele:elementp) {
			 
			 System.out.println(ele.getText());
		 }
		 driver.quit();

	}

}
