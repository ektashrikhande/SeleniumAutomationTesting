package com.bridgelabz.webelementinterfacemethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TextintoTheFocussedElement {
	@Test

	public static void textintoTheFocussedElement() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32_104\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.switchTo().activeElement().sendKeys("admin");
		}
}
