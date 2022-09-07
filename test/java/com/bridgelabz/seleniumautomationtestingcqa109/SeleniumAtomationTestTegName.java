package com.bridgelabz.seleniumautomationtestingcqa109;

import java.awt.AWTException;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SeleniumAtomationTestTegName {

	@Test
	
	public static void automationTestTegNameAnchoTeg() throws InterruptedException, AWTException, IOException {

		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32_104\\chromedriver.exe");

		WebDriver webdriver = new ChromeDriver();

		webdriver.get("https://www.facebook.com/");

		System.out.println(webdriver.getTitle());

		Thread.sleep(2000);

		List<WebElement> allLinks = webdriver.findElements(By.tagName("ancho"));

		int totalLinks = allLinks.size();
		System.out.println("total number of links present on the web page : " + totalLinks);
		int visibleLinkCount = 0;
		int hiddenLinkCount = 0;

		for (WebElement link : allLinks) {
			if (link.isDisplayed()) {
				visibleLinkCount++;
				System.out.println(visibleLinkCount + "-->" + link.getText());

			} else {
				hiddenLinkCount++;

			}
		}
		System.out.println("Total number of visible Links : " + visibleLinkCount);
		System.out.println("Total number of hidden Links : " + hiddenLinkCount);
		webdriver.close();
	}

	@Test
	public static void automationTestTegNameInputTeg() throws InterruptedException, AWTException, IOException {

		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32_104\\chromedriver.exe");

		WebDriver webdriver = new ChromeDriver();

		webdriver.get("https://www.facebook.com/");

		System.out.println(webdriver.getTitle());

		Thread.sleep(2000);

		List<WebElement> allLinks = webdriver.findElements(By.tagName("input"));

		int totalLinks = allLinks.size();
		System.out.println("total number of links present on the web page : " + totalLinks);
		int visibleLinkCount = 0;
		int hiddenLinkCount = 0;

		for (WebElement link : allLinks) {
			if (link.isDisplayed()) {
				visibleLinkCount++;
				System.out.println(visibleLinkCount + "-->" + link.getText());

			} else {
				hiddenLinkCount++;

			}
		}
		System.out.println("Total number of visible Links : " + visibleLinkCount);
		System.out.println("Total number of hidden Links : " + hiddenLinkCount);
		webdriver.close();

	}

	@Test
	public static void automationTestTegNameDivTeg() throws InterruptedException, AWTException, IOException {

		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32_104\\chromedriver.exe");

		WebDriver webdriver = new ChromeDriver();

		webdriver.get("https://www.facebook.com/");

		System.out.println(webdriver.getTitle());

		Thread.sleep(2000);

		List<WebElement> allLinks = webdriver.findElements(By.tagName("div"));

		int totalLinks = allLinks.size();
		System.out.println("total number of links present on the web page : " + totalLinks);
		int visibleLinkCount = 0;
		int hiddenLinkCount = 0;

		for (WebElement link : allLinks) {
			if (link.isDisplayed()) {
				visibleLinkCount++;
				System.out.println(visibleLinkCount + "-->" + link.getText());

			} else {
				hiddenLinkCount++;

			}
		}
		System.out.println("Total number of visible Links : " + visibleLinkCount);
		System.out.println("Total number of hidden Links : " + hiddenLinkCount);
		webdriver.close();

	}

	@Test
	public static void automationTestTegNameSxriptTeg() throws InterruptedException, AWTException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32_104\\chromedriver.exe");

		WebDriver webdriver = new ChromeDriver();

		webdriver.get("https://www.facebook.com/");

		System.out.println(webdriver.getTitle());

		Thread.sleep(2000);

		List<WebElement> allLinks = webdriver.findElements(By.tagName("script"));

		int totalLinks = allLinks.size();
		System.out.println("total number of links present on the web page : " + totalLinks);
		int visibleLinkCount = 0;
		int hiddenLinkCount = 0;

		for (WebElement link : allLinks) {
			if (link.isDisplayed()) {
				visibleLinkCount++;
				System.out.println(visibleLinkCount + "-->" + link.getText());

			} else {
				hiddenLinkCount++;

			}
		}
		System.out.println("Total number of visible Links : " + visibleLinkCount);
		System.out.println("Total number of hidden Links : " + hiddenLinkCount);
		webdriver.close();
	}

	@Test
	public static void automationTestTegNameStyleTeg() throws InterruptedException, AWTException, IOException {

		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32_104\\chromedriver.exe");

		WebDriver webdriver = new ChromeDriver();

		webdriver.get("https://www.facebook.com/");

		System.out.println(webdriver.getTitle());

		Thread.sleep(2000);

		List<WebElement> allLinks = webdriver.findElements(By.tagName("style"));

		int totalLinks = allLinks.size();
		System.out.println("total number of links present on the web page : " + totalLinks);
		int visibleLinkCount = 0;
		int hiddenLinkCount = 0;

		for (WebElement link : allLinks) {
			if (link.isDisplayed()) {
				visibleLinkCount++;
				System.out.println(visibleLinkCount + "-->" + link.getText());

			} else {
				hiddenLinkCount++;

			}
		}
		System.out.println("Total number of visible Links : " + visibleLinkCount);
		System.out.println("Total number of hidden Links : " + hiddenLinkCount);
		webdriver.close();

	}
}
