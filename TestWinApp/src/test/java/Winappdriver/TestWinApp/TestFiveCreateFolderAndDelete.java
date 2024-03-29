package Winappdriver.TestWinApp;
import java.util.Set;
import org.openqa.selenium.Keys;

public class TestFiveCreateFolderAndDelete extends InitializingMethods {

	public static void NewFolder() throws Throwable {

		Set<String> allWindowHandles = driver.getWindowHandles();
		driver.switchTo().window(allWindowHandles.iterator().next());
		driver.findElementByAccessibilityId("TabFolder").click();
		System.out.println("Driver clicked on Folder tab");
		Thread.sleep(3000);
		driver.findElementByAccessibilityId("NewFolder").click();
		System.out.println("Driver clicked on New Folder button");
		Thread.sleep(3000);
		driver.findElementByAccessibilityId("4097").sendKeys("Aureus Mailbox1", Keys.ENTER);
		System.out.println("Driver entered Aureus Mailbox in text field");
		System.out.println("Aureus Mailbox is created");
		Thread.sleep(1000);		
		driver.findElementByName("Aureus Mailbox1").click();
		System.out.println("Driver clicked on Aureus Mailbox");
		Thread.sleep(1000);
		driver.findElementByAccessibilityId("DeleteThisFolder").click();
		Thread.sleep(1000);
		driver.findElementByAccessibilityId("6").click();
		System.out.println("Aureus Mailbox1 Folder is deleted");

	}

	public static void main(String[] args) throws Throwable {
		OpenWinAppDriver();
		Setup();
		NewFolder();
		Close();
		CloseWinAppDriver();
		System.out.println("Main method is executed");

	}


}