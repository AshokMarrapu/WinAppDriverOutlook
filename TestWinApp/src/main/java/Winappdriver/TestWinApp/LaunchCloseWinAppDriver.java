package Winappdriver.TestWinApp;

import java.awt.AWTException;
import java.awt.Desktop;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

public class LaunchCloseWinAppDriver {

   /* public static void main(String[] args) throws IOException {
        //text file, should be opening in default text editor
        File file = new File("C:\\Program Files\\Windows Application Driver\\WinAppDriver.exe");
        
        //first check if Desktop is supported by Platform or not
        if(!Desktop.isDesktopSupported()){
            System.out.println("Desktop is not supported");
            return;
        }
        
        Desktop desktop = Desktop.getDesktop();
        if(file.exists()) desktop.open(file);
        
        //let's try to open PDF file
        file = new File("C:\\Program Files\\Windows Application Driver\\WinAppDriver.exe");
        if(file.exists()) desktop.open(file);
    } */	
	
	//To open WinAppDriver//
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
		System.out.println("WinAppDriver is successfully Opened");

	}

	//To Close WinAppDriver//
	public static void CloseWinAppDriver() throws IOException {	
		String taskKillCommand = "taskkill /F /IM WinAppDriver.exe";

		ProcessBuilder processBuilder = new ProcessBuilder("cmd.exe", "/c", taskKillCommand);
		Process process = processBuilder.start();
	}

   /* try {
        int exitCode = process.waitFor();

        if (exitCode == 0) {
            System.out.println("WinAppDriver is successfully closed");
        } else {
            System.out.println("Failed to close WinAppDriver process.");
        }
    } catch (InterruptedException e) {
        System.out.println("An error occurred while waiting for WinAppDriver process to close: " + e.getMessage()); }*/
    }


    
	
	public static void main(String[] args) throws Exception {
		
		OpenWinAppDriver();
		//MinimizeWinAppDriver();
		Thread.sleep(3000);
		
		CloseWinAppDriver();
		
		
	
	}
    
    
    
}