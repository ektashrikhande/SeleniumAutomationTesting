package com.bridgelabz.handlingpopup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FileUploadPopup_Demo {
	@Test
	public static void fileUploadPopup_Demo() throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32_104\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://nervgh.github.io/pages/angular-file-upload/examples/simple");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@multiple='']")).sendKeys("\"c:\\Program Files\\upload.csv.csv\".xlsx");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@ng-click=\"item.upload()\"]")).click();
		Thread.sleep(2000);
		driver.close();
		}

}
