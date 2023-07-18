package Winappdriver.TestWinApp;
import java.util.Set;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public class TestSevenFileMenuOptionsCheckBox extends InitializingMethods{
	
	
	public static void checkbox() throws Throwable {
				
		driver.findElementByAccessibilityId("FileTabButton").click();
		System.out.println("Driver clicked on File tab and went to File menu");
		Thread.sleep(3000);
		driver.findElementByName("Options").click();
		System.out.println("Driver switched to Options window");
		Set<String> allWindowHandles = driver.getWindowHandles();
		driver.switchTo().window(allWindowHandles.iterator().next());
		driver.findElementByName("Mail").click();
		System.out.println("Driver switched to Mail option");
		Thread.sleep(3000);
		driver.findElementByName("General").click();
		System.out.println("Driver switched to General option");
		driver.findElementByClassName("NetUICheckbox").click();
		Actions actions = new Actions(driver);
		Thread.sleep(3000);
		actions.keyDown(Keys.LEFT_ALT).sendKeys("c").keyUp(Keys.LEFT_ALT).click().perform();
		Thread.sleep(3000);
		driver.findElementByName("Cancel").click();
		System.out.println("Driver clicked on Cancel");
	}
	
	public static void main(String[] args) throws Throwable {
		OpenWinAppDriver();
		Setup();
		checkbox();	
		Close();
		CloseWinAppDriver();
		System.out.println("Main method executed");	
			
	}
	}