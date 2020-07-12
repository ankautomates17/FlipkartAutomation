package com.flipkart.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.flipkart.qa.base.TestBase;

public class HomePage extends TestBase {

	@FindBy(xpath = "//div[contains(text(),'My Account')]")
	WebElement myAccountLink;

	@FindBy(xpath = "//input[@title='Search for products, brands and more']")
	WebElement searchField;

	@FindBy(xpath = "//span[contains(text(),'TVs & Appliances')]")
	WebElement tvAndAppliancesLink;

	@FindBy(xpath = "//a[@title='Television']")
	WebElement televisionLink;

	@FindBy(xpath = "//span[contains(text(),'Cart')]")
	WebElement cartLink;

	//Initializing the Page Objects
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean validateMyAccountLink() {
		return myAccountLink.isDisplayed();
	}
	
	//search field for data driven testing--will cover it later
		
	public TelevisionsPage clickOnTelevisionsLink() {
		tvAndAppliancesLink.click();
		televisionLink.click();
		return new TelevisionsPage();
	}




}
