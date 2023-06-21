package Winappdriver.TestWinApp;
import java.util.Set;
import org.testng.annotations.Test;


public class TestOneOutlookLaunch extends InitializingMethods {
 
	@Test
	public static void Launch() throws Throwable {

		
		//WindowsDriver driver = (WindowsDriver) Setup();
		Set<String> allWindowHandles = driver.getWindowHandles();
		driver.switchTo().window(allWindowHandles.iterator().next());
		
		Thread.sleep(1000);		
	}

	
	public static void main(String[] args) throws Throwable {

		
		Setup();
		Launch();
		Close();

		System.out.println("Main method executed");

	}
}

