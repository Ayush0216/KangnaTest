package com.stage.pagemodels;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SearchResult {
	WebDriver driver;

	public SearchResult(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
	}

	@FindBy(how = How.XPATH, xpath = "//div[@class='product-listing-wrapper']//div[contains(@class,'product-image')]/a")
	static WebElement firstProduct;

	public WebElement getFirstProduct() {
		return firstProduct;
	}

}
