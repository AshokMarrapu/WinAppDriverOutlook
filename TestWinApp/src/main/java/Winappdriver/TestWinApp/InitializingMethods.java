package Winappdriver.TestWinApp;

import java.net.URL;
import java.util.Set;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.windows.WindowsDriver;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;


public class InitializingMethods {           


	public static WindowsDriver driver;
	public char fileSeparator = '\\';
	
	//------------------------------------To open WinAppDriver//
	public static void OpenWinAppDriver() throws Exception{

		//text file, should be opening in default text editor
		File file = new File("C:\\Program Files\\Windows Application Driver\\WinAppDriver.exe");

		//first check if Desktop is supported by Platform or not
		if(!Desktop.isDesktopSupported()){
			System.out.println("Desktop is not supported");
			return;
		}

		Desktop desktop = Desktop.getDesktop();
		if(file.exists()) desktop.open(file);

		//To Open WinappDriver
		file = new File("C:\\Program Files\\Windows Application Driver\\WinAppDriver.exe");
		if(file.exists()) desktop.open(file);
		System.out.println("WinAppDriver is Opened");

	}

	//--------------------------------------To Set Capabilities//
	public static WindowsDriver Setup() throws Exception {

		DesiredCapabilities capabilities = new DesiredCapabilities ();
		capabilities.setCapability("app", "C:\\Program Files\\Microsoft Office\\root\\Office16\\OUTLOOK.EXE");
		capabilities.setCapability("platformName", "Windows");
		capabilities.setCapability("platformVersion", "1.0");
		driver = new WindowsDriver(new URL("http://127.0.0.1:4723"), capabilities);
		Thread.sleep(2000);
		System.out.println("Outlook is Launched");
		//driver.findElementByName("Restore Down").click();
		//Thread.sleep(2000);
		Set<String> allWindowHandles = driver.getWindowHandles();
		driver.switchTo().window(allWindowHandles.iterator().next());
		return driver;
	}

	//--------------------------------------To Maximize Outlook//
	public static void Maximize() throws Exception{

		driver.manage().window().maximize();
		System.out.println("Outlook is Maximized");			
	}

	//---------------------------------------To Close Outlook//
	public static void Close() {
		driver.findElementByXPath(
				"//*[@Name='Ribbon'][@ClassName='NetUInetpane']/Button[@Name='Close'][@ClassName='NetUIAppFrameHelper']")
		.click();
		System.out.println("Outlook is Closed");	

		// Thread.sleep(1000);
	}	

	//----------------------------------------To Close WinAppDriver//
	public static void CloseWinAppDriver() throws IOException {	
		String taskKillCommand = "taskkill /F /IM WinAppDriver.exe";

		ProcessBuilder processBuilder = new ProcessBuilder("cmd.exe", "/c", taskKillCommand);
		Process process = processBuilder.start();
		System.out.println("WinAppDriver is Closed");
	}
}