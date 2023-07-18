package Outlook.Plugin;
import java.util.Set;
import Winappdriver.TestWinApp.InitializingMethods;


public class TestThreeClickMeet2 extends InitializingMethods {
 
	
	public static void Launch() throws Throwable {

		
		//WindowsDriver driver = (WindowsDriver) Setup();
		Set<String> allWindowHandles = driver.getWindowHandles();
		driver.switchTo().window(allWindowHandles.iterator().next());  

		Thread.sleep(3000);
		driver.findElementByAccessibilityId("4704").click();
		Thread.sleep(1000);	
		driver.findElementByName("RES-TL").click();
		System.out.println("Clicked on RES-TL Plugin"); 
		Thread.sleep(2000);		
		driver.findElementByName("WebExtSuperPaneWindow").click();
		System.out.println("Clicked on body of Plugin");
		Thread.sleep(1000);	
		driver.findElementByAccessibilityId("meet22").click();
		System.out.println("Clicked on 2nd row Meet2 link");
		Thread.sleep(1000);	
		driver.findElementByAccessibilityId("WebExtExplorerCloseButton").click();
		System.out.println("Clicked on Close Button of Plugin");
		Thread.sleep(1000);	
	}

	
	public static void main(String[] args) throws Throwable {
		OpenWinAppDriver();
		Setup();
		Launch();
		Close();
		CloseWinAppDriver();
		System.out.println("Main method executed");

	}
}

