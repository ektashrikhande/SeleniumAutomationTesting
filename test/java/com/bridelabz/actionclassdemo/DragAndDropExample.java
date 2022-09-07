package com.bridelabz.actionclassdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragAndDropExample {
	@Test

	public static void verifyDragAndDropExample()throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32_104\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		String xp1 = "//input[@id='email']";
		WebElement block1 = driver.findElement(By.xpath(xp1));
		block1.sendKeys("7020212443");
		String xp2 = "//input[@id='pass']";
		WebElement block3 = driver.findElement(By.xpath(xp2));
		Actions actions = new Actions(driver);
		 actions.dragAndDrop(block1,block3).perform();
		 driver.close();
				
	}

}