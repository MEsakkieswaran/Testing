package flipkart;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TwoWheelers {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://www.flipkart.com/");


		Actions mouse=new Actions(driver);
		mouse.moveByOffset(20, 20).click().perform();
		
		WebElement twoWheelers = driver.findElement(By.xpath("//*[text()='Two Wheelers']"));
		Actions action = new Actions(driver);
		action.moveToElement(twoWheelers).perform();

		 
		List<WebElement> twoWheelersModuleOptions = driver.findElements(By.xpath("//*[@class='_16rZTH']/child::object/child::a"));
		for(int i=1;i<=twoWheelersModuleOptions.size();i++) {
			WebElement twoWheelersModule = driver.findElement(By.xpath("//*[text()='Two Wheelers']"));
			Actions moduleAction = new Actions(driver);
			moduleAction.moveToElement(twoWheelersModule).perform();
			WebElement moduleOption = driver.findElement(By.xpath("//*[@class='_16rZTH']/child::object/child::a["+i+"]"));
			moduleAction.moveToElement(twoWheelers).perform();
			System.out.println(i+"Success");
			
		}


	}

}
