package com.qa.opencart.test;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.opencart.base.BaseTest;

public class AccountsPageTest extends BaseTest{
	
	@BeforeClass
	public void accPageSetup() {
		//accountspage=loginpage.doLogin("qatestertest@gmail.com","Test@123");
		accountspage = loginpage.doLogin(prop.getProperty("username").trim(), prop.getProperty("password").trim());

	}
	
	@Test(priority=1)
	public void accountsPageTitleTest() {
		String actTitle=accountspage.getAcctsPageTitle();
		Assert.assertEquals(actTitle, "My Account");
	}
	
	@Test(priority=2)
	public void accPageURLTest() {
		String actURL = accountspage.getAccPageURL();
		Assert.assertTrue(actURL.contains("route=account/account"));
	}
	
	@Test(priority=3)
	public void isLogoutLinkExistTest() {
		Assert.assertTrue(accountspage.isLogoutLinkExist());
	}
	@Test(priority=4)
	public void accPageHeadersValueTest() {
		List<String> actualAccPageHeadersList = accountspage.getAcctPageHeadersList();
		System.out.println("Actual Acc Page Headers List: " + actualAccPageHeadersList);
		//System.out.println("Expected Acc Page Headers List:" + AppConstants.EXPECTED_ACCOUNTS_PAGE_HEADERS_LIST);
		Assert.assertEquals(actualAccPageHeadersList.size(),4);
	}
	
	@DataProvider
	public Object[][] getProductData() {
		return new Object[][] {
			{"Macbook"},
			{"iMac"},
			{"Apple"},
			{"Samsung"},
			{"Naveen"}
		};
	}
	

	@Test(priority=4,dataProvider="getProductData")
	public void searchProductCountTest(String searchkey) {
		searchpage=accountspage.performSearch(searchkey); // returns search p[age
	
		Assert.assertTrue(searchpage.getSearchProductsCount()>0);
	
	}
	
	@DataProvider
	public Object[][] getProductTestData() {
		return new Object[][] {
			{"Macbook", "MacBook Pro"},
			{"Macbook", "MacBook Air"},
			{"iMac", "iMac"},
			{"Apple", "Apple Cinema 30\""},
			{"Samsung", "Samsung SyncMaster 941BW"},
			{"Samsung", "Samsung Galaxy Tab 10.1"},
		};
	}
	
	@Test(priority=5,dataProvider="getProductTestData")
	public void searchProductTest(String searchKey, String productName) {
		searchpage = accountspage.performSearch(searchKey);
		
		if(searchpage.getSearchProductsCount()>0) {
			productinfopage=searchpage.selectProduct(productName);
			String actProductHeader = productinfopage.getProductHeaderValue();
			Assert.assertEquals(actProductHeader,productName);
		
		}
	}
}
