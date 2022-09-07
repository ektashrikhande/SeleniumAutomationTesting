package com.brigelabz.javaexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScrollUpandDowntospecificElementonWebpage {
	@Test

	public static void scrollUpandDowntospecificElementonWebpage() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32_104\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		for (int i = 1; i < 10; i++) {
			js.executeScript("window.scrollBy(o.1000)");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//@[title='Facebook lite for android.']"));
			System.out.println("Facebook Lite webelement found");
			driver.close();
		}
	}
}