package com.flipkart.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.flipkart.qa.base.TestBase;

public class MyProfilePage extends TestBase{

	@FindBy(xpath = "//div[contains(text(),'Manage Addresses')]")
	WebElement manageAddressesLink;

	//Initializing the Page Objects
	public MyProfilePage() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean validateManageAddressesLink() {
		return manageAddressesLink.isDisplayed();
				
	}
	
	public ManageAddressesPage clickOnManageAddressesLink() {
		manageAddressesLink.click();
		return new ManageAddressesPage();
	}
}
