package com.bridelabz.actionclassdemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mousehover {
	
	public static void verifyMouseHover() {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32_104\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Actions action = new Actions(driver);
		WebElement AreaOfExpertise = driver.findElement(By.xpath("//a[contains(.,
		EXPERTISE')]"));
		action.moveToElement(AreaOfExpertise).perform();
		WebElement cloudApp = driver.findElement(By.linkText("Sign up"));
		action.moveToElement(cloudApp).click().perform();
		
	}
}
