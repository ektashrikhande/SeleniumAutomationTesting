package com.bridgelabz.downloadfiledemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
@Test


public class EnterTextintoFocussedElement {
	public static void enterTextintoFocussedElement() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32_104\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.switchTo().activeElement().sendKeys("AprnaShrikhande@gmail.com");
		driver.close();
		}
}		


