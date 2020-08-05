package com.flipkart.qa.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.flipkart.qa.base.TestBase;
import com.flipkart.qa.pages.HomePage;
import com.flipkart.qa.pages.LoginPage;
import com.flipkart.qa.pages.ManageAddressesPage;
import com.flipkart.qa.pages.MyProfilePage;
import com.flipkart.qa.util.TestUtil;

public class ManageAddressesPageTest extends TestBase {
	
	
	LoginPage loginPage;
	HomePage homePage;
	MyProfilePage myProfilePage;
	ManageAddressesPage manageAdrressesPage;
	
	String sheetName = "addresses";
	
	public ManageAddressesPageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("email"), prop.getProperty("password"));
		myProfilePage = homePage.clickOnMyProfile();
		manageAdrressesPage = myProfilePage.clickOnManageAddressesLink();
	}

	@DataProvider
	public Object[][] getFlipkartTestData() {
		Object data[][] = TestUtil.getTestData(sheetName);
		return data;
	}
	
	
	@Test(dataProvider="getFlipkartTestData")
	public void validateaddNewAddressTest(String fName, String mobNum, String pCode, String localaddrs, String addrs) {
		manageAdrressesPage.addNewAddress(fName, mobNum, pCode, localaddrs, addrs);
	} 
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
