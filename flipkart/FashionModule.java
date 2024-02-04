package flipkart;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FashionModule {

	public static void main(String[] args)  {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://www.flipkart.com/");
		 

		Actions mouse=new Actions(driver);
		mouse.moveByOffset(20, 20).click().perform();
		//Fashion Module
		WebElement fashion = driver.findElement(By.xpath("//*[text()='Fashion']"));
		Actions action = new Actions(driver);
		action.moveToElement(fashion).perform();

		// Fashion Sub-Module Men's Top wear 
		List<WebElement> fashionModuleOptions = driver.findElements(By.xpath("//*[@class='_16rZTH']/child::object/child::a"));
		for(int j=1;j<=fashionModuleOptions.size();j++) {
			WebElement fashionModule = driver.findElement(By.xpath("//*[text()='Fashion']"));
			Actions moduleAction = new Actions(driver);
			moduleAction.moveToElement(fashionModule).perform();
			WebElement moduleOption = driver.findElement(By.xpath("//*[@class='_16rZTH']/child::object/child::a["+j+"]"));
			System.out.println(j+"Success");
			moduleAction.moveToElement(moduleOption).perform();
			List<WebElement> fashionSubModuleOptions = driver.findElements(By.xpath("//*[@class='uAl2uE']/following::a"));
			for(int i=1;i<=fashionSubModuleOptions.size();i++) {
				WebElement fashion2 = driver.findElement(By.xpath("//*[text()='Fashion']"));
				Actions actions = new Actions(driver);
				actions.moveToElement(fashion2).perform();
				WebElement fashionSubModule = driver.findElement(By.xpath("//*[@class='_16rZTH']/child::object/child::a["+j+"]"));
				actions.moveToElement(fashionSubModule).perform();
				WebElement clickOption = driver.findElement(By.xpath("//*[@class='uAl2uE']/following::a["+i+"]"));
				action.moveToElement(clickOption).click().perform();
				driver.navigate().back();
				System.out.println(j+" "+i+" Success");
			}
		}

	}



}
