package com.bridelabz.actionclassdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragAndDropbyOffset_Example {
	
	@Test
	
	public void dragAndDropbyOffset_Example() {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32_104\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		String xp1 = "//input[@id='email']";
		WebElement block1 = driver.findElement(By.xpath(xp1));
		String xp2 = "//input[@name='pass']";
		WebElement block3 = driver.findElement(By.xpath(xp2));
		Actions actions = new Actions(driver);
		actions.dragAndDropBy(block1, block3.getLocation().getX() + 10,block3.getSize();
		driver.close();
		}
}	

