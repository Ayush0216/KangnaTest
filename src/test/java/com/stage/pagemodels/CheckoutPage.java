package com.stage.pagemodels;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage {
	WebDriver driver;

	public CheckoutPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(this.driver, this);
	}

	@FindBy(how = How.XPATH, xpath = "//input[@class='input-text email  required error']")
	static WebElement Email_id;

	@FindBy(how = How.XPATH, xpath = "//input[@class='input-text shipping-first-name  required error']")
	static WebElement Fname;

	@FindBy(how = How.XPATH, xpath = "//input[@class='input-text shipping-last-name  required error']")
	static WebElement Lname;

	@FindBy(how = How.XPATH, xpath = "//input[@class='input-text validate-address  required error']")
	static WebElement address1;

	@FindBy(how = How.XPATH, xpath = "//input[@class='input-text shipping-city  required error']")
	static WebElement City;

	@FindBy(how = How.XPATH, xpath = "//input[@class='dwfrm_singleshipping_shippingAddress_addressFields_states_state']")
	static WebElement State;

	@FindBy(how = How.XPATH, xpath = "//input[@class='input-text shipping-postal-code  required error']")
	static WebElement Zip;

	@FindBy(how = How.XPATH, xpath = "//input[@class='input-text shipping-telephone phone required error']")
	static WebElement Phone;

	public static WebElement getemail() {
		return Email_id;
	}

	public static WebElement getFirstName() {
		return Fname;
	}

	public static WebElement getLastName() {
		return Lname;
	}

	public static WebElement getaddress() {
		return address1;
	}

	public static WebElement getcityName() {
		return City;
	}

	public static WebElement getZipCode() {
		return Zip;
	}

	public static WebElement getPhoneNo() {
		return Phone;
	}
}
