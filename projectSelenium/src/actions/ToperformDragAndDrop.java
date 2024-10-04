package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToperformDragAndDrop {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");

		// To switch frame

		WebElement iframe = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
		driver.switchTo().frame(iframe);

		// identify images

		WebElement image1 = driver.findElement(By.xpath("//img[@alt='The peaks of High Tatras']"));
		WebElement image2 = driver.findElement(By.xpath("//img[@alt='The chalet at the Green mountain lake']"));
		WebElement image3 = driver.findElement(By.xpath("//img[@alt='Planning the ascent']"));
		WebElement image4 = driver.findElement(By.xpath("//img[@alt='On top of Kozi kopka']"));

		// identify trash

		WebElement trashBox = driver.findElement(By.id("trash"));

		// identify gallery
		WebElement gallery = driver.findElement(By.id("gallery"));

		// to drag image in to trash
		Actions actions = new Actions(driver);
		actions.dragAndDrop(image1, trashBox).perform();
		Thread.sleep(2000);
		//actions.dragAndDrop(image2, trashBox).perform();
		
		actions.dragAndDropBy(image2,693,0 ).perform();
		
		Thread.sleep(2000);
		//actions.dragAndDrop(image3, trashBox).perform();
		
		actions.clickAndHold(image3).moveToElement(trashBox).release().perform();
		Thread.sleep(2000);
		actions.dragAndDrop(image4, trashBox).perform();
		Thread.sleep(3000);

		// to drag image to gallery

		actions.dragAndDrop(image1, gallery).perform();
		Thread.sleep(2000);
		actions.dragAndDrop(image2, gallery).perform();
		Thread.sleep(2000);
		actions.dragAndDrop(image3, gallery).perform();
		Thread.sleep(2000);
		actions.dragAndDrop(image4, gallery).perform();
		Thread.sleep(2000);
		
		driver.quit();

	}

}
