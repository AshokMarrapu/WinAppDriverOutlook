package Winappdriver.TestWinApp;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class TestFourSenReceiveFolders extends InitializingMethods {
	
	public static void Refresh() throws Throwable {	

		//WindowsDriver driver = (WindowsDriver) Setup();
		
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
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);	

	}

public static void main(String[] args) throws Throwable {
	Setup();
	Refresh();
	Close();
	System.out.println("Main method executed");
}

}