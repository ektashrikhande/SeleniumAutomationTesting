package com.bridgelabz.handlingpopup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileDownload {
	public static void fileDownload() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32_104\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String key = "browser.helperApps.neverAsk.saveToDisk";
		//Set the type of file which you want to download
		String value = "application/zip";
		Object profile;
		//using setPreference() method, change the setting
		profile.setPreference(key, value);
		// 0 - save to desktop, 1 - save to download folder( default), 2 - save to any other //location
		profile.setPreference("browser.download.folderList", 2);
		//save the file to the given folder location
		profile.setPreference("browser.download.dir", "D:\\Ekta\\Others");
		//Use DesiredCapabilities class to modify the firefox settings as shown below
		DesiredCapabilities cap = DesiredCapabilities.firefox();
		cap.setCapability(FirefoxDriver.PROFILE, profile);
		//Launch the firefox browser with the above modified settings
		WebDriver driver = new FirefoxDriver(cap);
		//Enter selenium official website url
		driver.get("http://www.seleniumhq.org/download/");
		//Use following-sibling axes in Xpath to find the download link for selenium java
		driver.findElement(By.xpath("//td[text()='Java']//following-sibling::td[3]/a")).click();
		Thread.sleep(3000);
		}

	

}
