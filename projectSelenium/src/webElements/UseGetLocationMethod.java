package webElements;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class UseGetLocationMethod {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		
		Point location = driver.findElement(By.xpath("//button[@type='submit']")).getLocation();
		System.out.println(location);
		System.out.println(location.getX());
		System.out.println(location.getY());
		
		driver.quit();
		

	}

}
