package com.flipkart.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.flipkart.qa.base.TestBase;

public class LoginPage extends TestBase {
	
	//Page Factory - Object Repository (OR):
	
	@FindBy(xpath = "//input[@class='_2zrpKA _1dBPDZ']")
	WebElement email;
	
	@FindBy(xpath = "//input[@type='password']")
	WebElement password;
	
	@FindBy(xpath = "//button[@class='_2AkmmA _1LctnI _7UHT_c']")
	WebElement loginBtn;
	
	@FindBy(xpath = "//img[@title='Flipkart']")
	WebElement flipkartLogo;
	
	
	//Initializing the Page Objects
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	//Actions:
	public String validateLoginPageTitle() {
		return driver.getTitle();
	}
	
	public boolean validateFlipkartLogo() {
		return flipkartLogo.isDisplayed();
	}
	
	public HomePage login(String id, String pwd) {
	    email.sendKeys(id);
		password.sendKeys(pwd);
		loginBtn.click();
		
		return new HomePage(); //return type is HomePage object once we click on login button
	}
		
}
