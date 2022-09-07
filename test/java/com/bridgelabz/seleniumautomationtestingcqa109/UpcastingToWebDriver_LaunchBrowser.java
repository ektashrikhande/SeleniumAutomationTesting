package com.bridgelabz.seleniumautomationtestingcqa109;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpcastingToWebDriver_LaunchBrowser {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32_104\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		
		String title = driver.getTitle();
		System.out.println("the title of page the is:" + title);
		
        String currentUrl = driver.getCurrentUrl();
        System.out.println("the url of page the is:" + currentUrl);
        String pageSource = driver.getPageSource();
        System.out.println("the source code of the page is:" + pageSource);
        
        Thread.sleep(3000);
        String windowHandle = driver.getWindowHandle();
        System.out.println("the windowhandle of the page is:" + windowHandle);
        WebDriver.Options manage = driver.manage();
        System.out.println("the option of the page is:" + manage);
        WebDriver.Navigation navigate = driver.navigate();
        System.out.println("the navigate of the page is:" + navigate);
        Thread.sleep(3000);
        driver.close();
        driver.quit();
	}

}

