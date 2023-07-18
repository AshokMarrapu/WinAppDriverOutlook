package Outlook.Plugin;
import java.util.Set;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Winappdriver.TestWinApp.InitializingMethods;


public class TestFourEditAndClick extends InitializingMethods {
 
	
	public static void Launch() throws Throwable {

		
		//WindowsDriver driver = (WindowsDriver) Setup();
		Set<String> allWindowHandles = driver.getWindowHandles();
		driver.switchTo().window(allWindowHandles.iterator().next());  
		Thread.sleep(3000);		
		Actions actions = new Actions(driver);
		Thread.sleep(3000);
		driver.findElementByAccessibilityId("4704").click();
		Thread.sleep(1000);	
		driver.findElementByName("RES-TL").click();
		System.out.println("Clicked on RES-TL"); 
		Thread.sleep(2000);		
		WebElement Engineers = driver.findElementByAccessibilityId("eng11");
		Engineers.click();
		System.out.println("Clicked on Engineers"); 
		Thread.sleep(1000);
        actions.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
        Thread.sleep(2000);	
		System.out.println("Double Click on Engineers"); 
		actions.sendKeys(Keys.DELETE).perform();
		Thread.sleep(1000);
		Engineers.sendKeys("Ashok Naidu");
		Thread.sleep(1000);
		System.out.println("Input Ashok Naidu"); 
		System.out.println("Clicked on ID");
		Thread.sleep(2000);		
		driver.findElementByName("WebExtSuperPaneWindow").click();
		System.out.println("Clicked on body of Plugin");
		Thread.sleep(2000);	
		driver.findElementByAccessibilityId("meet22").click();
		System.out.println("Clicked on 2nd row Meet2 link");
		Thread.sleep(2000);	
		driver.findElementByName("WebExtSuperPaneWindow").click();
		System.out.println("Clicked again on body of Plugin");
		Thread.sleep(2000);	
		driver.findElementByAccessibilityId("WebExtExplorerCloseButton").click();
		System.out.println("Clicked on Close Button of Plugin");
		Thread.sleep(2000);		
		
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

