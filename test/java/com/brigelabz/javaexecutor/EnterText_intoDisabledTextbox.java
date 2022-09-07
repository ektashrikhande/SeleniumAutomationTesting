package com.brigelabz.javaexecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class EnterText_intoDisabledTextbox {
	
	@Test
	public static void enterText_intoDisabledTextbox() throws InterruptedException {


		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32_104\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("file:///C:/Users/ektas/OneDrive/Desktop/disabled.html");

		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Thread.sleep(2000);

		
		js.executeScript("document.getElementById('t1').value='admin'");
		Thread.sleep(2000);

		
		js.executeScript("document.getElementById('t2').value=''");

		
		js.executeScript("document.getElementById('t2').value='manager'");

		
		js.executeScript("document.getElementById('t2').type='button'");
		
		driver.close();
		}}


