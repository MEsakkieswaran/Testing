package AutomationProject;

import java.awt.AWTException;
import java.awt.Robot;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class TestAutomationPractice {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new FirefoxDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();

		//1.Name Field
		WebElement name = driver.findElement(By.id("name"));
		name.sendKeys("Esakkieswaran");

		//2.Email Field
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("m.eswaran2012@gmail.com");

		//3.Phone Number Field
		WebElement phone = driver.findElement(By.id("phone"));
		phone.sendKeys("8608879783");

		//4.Address Field
		WebElement address = driver.findElement(By.id("textarea"));
		address.sendKeys("Sankarankovil, Tenkasi");

		//5.Gender Radio Button
		WebElement gender = driver.findElement(By.id("male"));
		gender.click();

		//6.Days Check Box
		List<WebElement> checkbox = driver.findElements(By.xpath("//input[@type='checkbox' and contains(@id,'day')]"));
		for(int i=0;i<checkbox.size();i++) {
			checkbox.get(i).click();
		}

		//7.Country Drop Down
		WebElement country = driver.findElement(By.id("country"));
		Select select = new Select(country);
		select.selectByVisibleText("India");

		//8.Colors Drop Down
		Actions colorsOption = new Actions(driver);
		WebElement fromOption = driver.findElement(By.xpath("//option[text()='Red']"));
		WebElement toOption = driver.findElement(By.xpath("//option[text()='White']"));
		colorsOption.clickAndHold(fromOption).moveToElement(toOption).release().build().perform();

		//9.Date Field
		WebElement date = driver.findElement(By.id("datepicker"));
		date.click();
		WebElement selectDate = driver.findElement(By.xpath("//*[text()='7']"));
		selectDate.click();

		//10.Open Card link
		WebElement cartLink = driver.findElement(By.partialLinkText("open cart"));
		cartLink.click();
		Thread.sleep(3000);
		driver.navigate().back();

		//11.OrangeHRM Link
		Thread.sleep(3000);
		WebElement hrmLink = driver.findElement(By.partialLinkText("orange"));
		hrmLink.click();
		Thread.sleep(3000);
		driver.navigate().back();

		//12.Posts (Atom) Link
		Thread.sleep(3000);
		String oldWindow = driver.getWindowHandle();
		WebElement subscribeTo = driver.findElement(By.linkText("Posts (Atom)"));
		subscribeTo.click();
		Thread.sleep(3000);
		Set<String> allWindows = driver.getWindowHandles();

		for(String window : allWindows) {
			if(!window .equals(oldWindow)) {
				driver.switchTo().window(window);
				driver.close();
			}

		}
		driver.switchTo().window(oldWindow);


		//13 Web Table
		List<WebElement> webTableRows = driver.findElements(By.xpath("//table[@name='BookTable']/child::tbody/child::tr"));
		int row = webTableRows.size();
		System.out.println("Number Of Rows Present In The Webtable is: "+row);

		List<WebElement> webTableColumns = driver.findElements(By.xpath("//table[@name='BookTable']/child::tbody/child::tr/child::th"));
		int columns = webTableColumns.size();
		System.out.println("Number Of Columns Present In The Webtable is: "+columns);


		//14.Pagination Table
		List<WebElement> pagination = driver.findElements(By.xpath("//*[@id='pagination']/li"));
		int pageNo = pagination.size();
		List<WebElement> row1 = driver.findElements(By.xpath("//*[@id='productTable']/tbody/tr"));
		int rows = row1.size();
		for (int p=1;p<=pageNo;p++) {
			WebElement product = driver.findElement(By.xpath("//*[@id='pagination']/li["+p+"]/a"));
			product.click();
			for (int r=1;r<=rows;r++) {
				WebElement products = driver.findElement(By.xpath("//*[@id='productTable']/tbody/tr["+r+"]/td/input"));
				products.click();
			}	
		}


		//15.Tabs
		WebElement tabs = driver.findElement(By.id("Wikipedia1_wikipedia-search-input"));
		tabs.sendKeys("Google");

		WebElement tabSearch = driver.findElement(By.className("wikipedia-search-button"));
		tabSearch.click();

		Thread.sleep(3000);
		WebElement searchResult = driver.findElement(By.xpath("//*[@id='wikipedia-search-result-link']/a[text()='Google']"));
		searchResult.click();
		Thread.sleep(3000);
		Set<String> allWindows1 = driver.getWindowHandles();
		for(String window1 : allWindows1) {
			if(!window1 .equals(oldWindow)) {
				driver.switchTo().window(window1);
				driver.close();
			}

		}
		driver.switchTo().window(oldWindow);


		//16.New Browser Window
		WebElement newBrowserWindow = driver.findElement(By.xpath(" //button[text()='New Browser Window']"));
		newBrowserWindow.click();
		Set<String> allWindows2 = driver.getWindowHandles();
		for(String window2 : allWindows2) {
			if(!window2 .equals(oldWindow)) {
				driver.switchTo().window(window2);
				driver.close();
			}

		}
		driver.switchTo().window(oldWindow);

		//17.Alert
		WebElement alertButton = driver.findElement(By.xpath("//*[text()='Alert']"));
		alertButton.click();

		Alert alert = driver.switchTo().alert();
		alert.accept();

		WebElement conformAlertButton= driver.findElement(By.xpath("//*[text()='Confirm Box']"));
		conformAlertButton.click();

		Alert conformAlert = driver.switchTo().alert();
		conformAlert.accept();

		WebElement promptButton= driver.findElement(By.xpath("//*[text()='Prompt']"));
		promptButton.click();

		Alert promptAlert = driver.switchTo().alert();
		promptAlert.sendKeys("Esakkieswaran");
		promptAlert.accept();

		//18.Double Click
		WebElement doubleClick= driver.findElement(By.xpath("//*[text()='Copy Text']"));
		Actions action = new Actions(driver);
		action.doubleClick(doubleClick).build().perform();

		//19.Drag And Drop
		WebElement moveFrom= driver.findElement(By.xpath("//*[text()='Drag me to my target']"));
		WebElement moveTo= driver.findElement(By.xpath("//*[text()='Drop here']"));
		action.dragAndDrop(moveFrom, moveTo).build().perform();

		//20.Slider
		WebElement slider = driver.findElement(By.id("slider"));
		action.dragAndDropBy(slider, 120, 0).build().perform();

		//21.Frame
		WebElement frame = driver.findElement(By.id("frame-one796456169"));
		driver.switchTo().frame(frame);

		WebElement frameName = driver.findElement(By.id("RESULT_TextField-0"));
		frameName.sendKeys("Esakkieswaran");

		WebElement frameGender =driver.findElement(By.xpath("//*[@id='RESULT_RadioButton-1_0']/following::*[1]"));
		frameGender.click();

		WebElement dob =driver.findElement(By.id("RESULT_TextField-2"));
		dob.sendKeys("08/03/1993");

		WebElement job = driver.findElement(By.id("RESULT_RadioButton-3"));
		Select select1 = new Select(job);
		select1.selectByVisibleText("Automation Engineer");

		//22.Submit Button
		WebElement submit = driver.findElement(By.id("FSsubmit"));
		submit.click();
		driver.switchTo().window(oldWindow);
		Thread.sleep(3000);

		//23.Resizeable
		WebElement resizeable = driver.findElement(By.xpath(" //div[@class='ui-resizable-handle ui-resizable-se ui-icon ui-icon-gripsmall-diagonal-se']"));
		action.dragAndDropBy(resizeable, 150, 0).build().perform();

	}

}




