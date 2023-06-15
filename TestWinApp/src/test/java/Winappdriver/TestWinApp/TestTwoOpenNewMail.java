package Winappdriver.TestWinApp;
import java.net.URL;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import io.appium.java_client.windows.WindowsDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class TestTwoOpenNewMail {

	public static void main(String[] args) throws Throwable {

		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("app", "C:\\Program Files\\Microsoft Office\\root\\Office16\\OUTLOOK.EXE");
		capabilities.setCapability("platformName", "Windows");
		capabilities.setCapability("platformVersion", "1.0");
		WindowsDriver driver = new WindowsDriver(new URL("http://127.0.0.1:4723"), capabilities);

		System.out.println("Outlook is Launched");
		Set<String> allWindowHandles = driver.getWindowHandles();
		driver.switchTo().window(allWindowHandles.iterator().next());
		Thread.sleep(3000);
		// driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElementByAccessibilityId("NewItem").click();
		System.out.println("New Mail item is opened");
		
		// driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		// Thread.sleep(2000);
		
		// Switch to the next window in outlook:

		String mainW = driver.getWindowHandle(); // Get Main Window
		// System.out.println(mainW);
		Set<String> windowHandles = driver.getWindowHandles();
		// System.out.println(windowHandles);
		driver.switchTo().window(windowHandles.iterator().next());
		// System.out.println("Driver is switched to next window");
		driver.findElementByXPath(
				"//*[@Name='Ribbon'][@ClassName='NetUInetpane']/Button[@Name='Close'][@ClassName='NetUIAppFrameHelper']")
				.click();
		System.out.println("New mail item is closed");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		// Thread.sleep(2000);
		driver.switchTo().window(mainW); // Switch to Main Window
		driver.findElementByXPath(
				"//*[@Name='Ribbon'][@ClassName='NetUInetpane']/Button[@Name='Close'][@ClassName='NetUIAppFrameHelper']")
				.click();
		// driver.findElementByName("Close").click();
		System.out.println("Outlook is closed");

	}

}
