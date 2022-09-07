package com.bridgelabztakeascreenshot;
import java.io.File;

import java.io.IOException;
import java.sql.Date;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class screenshotdemo {
	

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32_104\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		Date d = new Date(0);
		
		String date1 = d.toString();
	    System.out.println(date1);
	    String date2 = date1.replaceAll(":", "_");
	    System.out.println(date2);
	    
	    driver.get("https://www.facebook.com/");
        TakesScreenshot ts = (TakesScreenshot) driver;
        File srcFile = ts.getScreenshotAs(OutputType.FILE);
        File destFile = new File(".\\screenshot\\" + date2 + "__actiTIMELoginPage.png");
        
        System.out.println(srcFile);
        System.out.println(destFile);
        
        FileUtils.copyFile(srcFile, destFile);
        
        driver.close(); 
    }
}
