package com.bridgelabz.windowhandle;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ChildBrowserPopup {

	@Test
	
	

	public static void childBrowserPopup()throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32_104\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/");
		Set<String> allWindowHandles = driver.getWindowHandles();
		int count = allWindowHandles.size();
		System.out.println("Number of brower windows opened on the system is : "+ count);
		for(String windowHandles : allWindowHandles) {
		driver.switchTo().window(windowHandles)	;
		String title = driver.getTitle();
		System.out.println("Window handle id of page -->"+ title +"--> is : "+windowHandles);
		driver.close();
		
		}
	}	
		
}
