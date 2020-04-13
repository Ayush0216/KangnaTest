package com.stage.pagemodels;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
	WebDriver driver;

	public CartPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
	}

	@FindBy(how = How.XPATH, xpath = "//button[@id='add-to-cart']")
	static WebElement AddToCart_btn;

	@FindBy(how = How.XPATH, xpath = "//a[@class='mini-cart-link-checkout button']")
	static WebElement checkout_btn;

	@FindBy(how = How.XPATH, xpath = "//button[@name='dwfrm_login_unregistered']")
	static WebElement guestcheckout_btn;

	public WebElement getAddToCart() {
		return AddToCart_btn;
	}

	public WebElement getCheckout() {
		return checkout_btn;

	}

	public WebElement guestCheckout() {
		return guestcheckout_btn;

	}
}
