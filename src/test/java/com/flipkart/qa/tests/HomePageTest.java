package com.flipkart.qa.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.flipkart.qa.base.TestBase;
import com.flipkart.qa.pages.HomePage;
import com.flipkart.qa.pages.LoginPage;
import com.flipkart.qa.pages.TelevisionsPage;

public class HomePageTest extends TestBase {

	LoginPage loginPage;
	HomePage homePage;
	TelevisionsPage televisionsPage;

	public HomePageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		televisionsPage = new TelevisionsPage();
		homePage = loginPage.login(prop.getProperty("email"), prop.getProperty("password"));
	}

	@Test(priority=1)
	public void validateMyAccountLinkTest() {
		Assert.assertTrue(homePage.validateMyAccountLink());
	}

	@Test(priority=2)
	public void validateTelevisionLinkTest() {
		televisionsPage = homePage.clickOnTelevisionsLink();
	}





	@AfterMethod
	public void tearDown() {
		driver.quit();
	}


}
