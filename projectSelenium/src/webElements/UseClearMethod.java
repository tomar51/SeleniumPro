package webElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UseClearMethod {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.vtiger.com/vtigercrm/");
		Thread.sleep(2000);
		
		WebElement usernameTextField = driver.findElement(By.id("username"));
		 usernameTextField.clear();
		 Thread.sleep(1000);
		 
		 usernameTextField.sendKeys("aditi");
		 Thread.sleep(1000);
		 
		WebElement passwordTextField = driver.findElement(By.id("password"));
		passwordTextField.clear();
		Thread.sleep(1000);
		
		passwordTextField.sendKeys("12344");
		Thread.sleep(2000);
		
		driver.quit();

	}

}
