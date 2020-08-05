package com.flipkart.qa.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.flipkart.qa.base.TestBase;
import com.flipkart.qa.pages.HomePage;
import com.flipkart.qa.pages.LoginPage;
import com.flipkart.qa.pages.MyProfilePage;

public class MyProfilePageTest extends TestBase {
	
	LoginPage loginPage;
	HomePage homePage;
	MyProfilePage myProfilePage;
	
	public MyProfilePageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("email"), prop.getProperty("password"));
		myProfilePage = homePage.clickOnMyProfile();
	}

	@Test(priority=1)
	public void validateManageAddressesLinkTest() {
		Assert.assertTrue(myProfilePage.validateManageAddressesLink());
	}

	@Test(priority=2)
	public void clickOnManageAddressesLinkTest() {
		myProfilePage.clickOnManageAddressesLink();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}


	

}
