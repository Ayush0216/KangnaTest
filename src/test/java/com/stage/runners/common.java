package com.stage.runners;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.stage.utilities.DriverFactory;

public class common {
	static WebDriver driver;
	DriverFactory driverFactory;
	
	

	public static void waitThread(long millisecond) {
		try {
			Thread.sleep(millisecond);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void setText(String text, String xpath, WebDriver driver) {
		try {
			driver.findElement(By.xpath(xpath)).clear();
			waitThread(100l);
			driver.findElement(By.xpath(xpath)).sendKeys(text);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void setText(WebElement ele, String text, WebDriver driver) {
		try {
			ele.clear();
			ele.sendKeys(text);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void clickJS(String xpath, WebDriver driver) {
		WebElement webElement = null;
		webElement = driver.findElement(By.xpath(xpath));
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", webElement);

	}

	public static void clickJS(WebElement webElement, WebDriver driver) {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", webElement);
	}

	public static void click(String xpath, WebDriver driver) {
		driver.findElement(By.xpath(xpath)).click();
	}

	public static void click(WebElement webElement, WebDriver driver) {
		webElement.click();
	}

	public static void clickwithscroll(String xpath, WebDriver driver) throws InterruptedException {
		WebElement ele = driver.findElement(By.xpath(xpath));
		scrolldownUntilVisisble(ele);
		ele.click();
	}

	public static void clicWithWait(WebElement webElement, WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(webElement));
		webElement.click();
	}

	public static void scrolldownUntilVisisble(WebElement element) {

		try {
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
			Thread.sleep(500);
		} catch (Exception e) {
		}

	}

	public static void scrolltillPageEnd() {
		try {
			((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
			Thread.sleep(500);
		} catch (Exception e) {
		}

	}

	public static void scrolldowntoElement(WebElement element) {

		while (!element.isDisplayed()) {
			scrolltillPageEnd();
			try {
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
				Thread.sleep(1000);
			} catch (Exception e) {

			}
		}

	}

	public static String getText(String xpath, WebDriver driver) {
		return driver.findElement(By.xpath(xpath)).getText();
	}

	public static void getPage(String URL) {
		// if()
		driver.get(URL);
	}

	public static int getElementCount(String xpath, WebDriver driver) {
		return driver.findElements(By.xpath(xpath)).size();
	}

	public static List<WebElement> getWebElements(String xpath, WebDriver driver) {
		List<WebElement> ele = driver.findElements(By.xpath(xpath));
		return ele;

	}

}
