package flipkart;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Electronics {

	public static void main(String[] args) throws InterruptedException {
		
			WebDriver driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

			driver.get("https://www.flipkart.com/");

			Thread.sleep(5000);
			Actions mouse=new Actions(driver);
			mouse.moveByOffset(20, 20).click().perform();
			
		
			WebElement electronics = driver.findElement(By.xpath("//*[text()='Electronics']"));
			Actions action = new Actions(driver);
			action.moveToElement(electronics).perform();

			 
			List<WebElement> electronicsModuleOptions = driver.findElements(By.xpath("//*[@class='_16rZTH']/child::object/child::a"));
			for(int j=1;j<=electronicsModuleOptions.size();j++) {
				WebElement electronicsModule = driver.findElement(By.xpath("//*[text()='Electronics']"));
				Actions moduleAction = new Actions(driver);
				moduleAction.moveToElement(electronicsModule).perform();
				WebElement moduleOption = driver.findElement(By.xpath("//*[@class='_16rZTH']/child::object/child::a["+j+"]"));
				System.out.println(j+"Success");
				moduleAction.moveToElement(moduleOption).perform();
				List<WebElement> electronicsSubModuleOptions = driver.findElements(By.xpath("//*[@class='uAl2uE']/following::a"));
				for(int i=1;i<=electronicsSubModuleOptions.size();i++) {
					WebElement electronics2 = driver.findElement(By.xpath("//*[text()='Electronics']"));
					Actions actions = new Actions(driver);
					actions.moveToElement(electronics2).perform();
					WebElement electronicsSubModule = driver.findElement(By.xpath("//*[@class='_16rZTH']/child::object/child::a["+j+"]"));
					actions.moveToElement(electronicsSubModule).perform();
					WebElement clickOption = driver.findElement(By.xpath("//*[@class='uAl2uE']/following::a["+i+"]"));
					action.moveToElement(clickOption).click().perform();
					driver.navigate().back();
					System.out.println(j+" "+i+" Success");
				}

			}

		}
	}
