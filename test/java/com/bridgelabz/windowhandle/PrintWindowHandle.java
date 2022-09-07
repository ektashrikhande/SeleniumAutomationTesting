package com.bridgelabz.windowhandle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PrintWindowHandle  {
	@Test
	
	public static void printwindowhandle()  throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", ".\\driver\\geckodriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//get the window handle id of the browser
		String windowHandle = driver.getWindowHandle();
		System.out.println(windowHandle);
		}
}
