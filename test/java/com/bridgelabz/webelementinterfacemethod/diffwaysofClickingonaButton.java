package com.bridgelabz.webelementinterfacemethod;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class diffwaysofClickingonaButton {
	@Test
	
	public static void verifyClickingbuttonUsingClick()throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32_104\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		String xp = "//button[text()='Log In']";
		driver.findElement(By.xpath(xp)).click();
		driver.close();
	}
	@Test
	
	public static void verifysClickingbuttonUsingSendKeys ()throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32_104\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		String xp = "//button[text()='Log In']";
		driver.findElement(By.xpath(xp)).sendKeys(Keys.ENTER);
		driver.close();	
		
	}
	@Test
	
	public static void verifysClickingbuttonUsingSubmit()throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32_104\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	String xp = "//button[text()='Log In']";
	driver.findElement(By.xpath(xp)).submit();
	driver.close();
		
	}  
	
}	