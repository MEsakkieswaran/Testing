package AutomationProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
public class DemoSiteAutomation {


	public static void main(String[] args) 
	{
		WebDriver driver= new EdgeDriver();
		driver.manage().window().maximize();
		//Web Address
		driver.get("http://demo.automationtesting.in/Register.html");
		//Firstname
		WebElement firstname= driver.findElement(By.xpath("//input[@type=\"text\"][1]"));
		firstname.sendKeys("Esakkieswaran");
		//Lastname
		WebElement lastname= driver.findElement(By.xpath("//input[@placeholder=\"Last Name\"]"));
		lastname.sendKeys("M");
		//Address
		WebElement address= driver.findElement(By.xpath("//textarea[@rows=\"3\"]"));
		address.sendKeys("Mullainagar, Sankarankovil, Tenkasi-Dist");
		//Email
		WebElement email= driver.findElement(By.xpath("//input[@type=\"email\"]"));
		email.sendKeys("m.eswaran2012@gmail.com");
		//Phone Number
		WebElement phone= driver.findElement(By.xpath("//input[@type=\"tel\"]"));
		phone.sendKeys("8608879783");
		//Select Gender
		WebElement genter= driver.findElement(By.xpath("//input[@type=\"radio\"][1]"));
		genter.click();
		//Select Hobbies
		WebElement hobby= driver.findElement(By.xpath("//input[@type=\"checkbox\"][1]"));
		hobby.click();
		WebElement hobby1= driver.findElement(By.id("checkbox2"));
		hobby1.click();
		//Select Language
		WebElement language= driver.findElement(By.xpath("//div[@class=\"ui-autocomplete-multiselect ui-state-default ui-widget\"]"));
		language.click();
		WebElement select= driver.findElement(By.xpath("//a[text()='English']"));
		select.click();
		WebElement click=driver.findElement(By.xpath("//body[@ng-app=\"Registerform\"]"));
		click.click();
		//Enter Skills
		WebElement skills= driver.findElement(By.xpath("//select[@type=\"text\"][1]"));
		skills.sendKeys("Java");
		//Select country
		WebElement country= driver.findElement(By.xpath("//span[@role=\"combobox\"]"));
		country.click();
		WebElement selectCountry= driver.findElement(By.xpath("//input[@type='search']"));
		selectCountry.click();
		WebElement selectIndia= driver.findElement(By.xpath("//li[text()='India']"));
		selectIndia.click();
		//Date Of Birth
		WebElement year = driver.findElement(By.id("yearbox"));
		year.click();
		WebElement selectYear = driver.findElement(By.xpath("//option[text()='1993']"));
		selectYear.click();
		WebElement month= driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[11]/div[2]/select"));
		month.click();
		WebElement selectMonth = driver.findElement(By.xpath("//option[text()='August']"));
		selectMonth.click();
		WebElement date = driver.findElement(By.id("daybox"));
		date.click();
		WebElement selectDate = driver.findElement(By.xpath("//option[text()='3']"));
		selectDate.click();
		//Enter Password
		WebElement password = driver.findElement(By.id("firstpassword"));
		password.sendKeys("Esakki@03");
		WebElement conPassword = driver.findElement(By.id("secondpassword"));
		conPassword.sendKeys("Esakki@03");
		//Upload Photo
		WebElement photo = driver.findElement(By.id("imagesrc"));
		photo.sendKeys("C:\\Users\\hp\\Downloads\\Esakkieswaran.jpeg");
		//Click Submit Button
		WebElement submit = driver.findElement(By.id("submitbtn"));
		submit.click();
		System.out.println("Registration Successfully Completed");

	}

}



