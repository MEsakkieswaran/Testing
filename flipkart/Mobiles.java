package flipkart;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mobiles {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

		driver.get("https://www.flipkart.com/");
		 

		Actions mouse=new Actions(driver);
		mouse.moveByOffset(20, 20).click().perform();
		
		//Mobiles Module
		WebElement mobiles = driver.findElement(By.xpath("//*[text()='Mobiles']"));
		mobiles.click();
		driver.navigate().back();


	}

}
