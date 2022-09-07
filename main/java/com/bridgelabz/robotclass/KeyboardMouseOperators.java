package com.bridgelabz.robotclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class KeyboardMouseOperators {
	public static void main(String[] args) throws InterruptedException, AWTException {
	{
	
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32_104\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(5000);
		
		Robot robot = new Robot();
		
		robot.mouseMove(300, 500);
		
		robot.keyPress(KeyEvent.VK_ALT);
	
		
		robot.keyPress(KeyEvent.VK_F);
		
		robot.keyRelease(KeyEvent.VK_F);
	
		
		robot.keyRelease(KeyEvent.VK_ALT);
		Thread.sleep(3000);
	
		robot.keyPress(KeyEvent.VK_W);
		
		robot.keyRelease(KeyEvent.VK_W);
		Thread.sleep(3000);
	
		driver.quit();
	}
	}
}
