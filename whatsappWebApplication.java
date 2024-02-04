package AutomationProject;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class whatsappWebApplication {

	public static void main(String[] args) throws InterruptedException, AWTException, FileNotFoundException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(200, TimeUnit.SECONDS); 
		driver.manage().timeouts().implicitlyWait(175, TimeUnit.SECONDS);


		driver.get("https://web.whatsapp.com/");
		//Thread.sleep(12000);
		WebElement linkMoNum = driver.findElement(By.xpath("//*[text()='Link with phone number']"));
		Actions action = new Actions(driver);
		action.moveToElement(linkMoNum).click().perform();

		//Thread.sleep(5000);
		WebElement phone = driver.findElement(By.xpath("//input[@value='+91 ']")); 
		phone.sendKeys("8608879783");
		WebElement next = driver.findElement(By.xpath("//*[text()='Next']"));
		next.click();


		//Contact Search
		WebElement search = driver.findElement(By.xpath("//p[@class='selectable-text copyable-text iq0m558w g0rxnol2']")); 
		Thread.sleep(5000);
		search.sendKeys("Aaa");
		Thread.sleep(3000);
		WebElement conOpen = driver.findElement(By.xpath("//span[@title='Aaa']"));
		conOpen.click();
		//Send Text Message
		WebElement textMessage = driver.findElement(By.xpath("//div[@class='_1Rw8K']/following::p"));
		textMessage.sendKeys("Hello");
		WebElement sendButton = driver.findElement(By.xpath("//*[@class='_1VZX7']/child::div/following::div/child::button"));
		sendButton.click();
		//Click Attach Symbol
		WebElement attach = driver.findElement(By.xpath("//span[@data-icon='attach-menu-plus']")); 
		attach.click();
		//Send a Documents
		WebElement document =driver.findElement(By.xpath("//div[@class='ocd2b0bc aa0kojfi']//div[1]//li[1]")); 
		document.click();
		Thread.sleep(3000);
		String file = "C:\\Users\\hp\\Downloads\\Esakkieswaran.jpeg"; 
		StringSelection imagePath = new StringSelection(file);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(imagePath, null);
		Robot key = new Robot();
		key.keyPress(KeyEvent.VK_CONTROL);
		key.keyPress(KeyEvent.VK_V);
		key.keyRelease(KeyEvent.VK_V);
		key.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(3000);
		key.keyPress(KeyEvent.VK_ENTER);
		key.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		key.keyPress(KeyEvent.VK_ENTER);
		key.keyRelease(KeyEvent.VK_ENTER);

		//send a Photo & Videos
		attach.click();
		WebElement photoVedio = driver.findElement(By.xpath("//div[@class='ocd2b0bc aa0kojfi']//div[2]//li"));
		photoVedio.click();
		Thread.sleep(3000);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(imagePath, null);
		key.keyPress(KeyEvent.VK_CONTROL);
		key.keyPress(KeyEvent.VK_V);
		key.keyRelease(KeyEvent.VK_V);
		key.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(3000);
		key.keyPress(KeyEvent.VK_ENTER);
		key.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(8000);
		key.keyPress(KeyEvent.VK_ENTER);
		key.keyRelease(KeyEvent.VK_ENTER);

		//Camera
		attach.click();
		WebElement camera = driver.findElement(By.xpath("//div[@class='ocd2b0bc aa0kojfi']//div[3]//li"));
		camera.click();
		Thread.sleep(3000);
		WebElement allow = driver.findElement(By.xpath("//*[text()='OK, got it']"));
		allow.click();
		WebElement cameraButton = driver.findElement(By.xpath("//span[@data-icon='camera']"));
		cameraButton.click();
		Thread.sleep(5000);
		key.keyPress(KeyEvent.VK_ENTER);
		key.keyRelease(KeyEvent.VK_ENTER);

		//Contact
		attach.click();
		WebElement contact = driver.findElement(By.xpath("//div[@class='ocd2b0bc aa0kojfi']//div[4]//li"));
		contact.click();
		Thread.sleep(3000);
		WebElement selectContact = driver.findElement(By.xpath("//*[text()='Anand']"));
		selectContact.click();
		Thread.sleep(3000);
		WebElement sendContact = driver.findElement(By.xpath("//span[@aria-label='Send']"));
		sendContact.click();
		WebElement sendContact1 = driver.findElement(By.xpath("//*[@data-icon='send']"));
		sendContact1.click();

		//Create Poll
		attach.click();
		WebElement poll = driver.findElement(By.xpath("//div[@class='ocd2b0bc aa0kojfi']//div[5]//li"));
		poll.click();
		WebElement qustion = driver.findElement(By.xpath("//*[text()='Ask question']/following::p[1]"));
		qustion.sendKeys("Name");
		WebElement Add1 = driver.findElement(By.xpath("//*[text()='Options']/following::p[1]"));
		Add1.sendKeys("Esakkieswaran");
		WebElement Add2 = driver.findElement(By.xpath("//*[text()='Options']/following::p[2]"));
		Add2.sendKeys("M");
		WebElement pollSend = driver.findElement(By.xpath("//*[@data-icon='send']"));
		pollSend.click();

		//New Sticker
		attach.click();
		WebElement sticker = driver.findElement(By.xpath("//div[@class='ocd2b0bc aa0kojfi']//div[6]//li"));
		sticker.click();
		Thread.sleep(3000);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(imagePath, null);
		key.keyPress(KeyEvent.VK_CONTROL);
		key.keyPress(KeyEvent.VK_V);
		key.keyRelease(KeyEvent.VK_V);
		key.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(3000);
		key.keyPress(KeyEvent.VK_ENTER);
		key.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		key.keyPress(KeyEvent.VK_ENTER);
		key.keyRelease(KeyEvent.VK_ENTER);


		//Emoji
		Thread.sleep(10000);
		WebElement emoji = driver.findElement(By.xpath("//span[@data-icon='smiley']"));
		emoji.click();
		WebElement selectEmoji = driver.findElement(By.xpath("//span[@data-emoji-index='3']"));
		selectEmoji.click();
		WebElement sendEmoji = driver.findElement(By.xpath("//*[@data-icon='send']"));
		sendEmoji.click();

		//Voice Message
		WebElement voice = driver.findElement(By.xpath("//span[@data-icon='ptt']"));
		voice.click();
		WebElement sendVoice = driver.findElement(By.xpath("//button[@aria-label='Send']"));
		Thread.sleep(10000);
		sendVoice.click();

		//Message Info
		WebElement moveTo = driver.findElement(By.xpath("//div[@class='_1BOF7 _2AOIt']"));
		action.moveToElement(moveTo).perform();
		WebElement arrow = driver.findElement(By.xpath("//span[@data-icon='down-context']"));
		arrow.click();
		WebElement messageInfo = driver.findElement(By.xpath("//*[text()='Message info']"));
		messageInfo.click();
		Thread.sleep(5000);
		WebElement messageInfoClose = driver.findElement(By.xpath("//div[@class='kk3akd72 p6y6hbba']/child::div/child::span"));
		messageInfoClose.click();
		Thread.sleep(3000);

		//Reply
		WebElement moveTo1 = driver.findElement(By.xpath("//div[@class='_1BOF7 _2AOIt']"));
		action.moveToElement(moveTo1).perform();
		WebElement arrow1 = driver.findElement(By.xpath("//span[@data-icon='down-context']"));
		arrow1.click();
		WebElement reply = driver.findElement(By.xpath("//*[text()='Reply']"));
		reply.click();
		WebElement replyMsg = driver.findElement(By.xpath("(//div[@contenteditable='true'])[2]/child::p"));
		replyMsg.sendKeys("Hai");
		WebElement replySend = driver.findElement(By.xpath("//span[@data-icon='send']"));
		replySend.click();

		//React
		WebElement moveTo2 = driver.findElement(By.xpath("//div[@class='_1BOF7 _2AOIt']"));
		action.moveToElement(moveTo2).perform();
		WebElement arrow2 = driver.findElement(By.xpath("//span[@data-icon='down-context']"));
		arrow2.click();
		WebElement react = driver.findElement(By.xpath("//*[text()='React']"));
		react.click();
		WebElement selectReact = driver.findElement(By.xpath("//div[@role='dialog']/child::div/child::div[4]"));
		selectReact.click();

		//Forward
		WebElement moveTo3 = driver.findElement(By.xpath("//div[@class='_1BOF7 _2AOIt']"));
		action.moveToElement(moveTo3).perform();
		WebElement arrow3 = driver.findElement(By.xpath("//span[@data-icon='down-context']"));
		arrow3.click();
		WebElement forward = driver.findElement(By.xpath("//*[text()='Forward']"));
		forward.click();
		WebElement forwardIcon = driver.findElement(By.xpath("//span[@data-icon='forward']/parent::button"));
		forwardIcon.click();
		WebElement search1 = driver.findElement(By.xpath("//p[@class='selectable-text copyable-text iq0m558w g0rxnol2']")); 
		Thread.sleep(5000);
		search1.sendKeys("Amma");
		Thread.sleep(3000);
		WebElement conOpen1 = driver.findElement(By.xpath("//span[@title='Amma']"));
		conOpen1.click();
		WebElement forwardSend = driver.findElement(By.xpath("//span[@data-icon='send']"));
		forwardSend.click();

		WebElement search2 = driver.findElement(By.xpath("//p[@class='selectable-text copyable-text iq0m558w g0rxnol2']")); 
		Thread.sleep(5000);
		search2.sendKeys("Aaa");
		Thread.sleep(3000);
		WebElement conOpen2 = driver.findElement(By.xpath("//span[@title='Aaa']"));
		conOpen2.click();
		WebElement moveTo4 = driver.findElement(By.xpath("//div[@class='_1BOF7 _2AOIt']"));
		action.moveToElement(moveTo4).perform();
		WebElement arrow4 = driver.findElement(By.xpath("//span[@data-icon='down-context']"));
		arrow4.click();
		WebElement pin = driver.findElement(By.xpath("//*[text()='Pin']"));
		pin.click();
		WebElement pinSend = driver.findElement(By.xpath("//div[text()='Pin']"));
		pinSend.click();

		//Unpin
		WebElement movePin = driver.findElement(By.xpath("//span[@data-icon='pinned3']"));
		action.moveToElement(movePin).perform();
		WebElement unpinArrow = driver.findElement(By.xpath("//*[@data-icon='down-context']"));
		unpinArrow.click();
		WebElement unPin = driver.findElement(By.xpath("//*[text()='Unpin']"));
		unPin.click();

		//Keep
		WebElement moveTo5 = driver.findElement(By.xpath("//div[@class='_1BOF7 _2AOIt']"));
		action.moveToElement(moveTo5).perform();
		WebElement arrow5 = driver.findElement(By.xpath("//span[@data-icon='down-context']"));
		arrow5.click();
		WebElement keep = driver.findElement(By.xpath("//*[text()='Keep']"));
		keep.click();
		WebElement keepOk = driver.findElement(By.xpath("//div[text()='OK']/parent::div/parent::button"));
		keepOk.click();

		//Unkeep
		WebElement moveTo6 = driver.findElement(By.xpath("//div[@class='_1BOF7 _2AOIt']"));
		action.moveToElement(moveTo6).perform();
		WebElement arrow6 = driver.findElement(By.xpath("//span[@data-icon='down-context']"));
		arrow6.click();
		WebElement unKeep = driver.findElement(By.xpath("//*[text()='Unkeep']"));
		unKeep.click();
		WebElement unKeepOk = driver.findElement(By.xpath("//div[text()='OK']/parent::div/parent::button"));
		unKeepOk.click();

		//Delete
		WebElement moveTo7 = driver.findElement(By.xpath("//div[@class='_1BOF7 _2AOIt']"));
		action.moveToElement(moveTo7).perform();
		WebElement arrow7 = driver.findElement(By.xpath("//span[@data-icon='down-context']"));
		arrow7.click();
		WebElement delete = driver.findElement(By.xpath("//*[text()='Delete']"));
		delete.click();
		WebElement deleteForMe = driver.findElement(By.xpath("//*[text()='Delete for me']/parent::div/parent::button"));
		deleteForMe.click();



		//Menu
		WebElement menu = driver.findElement(By.xpath("//*[@class='kiiy14zj']"));
		menu.click();

		//Contact Info
		WebElement conInfo = driver.findElement(By.xpath("//*[text()='Contact info']"));
		conInfo.click();
		WebElement close = driver.findElement(By.xpath("//div[@aria-label='Close']/child::span"));
		close.click();

		//Select Messages
		menu.click();
		WebElement selectMessages = driver.findElement(By.xpath("//*[text()='Select messages']"));
		selectMessages.click();
		WebElement checkBox = driver.findElement(By.xpath("(//div[@aria-hidden='true'])[1]"));
		checkBox.click();
		WebElement deleteSelectMsg = driver.findElement(By.xpath("//*[@data-icon='delete']"));
		deleteSelectMsg.click();
		WebElement deleteFor = driver.findElement(By.xpath("//*[text()='Delete for me']"));
		Thread.sleep(3000);
		deleteFor.click();

		//Close Chat
		Thread.sleep(3000);
		menu.click();
		WebElement closeChat = driver.findElement(By.xpath("//*[text()='Close chat']"));
		closeChat.click();
		Thread.sleep(8000);
		conOpen.click();


		//Disappearing messages

		WebElement menu1 = driver.findElement(By.xpath("//*[@class='kiiy14zj']"));
		menu1.click();
		WebElement disappearingMessages = driver.findElement(By.xpath("//*[text()='Disappearing messages']"));
		disappearingMessages.click();
		WebElement disappear = driver.findElement(By.xpath("(//*[@class='p357zi0d'])[1]"));
		disappear.click();
		WebElement back = driver.findElement(By.xpath("(//*[@data-icon='back'])[2]"));
		back.click();
		Thread.sleep(3000);

		//Clear chat
		menu1.click();
		WebElement clearChat = driver.findElement(By.xpath("//*[text()='Clear chat']"));
		clearChat.click();
		WebElement clearChatButton = driver.findElement(By.xpath("//*[text()='Clear chat']"));
		Thread.sleep(3000);
		clearChatButton.click();
		Thread.sleep(3000);

		//Delete chat
		menu1.click();
		WebElement deleteChat = driver.findElement(By.xpath("//div[text()='Delete chat']"));
		deleteChat.click();
		Thread.sleep(3000);
		WebElement deleteChatButton = driver.findElement(By.xpath("//div[text()='Delete chat']"));
		deleteChatButton.click();
		Thread.sleep(3000);

		//Profile Photo Change
		WebElement profilePhoto = driver.findElement(By.xpath("//div[@class='_3WByx']/child::div"));
		profilePhoto.click();
		WebElement cameraClick = driver.findElement(By.xpath("//span[@data-icon='camera']"));
		cameraClick.click();
		WebElement uploadPhoto = driver.findElement(By.xpath("//*[text()='Upload photo']"));
		uploadPhoto.click();
		Thread.sleep(3000);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(imagePath, null);
		key.keyPress(KeyEvent.VK_CONTROL);
		key.keyPress(KeyEvent.VK_V);
		key.keyRelease(KeyEvent.VK_V);
		key.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(3000);
		key.keyPress(KeyEvent.VK_ENTER);
		key.keyRelease(KeyEvent.VK_ENTER);
		WebElement clickTick = driver.findElement(By.xpath("//span[@data-icon='checkmark-large']/parent::div"));
		clickTick.click();

		Thread.sleep(5000);
		WebElement prfilePic = driver.findElement(By.xpath("//*[@class='_2pktu']"));
		action.moveToElement(prfilePic).perform();
		WebElement cameraClick1 = driver.findElement(By.xpath("//span[@data-icon='camera']"));
		cameraClick1.click();
		WebElement removePhoto = driver.findElement(By.xpath("//*[text()='Remove photo']"));
		removePhoto.click();
		WebElement remove = driver.findElement(By.xpath("//div[text()='Remove']/parent::div/parent::button"));
		remove.click();



		//Change Name
		WebElement name = driver.findElement(By.xpath("(//*[@data-icon='pencil'])[1]"));
		name.click();
		WebElement enterName = driver.findElement(By.xpath("//*[@class='selectable-text copyable-text']"));
		action.doubleClick(enterName).perform();
		enterName.clear();
		enterName.sendKeys("Eswaran");
		WebElement clickCheckMark = driver.findElement(By.xpath("//*[@data-icon='checkmark']"));
		clickCheckMark.click();

		//About
		WebElement about = driver.findElement(By.xpath("(//*[@data-icon='pencil'])[2]"));
		about.click();
		WebElement enterAbout = driver.findElement(By.xpath("//*[text()='About']/following::div[4]"));
		action.doubleClick(enterAbout).sendKeys("Naan").perform();
		WebElement clickCheck = driver.findElement(By.xpath("//*[@data-icon='checkmark']"));
		clickCheck.click(); 
		WebElement profileBack = driver.findElement(By.xpath("//*[@class='kk3akd72 iqmas3e4']/child::div/child::span"));
		profileBack.click();


		// Contact Page Menu
		WebElement conPageMenu = driver.findElement(By.xpath("//div[@class='_3OtEr'][3]/child::div/child::span"));
		conPageMenu.click();
		//Setting
		WebElement setting = driver.findElement(By.xpath("//*[text()='Settings']"));
		setting.click();

		WebElement option = driver.findElement(By.xpath("//*[@class='fe5nidar fs7pz031 e1gr2w1z p5g9vl8k'][1]"));
		option.click();
		Thread.sleep(3000);
		WebElement backSetting = driver.findElement(By.xpath("(//*[@data-icon='back'])[1]"));
		backSetting.click();

		WebElement notification = driver.findElement(By.xpath("//*[text()='Notifications']"));
		notification.click();
		Thread.sleep(3000);
		WebElement backSetting1 = driver.findElement(By.xpath("(//*[@data-icon='back'])[1]"));
		backSetting1.click();

		WebElement privacy = driver.findElement(By.xpath("//*[text()='Privacy']"));
		privacy.click();
		Thread.sleep(3000);
		WebElement backSetting2 = driver.findElement(By.xpath("(//*[@data-icon='back'])[1]"));
		backSetting2.click();

		WebElement security = driver.findElement(By.xpath("//*[text()='Security']"));
		security.click();
		Thread.sleep(3000);
		WebElement backSetting3 = driver.findElement(By.xpath("(//*[@data-icon='back'])[1]"));
		backSetting3.click();

		WebElement theme = driver.findElement(By.xpath("//*[text()='Theme']"));
		theme.click();
		Thread.sleep(3000);
		WebElement backSetting4 = driver.findElement(By.xpath("//*[text()='OK']"));
		backSetting4.click();

		WebElement chatWallpaper = driver.findElement(By.xpath("//*[text()='Chat wallpaper']"));
		chatWallpaper.click();
		Thread.sleep(3000);
		WebElement backSetting5 = driver.findElement(By.xpath("(//*[@data-icon='back'])[1]"));
		backSetting5.click();

		WebElement mediaAutoDownload = driver.findElement(By.xpath("//*[text()='Media auto-download']"));
		mediaAutoDownload.click();
		Thread.sleep(3000);
		WebElement backSetting6 = driver.findElement(By.xpath("(//*[@data-icon='back'])[1]"));
		backSetting6.click();

		WebElement requestAccountInfo = driver.findElement(By.xpath("//*[text()='Request account info']"));
		requestAccountInfo.click();
		Thread.sleep(3000);
		WebElement backSetting7 = driver.findElement(By.xpath("(//*[@data-icon='back'])[1]"));
		backSetting7.click();

		WebElement keyboardShortcuts = driver.findElement(By.xpath("//*[text()='Keyboard shortcuts']"));
		keyboardShortcuts.click();
		Thread.sleep(3000);
		WebElement backSetting8 = driver.findElement(By.xpath("//*[text()='OK']"));
		backSetting8.click();

		WebElement help = driver.findElement(By.xpath("//*[text()='Help']"));
		help.click();
		Thread.sleep(3000);
		WebElement backSetting9 = driver.findElement(By.xpath("(//*[@data-icon='back'])[1]"));
		backSetting9.click();

		WebElement logOut = driver.findElement(By.xpath("//*[text()='Log out']"));
		logOut.click();


	}

}

