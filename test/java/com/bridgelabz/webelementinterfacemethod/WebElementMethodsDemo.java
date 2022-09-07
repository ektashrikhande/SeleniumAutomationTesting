package com.bridgelabz.webelementinterfacemethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebElementMethodsDemo {
	
	public class VerifyUNandPWDalignment{
		
	@Test	
		public void verifyUNandPWDalignment() {

			System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32_104\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
			driver.navigate().to("https://www.facebook.com/");
			 driver.get("http://localhost:8080/login.do");
				WebElement unTB = driver.findElement(By.id("email"));
				int un_x = unTB.getLocation().getX();
				int un_width = unTB.getSize().getWidth();
				int un_height = unTB.getSize().getHeight();
				WebElement pwTB = driver.findElement(By.name("pass"));
				int pw_x = pwTB.getLocation().getX();
				int pw_width = pwTB.getSize().getWidth();
				int pw_height = pwTB.getSize().getHeight();
				if (un_x == pw_x && un_width==pw_width && un_height==pw_height) {
				System.out.println("Username and password text box are aligned");
				} else {
				System.out.println("Username and password text box are NOT aligned");
				System.out.println(unTB);
				System.out.println(pw_height);
				System.out.println(un_x+un_width+un_height);
				System.out.println(pwTB);
				System.out.println(pw_width+pw_x);
				
				}
				}
				}

		}
			
			
       
