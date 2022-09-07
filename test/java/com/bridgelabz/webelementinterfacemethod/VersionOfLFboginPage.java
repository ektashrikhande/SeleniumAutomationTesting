package com.bridgelabz.webelementinterfacemethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class VersionOfLFboginPage {
	@Test
	
	public static void printVersionOfFacebookLoginPage() {
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32_104\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		String version = driver.findElement(By.xpath("//img[@alt='Facebook']")).getText();
		System.out.println("Version of facebook on login page is : " + version);
		}
	
	}


