package com.flipkart.qa.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.flipkart.qa.base.TestBase;

public class HomePage extends TestBase {

	@FindBy(xpath = "//div[contains(text(),'My Account')]")
	WebElement myAccountLink;

	@FindBy(name = "q")
	WebElement searchField;

	@FindBy(xpath = "//span[contains(text(),'Electronics')]")
	WebElement electronicsSection;

	@FindBy(xpath = "//a[@title='Mobiles']")
	WebElement mobilesLink;
	
	@FindBy(xpath = "//div[contains(text(),'Apple iPhone 7 (Black, 32 GB)')]")
	WebElement iPhone7;
	
	@FindBy(xpath = "//span[contains(text(),'Cart')]")
	WebElement cartLink;

	//Initializing the Page Objects
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean validateMyAccountLink() {
		return myAccountLink.isDisplayed();
	}
	
	public boolean validateElectronicsSection(){
		return electronicsSection.isDisplayed();
	}
	
	public boolean searchAnItem() {
		searchField.sendKeys("IPhone 7" + Keys.RETURN);
		new WebDriverWait(driver,10).until(ExpectedConditions.elementToBeClickable(iPhone7));
		return iPhone7.isDisplayed();
		
	}
	
	//mouse hover to link 		
	/*public MobilesPage mouseHoverOnMobilesLink() {
		Actions a1 = new Actions(driver);
		a1.moveToElement(electronicsSection).clickAndHold().build().perform();
		new WebDriverWait(driver,10).until(ExpectedConditions.elementToBeClickable(mobilesLink));
		a1.click(mobilesLink).perform();
		mobilesLink.click();
		return new MobilesPage();
	}*/
}
