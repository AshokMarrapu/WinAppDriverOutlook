package Winappdriver.TestWinApp;

import java.net.URL;
import java.util.Set;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.windows.WindowsDriver;

public class InitializingMethods {

	public static WindowsDriver driver;



	public static WindowsDriver Setup() throws Exception {

		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("app", "C:\\Program Files\\Microsoft Office\\root\\Office16\\OUTLOOK.EXE");
		capabilities.setCapability("platformName", "Windows");
		capabilities.setCapability("platformVersion", "1.0");
		driver = new WindowsDriver(new URL("http://127.0.0.1:4723"), capabilities);
		Thread.sleep(2000);
		System.out.println("Outlook is Launched");
		Set<String> allWindowHandles = driver.getWindowHandles();
		driver.switchTo().window(allWindowHandles.iterator().next());
		return driver;

	}


	public static void Close() {

		driver.findElementByXPath(
				"//*[@Name='Ribbon'][@ClassName='NetUInetpane']/Button[@Name='Close'][@ClassName='NetUIAppFrameHelper']")
				.click();
		// Thread.sleep(1000);
		System.out.println("Outlook is closed");
	}

}