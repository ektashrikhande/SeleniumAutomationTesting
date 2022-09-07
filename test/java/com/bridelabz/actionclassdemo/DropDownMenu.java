package com.bridelabz.actionclassdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DropDownMenu {
	@Test
	
     public static void dropDownMenu() {  
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32_104\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		String xp = "//a[contains(.,'Create New Account')]";
		WebElement menu = driver.findElement(By.xpath(xp));
		Actions actions = new Actions(driver);
		actions.moveToElement(menu).perform();
		WebElement sabmenu = driver.findElement(By.linkText("Sign UP"));
		sabmenu.click();
		driver.close();
     }	

}
