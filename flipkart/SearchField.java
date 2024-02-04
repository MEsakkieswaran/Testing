package flipkart;

import java.time.Duration;
import java.util.Set;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SearchField {
	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://www.flipkart.com/"); 

		Actions mouse=new Actions(driver);
		mouse.moveByOffset(20, 20).click().perform();

		WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys("Mobiles");
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		String oldWindow = driver.getWindowHandle();
		WebElement mobiles = driver.findElement(By.xpath("//img[@loading='eager']"));
		mobiles.click();
		Set<String> allWindows = driver.getWindowHandles();
		for(String newWindow : allWindows) {

			driver.switchTo().window(newWindow);	
		}
		Thread.sleep(3000);
		WebElement card = driver.findElement(By.xpath("//*[@class='_2KpZ6l _2U9uOA _3v1-ww']"));
		mouse.moveToElement(card).click().perform();
		WebElement placeOrder = driver.findElement(By.xpath("//*[@class='_2KpZ6l _2ObVJD _3AWRsL']"));
		placeOrder.click();

	}
}
