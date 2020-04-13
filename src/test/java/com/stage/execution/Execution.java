package com.stage.execution;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.stage.pagemodels.CartPage;
import com.stage.pagemodels.Homepage;
import com.stage.pagemodels.SearchResult;
import com.stage.runners.LaunchBrowser;
import com.stage.runners.common;
import com.stage.utilities.DriverFactory;

public class Execution extends common {

	static Homepage home;
	static LaunchBrowser launchBrowser;
	static WebDriver driver;
	static DriverFactory driverFactory;
	static CartPage cartPage;
	static SearchResult searchResult;

	public static void main(String[] args) throws InterruptedException {

		System.out.println("Test Start -------------------------------");

		initiatePges();

		launchBrowser.Launch(driver);
		
		clicWithWait(home.getBounceXDecline(), driver);
		clicWithWait(home.getSearchButton(), driver);
		setText(home.getTextBox(), "sofa", driver);
		clicWithWait(home.getSearchButton(), driver);
		clicWithWait(searchResult.getFirstProduct(), driver);
		clicWithWait(cartPage.getAddToCart(), driver);
		clicWithWait(cartPage.getCheckout(), driver);
		clicWithWait(cartPage.guestCheckout(), driver);

		// driver.quit();
		
		System.out.println("Test End -------------------------------");

	}

	public static void initiatePges() {
		driverFactory = new DriverFactory();
		driver = driverFactory.getDriver();
		launchBrowser = new LaunchBrowser();
		home = new Homepage(driver);
		cartPage = new CartPage(driver);
		searchResult = new SearchResult(driver);
	}

}
