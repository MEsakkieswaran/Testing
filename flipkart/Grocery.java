package flipkart;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Grocery {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

		driver.get("https://www.flipkart.com/");


		Actions mouse=new Actions(driver);
		mouse.moveByOffset(20, 20).click().perform();
		//1.Search

		//2.Grocery Module
		WebElement grocery = driver.findElement(By.xpath("//*[text()='Grocery']"));
		grocery.click();
		driver.navigate().back();

	}

}
