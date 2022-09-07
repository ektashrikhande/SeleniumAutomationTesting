package com.brigelabz.javaexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScrollUpAndDown {
     @Test

	
	
	public static void scrollUpAndDownPage()  throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32_104\\chromedriver.ex");
		WebDriver driver = new ChromeDriver();
		driver.get("http://seleniumhq.org/download");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		for (int i= 1; i<10; i++) {
			  js.executeScript("window.scrollBy(0,1000)");
			  Thread.sleep(3000);
			}
		for (int i= 1; i<10; i++) {
			  js.executeScript("window.scrollBy(0,-1000)");
			  Thread.sleep(3000);
			}
		driver.close();
      }
}  

