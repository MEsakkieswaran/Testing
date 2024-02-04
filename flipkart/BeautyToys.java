package flipkart;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BeautyToys {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://www.flipkart.com/");


		Actions mouse=new Actions(driver);
		mouse.moveByOffset(20, 20).click().perform();
		
		WebElement beautyToys = driver.findElement(By.xpath("//*[text()='Beauty, Toys & More']"));
		Actions action = new Actions(driver);
		action.moveToElement(beautyToys).perform();

		
		List<WebElement> beautyToysModuleOptions = driver.findElements(By.xpath("//*[@class='_16rZTH']/child::object/child::a"));
		for(int j=1;j<=beautyToysModuleOptions.size();j++) {
			WebElement beautyToysModule = driver.findElement(By.xpath("//*[text()='Beauty, Toys & More']"));
			Actions moduleAction = new Actions(driver);
			moduleAction.moveToElement(beautyToysModule).perform();
			WebElement moduleOption = driver.findElement(By.xpath("//*[@class='_16rZTH']/child::object/child::a["+j+"]"));
			System.out.println(j+"Success");
			moduleAction.moveToElement(moduleOption).perform();
			List<WebElement> beautyToysSubModuleOptions = driver.findElements(By.xpath("//*[@class='uAl2uE']/following::a"));
			for(int i=1;i<=beautyToysSubModuleOptions.size();i++) {
				WebElement beautyToys2 = driver.findElement(By.xpath("//*[text()='Beauty, Toys & More']"));
				Actions actions = new Actions(driver);
				actions.moveToElement(beautyToys2).perform();
				WebElement beautyToysSubModule = driver.findElement(By.xpath("//*[@class='_16rZTH']/child::object/child::a["+j+"]"));
				actions.moveToElement(beautyToysSubModule).perform();
				WebElement clickOption = driver.findElement(By.xpath("//*[@class='uAl2uE']/following::a["+i+"]"));
				action.moveToElement(clickOption).click().perform();
				driver.navigate().back();
				System.out.println(j+" "+i+" Success");
			}

		}

	}

}
