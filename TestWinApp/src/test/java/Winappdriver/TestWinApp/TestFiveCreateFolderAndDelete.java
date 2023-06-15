package Winappdriver.TestWinApp;
import java.net.URL;
import java.util.Set;
import io.appium.java_client.windows.WindowsDriver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.remote.DesiredCapabilities;

public class TestFiveCreateFolderAndDelete {

	public static void main(String[] args) throws Throwable {

		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("app", "C:\\Program Files\\Microsoft Office\\root\\Office16\\OUTLOOK.EXE");
		capabilities.setCapability("platformName", "Windows");
		capabilities.setCapability("platformVersion", "1.0");
		WindowsDriver driver = new WindowsDriver(new URL("http://127.0.0.1:4723"), capabilities);
		Thread.sleep(4000);
		System.out.println("Outlook is Launched");
		Set<String> allWindowHandles = driver.getWindowHandles();
		driver.switchTo().window(allWindowHandles.iterator().next());
		driver.findElementByAccessibilityId("TabFolder").click();
		System.out.println("Driver clicked on Folder tab");
		Thread.sleep(3000);
		driver.findElementByAccessibilityId("NewFolder").click();
		System.out.println("Driver clicked on New Folder button");
		Thread.sleep(3000);
		driver.findElementByAccessibilityId("4097").sendKeys("Aureus Mailbox", Keys.ENTER);
		System.out.println("Driver entered Aureus Mailbox in text field");
		//driver.findElementByAccessibilityId("1").click();	
		System.out.println("Aureus Mailbox is created");
		//driver.switchTo().window(allWindowHandles.iterator().next());
		//Thread.sleep(2000);
		Thread.sleep(1000);
		driver.findElementByName("Aureus Mailbox").click();
		System.out.println("Driver clicked on Aureus Mailbox");
		Thread.sleep(1000);
		driver.findElementByAccessibilityId("DeleteThisFolder").click();
		Thread.sleep(1000);
		driver.findElementByAccessibilityId("6").click();
		System.out.println("Aureus Mailbox Folder is deleted");
		driver.findElementByXPath(
				"//*[@Name='Ribbon'][@ClassName='NetUInetpane']/Button[@Name='Close'][@ClassName='NetUIAppFrameHelper']")
				.click();
		//Thread.sleep(1000);	
		System.out.println("Outlook is closed");

	}

}