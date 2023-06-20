package Winappdriver.TestWinApp;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class TestTwoOpenNewMail extends InitializingMethods {

	public static void OpenNewMail() throws Throwable {

		// WindowsDriver driver = (WindowsDriver) Setup();

//		Set<String> allWindowHandles = driver.getWindowHandles();
//		driver.switchTo().window(allWindowHandles.iterator().next());
		Thread.sleep(4000);
		// driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElementByAccessibilityId("NewItem").click();
		System.out.println("New Mail item is opened");

		// Switch to the next window in outlook:

		String mainW = driver.getWindowHandle(); // Get Main Window
		// System.out.println(mainW);
		Set<String> windowHandles = driver.getWindowHandles();
		// System.out.println(windowHandles);
		driver.switchTo().window(windowHandles.iterator().next());
		// System.out.println("Driver is switched to next window");
		Thread.sleep(1000);
		driver.findElementByXPath(
				"//*[@Name='Ribbon'][@ClassName='NetUInetpane']/Button[@Name='Close'][@ClassName='NetUIAppFrameHelper']")
				.click();
		System.out.println("New mail item is closed");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		// Thread.sleep(2000);
		driver.switchTo().window(mainW); // Switch to Main Window

	}


	public static void main(String[] args) throws Throwable {
		Setup();
		OpenNewMail();
		Close();
		System.out.println("Main method executed");

	}

}
