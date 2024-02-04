package flipkart;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HomeAndFurniture {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://www.flipkart.com/");


		Actions mouse=new Actions(driver);
		mouse.moveByOffset(20, 20).click().perform();
	
		WebElement homeAndFurniture = driver.findElement(By.xpath("//*[text()='Home & Furniture']"));
		Actions action = new Actions(driver);
		action.moveToElement(homeAndFurniture).perform();

		
		List<WebElement> homeAndFurnitureModuleOptions = driver.findElements(By.xpath("//*[@class='_16rZTH']/child::object/child::a"));
		for(int j=1;j<=homeAndFurnitureModuleOptions.size();j++) {
			WebElement homeAndFurnitureModule = driver.findElement(By.xpath("//*[text()='Home & Furniture']"));
			Actions moduleAction = new Actions(driver);
			moduleAction.moveToElement(homeAndFurnitureModule).perform();
			WebElement moduleOption = driver.findElement(By.xpath("//*[@class='_16rZTH']/child::object/child::a["+j+"]"));
			System.out.println(j+"Success");
			moduleAction.moveToElement(moduleOption).perform();
			List<WebElement> homeAndFurnitureSubModuleOptions = driver.findElements(By.xpath("//*[@class='uAl2uE']/following::a"));
			for(int i=1;i<=homeAndFurnitureSubModuleOptions.size();i++) {
				WebElement homeAndFurniture2 = driver.findElement(By.xpath("//*[text()='Home & Furniture']"));
				Actions actions = new Actions(driver);
				actions.moveToElement(homeAndFurniture2).perform();
				WebElement homeAndFurnitureSubModule = driver.findElement(By.xpath("//*[@class='_16rZTH']/child::object/child::a["+j+"]"));
				actions.moveToElement(homeAndFurnitureSubModule).perform();
				WebElement clickOption = driver.findElement(By.xpath("//*[@class='uAl2uE']/following::a["+i+"]"));
				action.moveToElement(clickOption).click().perform();
				driver.navigate().back();
				System.out.println(j+" "+i+" Success");
			}

		}

	}

}


