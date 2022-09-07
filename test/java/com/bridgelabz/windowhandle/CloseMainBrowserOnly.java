package com.bridgelabz.windowhandle;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CloseMainBrowserOnly {
	@Test
	
	public static void closeMainBrowserOnly()throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32_104\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/");
		String parentWindowhandleID = driver.getWindowHandle();
		Set<String> allWindowHandles = driver.getWindowHandles();
		String title = driver.getTitle();
		int count = allWindowHandles.size();
		System.out.println("Number of browser windows opened on the system is : "+ count);
		for (String windowHandle : allWindowHandles) {
		driver.switchTo().window(windowHandle);
		if (windowHandle.equals(parentWindowhandleID)) {
		driver.close();
		System.out.println("Main Browser window with title -->"+ title +" --> is closed");
		}}}
}


