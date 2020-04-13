package com.stage.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverFactory {
	public static WebDriver driver;

	public DriverFactory() {
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\Driver\\chromedriver.exe");
		ChromeOptions opts = new ChromeOptions();
		opts.addArguments("--disable-notifications");
		driver = new ChromeDriver(opts);
	}

	public WebDriver getDriver() {
		return driver;
	}

}
