package Winappdriver.TestWinApp;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class TestThreeSearchPeople extends InitializingMethods {
	public static void Search() throws Throwable {

		// WindowsDriver driver = (WindowsDriver) Setup();

		Set<String> allWindowHandles = driver.getWindowHandles(); 
		System.out.println(allWindowHandles);
		driver.switchTo().window(allWindowHandles.iterator().next());
		Thread.sleep(3000);
		WebElement SearchPeople= driver.findElementByName("Search People");
		System.out.println("Driver clicked on Search people");
		SearchPeople.click();		
		SearchPeople.sendKeys("Arun");
		System.out.println("Driver entered text");
		Thread.sleep(4000);
		//driver.switchTo().window(allWindowHandles.iterator().next());
		driver.findElementByName("Arun Kasha").click();
		Thread.sleep(4000);
//		Set <String> nallWindowHandles = driver.getWindowHandles();
//		System.out.println(nallWindowHandles);
		System.out.println("Arun Kasha is selected");
		Thread.sleep(1000);
		//System.out.println(driver.getTitle());
		//driver.switchTo().window(allWindowHandles.iterator().next());
		//Thread.sleep(3000);
		//driver.findElementByName("Close").click();		
		Actions actions = new Actions(driver);
		actions.keyDown(Keys.LEFT_ALT).sendKeys("f4").keyUp(Keys.LEFT_ALT).click().perform();
		//Thread.sleep(1000);
		//System.out.println("Close button");
//		driver.findElementByXPath("//*Pane[@ClassName='NetUIToolWindow']/Button[@ClassName='NetUIContactCardDragElement']/Button[@Name='Close'][@ClassName='NetUISimpleButton']").click();
//		System.out.println("Closed Search People window");
//		
		
		
		
		
	/*	System.out.println("Driver clicked on File tab and went to File menu");
		Thread.sleep(2000);
		driver.findElementByName("Back").click();
		System.out.println("Driver came back to home window");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS); */
	}

	public static void main(String[] args) throws Throwable {
		OpenWinAppDriver();
		Setup();
		Maximize();
		Search();
		Close();
		CloseWinAppDriver();
		System.out.println("Main method executed");
	}
}