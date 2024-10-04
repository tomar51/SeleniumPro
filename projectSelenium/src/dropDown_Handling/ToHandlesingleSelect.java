package dropDown_Handling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToHandlesingleSelect {
	
	public static void main(String[]args) {
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	
	driver.get("https://www.facebook.com/signup");
	
	 WebElement dayDropdown = driver.findElement(By.id("day"));
	 WebElement monthDropdown = driver.findElement(By.id("month"));
	 WebElement yearDropdown = driver.findElement(By.id("year"));
	 
	 //use select class
	 
	 Select daySelect = new Select(dayDropdown);
	 Select monthSelect = new Select(monthDropdown);
	 Select yearSelect = new Select(yearDropdown);
	 
	 //call method
	 
	 daySelect.selectByIndex(9);
	 monthSelect.selectByValue("7");
	 yearSelect.selectByVisibleText("1997");
	 
	 // to check Single Select or Multi Select
	 
	 System.out.println(monthSelect.isMultiple());
	 
	 // to get every Options in dropdown (print name )
	 
	 List<WebElement> allMonths = monthSelect.getOptions();
	 for(WebElement month:allMonths) {
		 System.out.println(month.getText());
		 
		 monthSelect.selectByVisibleText(month.getText());  //magic just for see
		 
		 
 
	 }



}
}