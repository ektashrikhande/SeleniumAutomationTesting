package com.bridgelabz.downloadfiledemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DownloadFileDemo {

	@Test
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32_104\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.seleniumhq.org/download/");
		Thread.sleep(3000);

		driver.findElement(By.xpath("//td[.='Java']/..//a[.='Download']")).click();
	}
}
