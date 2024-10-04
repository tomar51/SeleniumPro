package webElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnBooleanMethods {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize(); // upcasting // cross Browser testing
		
		/*driver.get("https://www.instagram.com/");
		Thread.sleep(3000);
		
		 WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
		 System.out.println("before enter data");
		 System.out.println(login.isDisplayed()); // true
		 System.out.println(login.isEnabled());   // false
		 System.out.println("================");
		 System.out.println("after enter data");
		 
		 driver.findElement(By.name("username")).sendKeys("aditi1234@gmail.com");
		 driver.findElement(By.name("password")).sendKeys("aditi12");
		 System.out.println(login.isDisplayed());  //true
		 System.out.println(login.isEnabled());    //true */
		
		driver.get("https://demoapp.skillrary.com/");
		Thread.sleep(2000);
		
		System.out.println("before selecting");
		WebElement element = driver.findElement(By.xpath("//option[@value='90']"));
		System.out.println(element.isSelected());  // false
		System.out.println("after selecting");
		element.click();
		System.out.println(element.isSelected());  //true
		Thread.sleep(1000);
		
		driver.quit();
		 
		 
	}

}
