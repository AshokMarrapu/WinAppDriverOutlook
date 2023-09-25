package Winappdriver.TestWinApp;
import java.util.Set;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class TestSixSendMail extends InitializingMethods {
	
	public static void SendMail() throws Throwable {
		
		Set<String> allWindowHandles = driver.getWindowHandles();
		driver.switchTo().window(allWindowHandles.iterator().next());
		Thread.sleep(3000);
		driver.findElementByAccessibilityId("NewItem").click();
		System.out.println("New Mail item is opened");

		// Switch to the next window in outlook:

		String mainW = driver.getWindowHandle(); // To Get Main Window
		Set<String> windowHandles = driver.getWindowHandles();
		driver.switchTo().window(windowHandles.iterator().next());
		driver.findElementByAccessibilityId("4117").sendKeys("mashok@aureustechsystems.com", Keys.ENTER);
		driver.findElementByAccessibilityId("4101").sendKeys("Outlook Test");	
		
		//driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		Thread.sleep(2000);
		System.out.println("Entered To and Subject of the mail"); 
		WebElement Mailbody = driver.findElementByClassName("_WwG");
		Mailbody.click();		
		Mailbody.sendKeys("Hi, This is a test mail");
		Thread.sleep(2000);					
		driver.findElementByAccessibilityId("TabInsert").click();
		Thread.sleep(2000);
		System.out.println("clicked insert");
		Thread.sleep(2000);
		driver.findElementByAccessibilityId("AttachFileSplit").click();
		Thread.sleep(2000);
		System.out.println("attach split");
		driver.findElementByName("Browse This PC...").click();	
		Thread.sleep(2000);
		System.out.println("clicked on browse pc");
		//driver.switchTo().window(windowHandles.iterator().next());
		Thread.sleep(2000);
		System.out.println("switched to insert window");
		Thread.sleep(2000);
		Actions actions = new Actions(driver);
		driver.switchTo().window(windowHandles.iterator().next());		
		WebElement insertFile= driver.findElementByName("Amazon SPN");
		Thread.sleep(2000);
		insertFile.click();
		driver.findElementByName("Insert").click();
		Thread.sleep(2000);
		driver.findElementByAccessibilityId("4256").click();
		System.out.println("New Mail is sent");
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(20000);
		//Actions actions = new Actions(driver);
		actions.moveByOffset(300, 55).click().perform();
		//System.out.println("clicked on new mail");
		Thread.sleep(2000);	

		//To delete the latest mail
		//actions.keyDown(Keys.LEFT_CONTROL).sendKeys("d").keyUp(Keys.LEFT_CONTROL).perform();
		//System.out.println("Mail is deleted");
		//driver.switchTo().window(allWindowHandles.iterator().next()); 
		
	}

public static void main(String[] args) throws Throwable {
	OpenWinAppDriver();
	Setup();
	SendMail();
	Close();
	CloseWinAppDriver();
	System.out.println("Main method is executed");
}
}
