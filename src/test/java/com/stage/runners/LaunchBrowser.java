package com.stage.runners;

import org.openqa.selenium.WebDriver;

import com.stage.utilities.DriverFactory;

public class LaunchBrowser {
	// static WebDriver driver;

	public void Launch(WebDriver driver) {
		driver.get("https://store.hermanmiller.com/home?lang=en_US");
		driver.manage().window().maximize();
		System.out.println("Browser Launched");
	}

}