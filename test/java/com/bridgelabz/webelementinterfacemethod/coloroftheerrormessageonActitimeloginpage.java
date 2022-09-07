package com.bridgelabz.webelementinterfacemethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class coloroftheerrormessageonActitimeloginpage {
	@Test
	
	public static void verifycoloroftheerrormessageonActitimeloginpage()  {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32_104\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//button[text()='Log In ']")).click();
		WebElement errMsg =driver.findElement(By.xpath("//button[text()='Log In ']"));
		String errtext = errMsg.getText();
		System.out.println("error message is :"+ errtext);
		String c = errMsg.getCssValue("color");
		if (c.equals("#ce0100")) {
		System.out.println(“Error message is in red color”);
		}else{
			System.out.println(“Error message is in red color”);
		}
        String fontsize = errMsg.getCssValue("font-size");
		String fontWeight = errMsg.getCssValue("font-weight");
		System.out.println("Size of the font is :" + fontsize);
		System.out.println("Weight of the font is :" + fontWeight);
		driver.close();
		}
		}


