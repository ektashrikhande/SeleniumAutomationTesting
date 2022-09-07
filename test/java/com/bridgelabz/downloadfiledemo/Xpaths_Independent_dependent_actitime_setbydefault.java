package com.bridgelabz.downloadfiledemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Xpaths_Independent_dependent_actitime_setbydefault {

	@Test
	public static void xpaths_Independent_dependent_actitime_setbydefault() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32_104\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.findElement(By.id("email")).sendKeys("AprnaShrikhande@gmail.com");

		driver.findElement(By.name("pass")).sendKeys("10ekta01");
		// click on login button
		driver.findElement(By.xpath("//button[@id='u_0_b_7+']")).click();
		Thread.sleep(4000);

		// Click on settings tab on home page
		driver.findElement(By.xpath("(//button[contains(@name,='login'])")).click();
		Thread.sleep(2000);

		// Click on Types of Work link
		driver.findElement(By.xpath("//span[text()='Aprna']")).click();
		Thread.sleep(4000);

		// Click on testing link present under Type of work column
		driver.findElement(By.xpath("//a[.='testing']/../..//a[.='set by default']")).click();
		driver.close();
	}
}
