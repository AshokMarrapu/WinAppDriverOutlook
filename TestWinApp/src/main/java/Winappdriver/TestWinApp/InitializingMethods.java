package Winappdriver.TestWinApp;

import java.awt.Desktop;
import java.io.*;
import java.net.URL;
import java.util.Set;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import io.appium.java_client.windows.WindowsDriver;

public class InitializingMethods {

	
	public static WindowsDriver driver;


	@BeforeTest
	public static WindowsDriver Setup() throws Exception {
		
//		/*
//		 * String WADServerPath =
//		 * "C:\\Program Files\\Windows Application Driver\\WinAppDriver.exe"; String
//		 * command = WADServerPath; ProcessBuilder builder = new
//		 * ProcessBuilder(command); Process process = builder.start();
//		 */	
//		
//		
//			//constructor of file class having file as argument  
//			File file = new File("C:\\Program Files\\Windows Application Driver\\WinAppDriver.exe");   
//			Desktop desktop = Desktop.getDesktop();
//			desktop.open(file);
//			System.out.println("WinAppDriver Server is started");
//			Thread.sleep(3000);		
		
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("app", "C:\\Program Files\\Microsoft Office\\root\\Office16\\OUTLOOK.EXE");
		capabilities.setCapability("platformName", "Windows");
		capabilities.setCapability("platformVersion", "1.0");
		driver = new WindowsDriver(new URL("http://127.0.0.1:4723"), capabilities);
		Thread.sleep(2000);
		System.out.println("Outlook is Launched");
		Set<String> allWindowHandles = driver.getWindowHandles();
		driver.switchTo().window(allWindowHandles.iterator().next());
		System.out.println("Outlook is Launched @Before Test");
		return driver;
	}

	@AfterTest
	public static void Close() {

		driver.findElementByXPath(
				"//*[@Name='Ribbon'][@ClassName='NetUInetpane']/Button[@Name='Close'][@ClassName='NetUIAppFrameHelper']")
				.click();
		// Thread.sleep(1000);
		System.out.println("Outlook is closed @After Test");
	}

}