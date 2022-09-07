package com.bridgelabz.webelementinterfacemethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ViewLicenselinkOnLoginPageOfFacebook {
	@Test
	
	public static void verifyViewUsername_isalinkoffacebookpage() {
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32_104\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		String tagName= driver.findElement(By.id("email")).getTagName();
		if (tagName.equals("a")) {
		System.out.println("View username is a link");
		} else{
		System.out.println("View username is NOT a link");
		}
		driver.close();
		}
	
	}


