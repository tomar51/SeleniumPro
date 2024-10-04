package webElements;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class UseGetsizeMethod {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com/");
		Thread.sleep(3000);
		
		Dimension sizeOfWebelement = driver.findElement(By.xpath("//button[@type='submit']")).getSize();
		System.out.println(sizeOfWebelement);
		System.out.println(sizeOfWebelement.getHeight());
		System.out.println(sizeOfWebelement.getWidth());
		Thread.sleep(2000);
		
		driver.quit();
	}

}
