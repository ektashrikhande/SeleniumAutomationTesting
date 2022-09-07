package com.bridgelabz.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NameLocatorsDemo {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32_104\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		WebElement unTB = driver.findElement(By.id("user"));

		unTB.clear();

		unTB.sendKeys("ajit.biswas@gmail.com");

		WebElement passTB = driver.findElement(By.name("n1"));

		passTB.clear();

		Thread.sleep(2000);

		passTB.sendKeys("Qspiders123");

		driver.findElement(By.linkText("Click ActiTIME link")).click();

		Thread.sleep(2000);
	}
}