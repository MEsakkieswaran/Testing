package flipkart;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Travel {
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://www.flipkart.com/");


		Actions mouse=new Actions(driver);
		mouse.moveByOffset(20, 20).click().perform();
		
		WebElement travel = driver.findElement(By.xpath("//*[text()='Travel']"));
		travel.click();

	}

}
