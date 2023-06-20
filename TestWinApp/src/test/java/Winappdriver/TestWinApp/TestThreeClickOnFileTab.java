package Winappdriver.TestWinApp;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class TestThreeClickOnFileTab extends InitializingMethods {
	public static void FileTab() throws Throwable {

		// WindowsDriver driver = (WindowsDriver) Setup();

		Set<String> allWindowHandles = driver.getWindowHandles();
		driver.switchTo().window(allWindowHandles.iterator().next());
		driver.findElementByAccessibilityId("FileTabButton").click();
		System.out.println("Driver clicked on File tab and went to File menu");
		Thread.sleep(2000);
		driver.findElementByName("Back").click();
		System.out.println("Driver came back to home window");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	}

	public static void main(String[] args) throws Throwable {
		Setup();
		FileTab();
		Close();
		System.out.println("Main method executed");
	}
}