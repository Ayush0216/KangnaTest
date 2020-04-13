package com.stage.pagemodels;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.stage.runners.common;

public class Homepage {
	WebDriver driver;

	public Homepage(WebDriver driver) {

		// TODO Auto-generated constructor stub
		this.driver = driver;

		PageFactory.initElements(this.driver, this);
	}

	@FindBy(how = How.XPATH, xpath = "//button[@class='search-button']")
	static WebElement search_btn;

	@FindBy(how = How.XPATH, xpath = "//div[@class='header-search desktop-search']//input[@class='input-text q']")
	static WebElement HMTextBox;

	@FindBy(how = How.XPATH, xpath = "//button[text()='Decline Offers']")
	static WebElement bounceXDeclineBtn;

	public WebElement getTextBox() {
		return HMTextBox;
	}

	public WebElement getSearchButton() {
		return search_btn;

	}

	public WebElement getBounceXDecline() {
		return bounceXDeclineBtn;

	}

}
