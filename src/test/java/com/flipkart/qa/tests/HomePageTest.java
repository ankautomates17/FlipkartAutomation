package com.flipkart.qa.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.flipkart.qa.base.TestBase;
import com.flipkart.qa.pages.HomePage;
import com.flipkart.qa.pages.LoginPage;
import com.flipkart.qa.pages.MobilesPage;

public class HomePageTest extends TestBase {

	LoginPage loginPage;
	HomePage homePage;
//	MobilesPage mobilesPage;

	public HomePageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
//		mobilesPage = new MobilesPage();
		homePage = loginPage.login(prop.getProperty("email"), prop.getProperty("password"));
	}

	@Test(priority=1)
	public void validateMyAccountLinkTest() {
		Assert.assertTrue(homePage.validateMyAccountLink());
	}
	
	@Test(priority=2)
	public void validateElectronicsSectionTest() {
		Assert.assertTrue(homePage.validateElectronicsSection());
	}

	@Test(priority=3)
	public void searchAnItemTest() {
		homePage.searchAnItem();
	}
	
	/*	@Test(priority=4)
	public void mouseHoverOnMobilesLinkTest() {
		mobilesPage = homePage.mouseHoverOnMobilesLink();
	}
*/
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}


}
