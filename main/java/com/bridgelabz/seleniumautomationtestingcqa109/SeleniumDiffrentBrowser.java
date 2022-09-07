package com.bridgelabz.seleniumautomationtestingcqa109;

import java.awt.AWTException;
import java.io.IOException;
import java.util.Scanner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SeleniumDiffrentBrowser {

	public static void main(String[] args) throws IOException {
		System.out.println("Welcome to Selenium diffrent browser testing Program");
		choice();
	}

	public static void choice()  {
	  Scanner scanner = new Scanner(System.in);
	  
	  System.out.println("for chorme browser press 1");
	  System.out.println("for edge browser press 2");
	  System.out.println("for internet explorer press 3");
	  System.out.println("Exit 4");
	  System.out.println("Enter your choice");
	  
	  int UsrIn;
	  UsrIn = scanner .nextInt();
	  
	  while (UsrIn !=0)  
	  {
		  switch (UsrIn) 
		  {
	  			case 1:
	  				while (UsrIn!=2) {
	  					try {
	  						automationTestchromeDriver();
	  						}
	  						catch (InterruptedException  | AWTException | IOException e)  {
	  								e.printStackTrace();
	  						}
	  						System.out.println("Would you like to check other browser? 1: Yes,  2:No");
	  						UsrIn = scanner.nextInt();
				  
	  					}
	  				break;
	  			case 2:
	  					try  {
	  							automationTestEdgeDriver();
	  						}  
	  						catch (InterruptedException  | AWTException | IOException e) {
	  							e.printStackTrace();
	  						}
	  					break;
	  			case 3:
	  					try  {
	  							automationTestInternetExplorerDriver();
	  						}
	  						catch (InterruptedException  | AWTException | IOException e ) 
	  						{
	  							e.printStackTrace();
	  						}
	  					break;	
	  				default: System.out.println("no valid option");
	  				break;
		  		}
	  }
	  System.out.println("GoodBye");
  
	}

	public static void automationTestchromeDriver() throws InterruptedException, AWTException, IOException {

		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32_104\\chromedriver.exe");

		WebDriver webdriver = new ChromeDriver();
		webdriver.get("https://www.facebook.com/");
		System.out.println(webdriver.getTitle());
		Thread.sleep(2000);

		webdriver.findElement(By.linkText("create New Account")).click();
		Thread.sleep(2000);

		webdriver.findElement(By.name("firstname")).sendKeys("ekta");
		Thread.sleep(2000);

		webdriver.findElement(By.name("lastname")).sendKeys("shrikhande");
		Thread.sleep(2000);

		webdriver.findElement(By.name("reg_email_confirmation_")).sendKeys("AprnaShrikhnade@gmail.com");
		Thread.sleep(2000);

		webdriver.findElement(By.name("reg_password_")).sendKeys("10ekta01");
		Thread.sleep(2000);

		webdriver.findElement(By.name("birthday_day")).sendKeys("10");
		Thread.sleep(2000);

		webdriver.findElement(By.name("birthday_month")).sendKeys("march");
		Thread.sleep(2000);

		webdriver.findElement(By.name("birthday_year")).sendKeys("1995");
		Thread.sleep(2000);

		((WebDriver) webdriver.findElement(By.name("sex"))).get(0).click();
		Thread.sleep(2000);

		webdriver.findElement(By.name("websubmit")).click();
		Thread.sleep(2000);

		webdriver.close();
	}

	public static void automationTestEdgeDriver() throws InterruptedException, AWTException, IOException {

		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32_104\\chromedriver.exe");

		WebDriver webdriver = new EdgeDriver();
		webdriver.get("https://www.facebook.com/");
		System.out.println(webdriver.getTitle());
		Thread.sleep(2000);

		webdriver.findElement(By.linkText("create New Account")).click();
		Thread.sleep(2000);

		webdriver.findElement(By.name("firstname")).sendKeys("ekta");
		Thread.sleep(2000);

		webdriver.findElement(By.name("lastname")).sendKeys("shrikhande");
		Thread.sleep(2000);

		webdriver.findElement(By.name("reg_email_confirmation_")).sendKeys("AprnaShrikhnade@gmail.com");
		Thread.sleep(2000);

		webdriver.findElement(By.name("reg_password_")).sendKeys("10ekta01");
		Thread.sleep(2000);

		webdriver.findElement(By.name("birthday_day")).sendKeys("10");
		Thread.sleep(2000);

		webdriver.findElement(By.name("birthday_month")).sendKeys("march");
		Thread.sleep(2000);

		webdriver.findElement(By.name("birthday_year")).sendKeys("1995");
		Thread.sleep(2000);

		webdriver.findElement(By.name("sex")).get(0).click();
		Thread.sleep(2000);

		webdriver.findElement(By.name("websubmit")).click();
		Thread.sleep(2000);

		webdriver.close();
	}

	public static void automationTestInternetExplorerDriver() throws InterruptedException, AWTException, IOException {

		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32_104\\chromedriver.exe");

		WebDriver webdriver = new ChromeDriver();
		webdriver.get("https://www.facebook.com/");
		System.out.println(webdriver.getTitle());
		Thread.sleep(2000);

		webdriver.findElement(By.linkText("create New Account")).click();
		Thread.sleep(2000);

		webdriver.findElement(By.name("firstname")).sendKeys("ekta");
		Thread.sleep(2000);

		webdriver.findElement(By.name("lastname")).sendKeys("shrikhande");
		Thread.sleep(2000);

		webdriver.findElement(By.name("reg_email_confirmation_")).sendKeys("AprnaShrikhnade@gmail.com");
		Thread.sleep(2000);

		webdriver.findElement(By.name("reg_password_")).sendKeys("10ekta01");
		Thread.sleep(2000);

		webdriver.findElement(By.name("birthday_day")).sendKeys("10");
		Thread.sleep(2000);

		webdriver.findElement(By.name("birthday_month")).sendKeys("march");
		Thread.sleep(2000);

		webdriver.findElement(By.name("birthday_year")).sendKeys("1995");
		Thread.sleep(2000);

		(webdriver) (WebDriver) webdriver.findElement(By.name("sex"))).get(0).click();
		Thread.sleep(2000);

		webdriver.findElement(By.name("websubmit")).click();
		Thread.sleep(2000);

		webdriver.close();
	}

}
