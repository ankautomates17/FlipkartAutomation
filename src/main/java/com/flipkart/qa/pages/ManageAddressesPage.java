package com.flipkart.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.flipkart.qa.base.TestBase;

public class ManageAddressesPage extends TestBase{
	
	@FindBy(xpath = "//div[@class='_2kr2AM']")
	WebElement newAddress;

	@FindBy(name = "name")
	WebElement name;

	@FindBy(name = "phone")
	WebElement phone;

	@FindBy(name = "pincode")
	WebElement pincode;

	@FindBy(name = "addressLine2")
	WebElement locality;

	@FindBy(name = "addressLine1")
	WebElement address;

//	@FindBy(xpath = "//div[@class='_2o59RR']/span[contains(text(),'Home')]")
//	WebElement homeRdBtn;

	@FindBy(xpath = "//button[contains(text(),'Save')]")
	WebElement saveBtn;
	
	public ManageAddressesPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void addNewAddress(String fName, String mobNum, String pCode, String localaddrs, String addrs) {
		newAddress.click();
		name.sendKeys(fName);
		phone.sendKeys(mobNum);
		pincode.sendKeys(pCode);
		locality.sendKeys(localaddrs);
		address.sendKeys(addrs);
//		homeRdBtn.click();
		saveBtn.click();
		
	}
	

}
