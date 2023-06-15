package Winappdriver.TestWinApp;

import java.net.URL;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import io.appium.java_client.windows.WindowsDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class TestFourSenReceiveFolders {

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
		driver.findElementByAccessibilityId("TabSendReceive").click();
		System.out.println("Driver clicked on Send Receive tab");
		Thread.sleep(3000);
		driver.findElementByAccessibilityId("SendReceiveAll").click();
		System.out.println("Driver clicked on Send Receive all Folders button");
		Thread.sleep(3000);
		driver.findElementByAccessibilityId("TabMail").click();
		System.out.println("Driver clicked on Home tab and came to Home window");
		// Thread.sleep(1000);
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		// Thread.sleep(2000);
		// driver.switchTo().window(mainW); // Switch to Main Window
		driver.findElementByXPath(
				"//*[@Name='Ribbon'][@ClassName='NetUInetpane']/Button[@Name='Close'][@ClassName='NetUIAppFrameHelper']")
				.click();
		System.out.println("Outlook is closed");

	}

}