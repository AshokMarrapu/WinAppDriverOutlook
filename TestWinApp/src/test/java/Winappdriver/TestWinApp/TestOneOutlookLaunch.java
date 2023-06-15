package Winappdriver.TestWinApp;

import java.net.URL;
import java.util.Set;
import io.appium.java_client.windows.WindowsDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class TestOneOutlookLaunch {

	public static void main(String[] args) throws Throwable {

		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("app", "C:\\Program Files\\Microsoft Office\\root\\Office16\\OUTLOOK.EXE");
		capabilities.setCapability("platformName", "Windows");
		capabilities.setCapability("platformVersion", "1.0");
		WindowsDriver driver = new WindowsDriver(new URL("http://127.0.0.1:4723"), capabilities);
		Thread.sleep(10000);
		System.out.println("Outlook is Launched");
		Set<String> allWindowHandles = driver.getWindowHandles();
		driver.switchTo().window(allWindowHandles.iterator().next());
		Thread.sleep(2000);
		driver.findElementByXPath(
				"//*[@Name='Ribbon'][@ClassName='NetUInetpane']/Button[@Name='Close'][@ClassName='NetUIAppFrameHelper']")
				.click();
		System.out.println("Outlook is closed");

	}

}