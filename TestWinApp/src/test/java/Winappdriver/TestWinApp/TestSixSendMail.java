package Winappdriver.TestWinApp;
import java.util.Set;
import org.openqa.selenium.interactions.Actions;
import io.appium.java_client.windows.WindowsDriver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class TestSixSendMail extends InitializingMethods {
	
	public static void SendMail() throws Throwable {
		
		Set<String> allWindowHandles = driver.getWindowHandles();
		driver.switchTo().window(allWindowHandles.iterator().next());
		Thread.sleep(3000);
		// driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
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
		driver.findElementByAccessibilityId("4256").click();
		System.out.println("New Mail is sent");
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(20000);

		Actions actions = new Actions(driver);
		actions.moveByOffset(426, 55).click().perform();
		System.out.println("clicked on first mail");
		Thread.sleep(2000);	

		//To delete the latest mail
		actions.keyDown(Keys.LEFT_CONTROL).sendKeys("d").keyUp(Keys.LEFT_CONTROL).perform();
		System.out.println("Mail is deleted");
		driver.switchTo().window(allWindowHandles.iterator().next());

	}

public static void main(String[] args) throws Throwable {
	Setup();
	SendMail();
	Close();
	System.out.println("Main method executed");
	
}



}
