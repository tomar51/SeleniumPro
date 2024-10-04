package popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleCalenderPopUp {
	
	// WS for select date 22 feb

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.makemytrip.com/");
		driver.findElement(By.xpath("//span[@data-cy='closeModal']")).click();
		driver.findElement(By.xpath("//span[text()='Departure']")).click();
		
		for(;;) {
			
			try {
				// traverse to parent child write xpath for parent the traverse mein and write xpath for child
				
				driver.findElement(By.xpath("//div[text()='February 2025']/../..//p[text()='22']")).click();
				break;
			
			}catch(Exception e){
				
				driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
			}
		}
		

	}

}
