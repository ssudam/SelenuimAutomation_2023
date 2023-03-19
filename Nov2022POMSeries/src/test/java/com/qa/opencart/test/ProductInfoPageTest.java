package com.qa.opencart.test;

import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.opencart.base.BaseTest;

public class ProductInfoPageTest extends BaseTest{

	
	@BeforeClass
	public void productInfoPageSetup() {
		accountspage=loginpage.doLogin(prop.getProperty("username").trim(),prop.getProperty("password").trim());

	}
	
	@DataProvider
	public Object[][] getProductImagesTestData() {
		return new Object[][] {
			{"Macbook", "MacBook Pro", 4},
			{"iMac", "iMac", 3},
			{"Apple", "Apple Cinema 30\"", 6},
			{"Samsung", "Samsung SyncMaster 941BW", 1},
		};
	}
	
	@DataProvider
	public Object[][] getCartTestData() {
		return new Object[][] {
			{"Macbook", "MacBook Pro", 1},
			{"iMac", "iMac", 2},
		};
	}
	
	@Test(dataProvider="getProductImagesTestData")
	public void productImagesCountTest(String searchKey,String productName, int imagesCount) {
		searchpage=accountspage.performSearch(searchKey);
		productinfopage=searchpage.selectProduct(productName);
		int actImagescount=productinfopage.getProductImagesCount();
		Assert.assertEquals(actImagescount, imagesCount);
	}
	
	@Test
	public void getProductInfoTest() {
		searchpage=accountspage.performSearch("Macbook"); 
		productinfopage=searchpage.selectProduct("MacBook Pro");
		Map<String,String> actprodinfolistMap=productinfopage.getProductInfo();
		System.out.println(actprodinfolistMap);
		softAssert.assertEquals(actprodinfolistMap.get("Brand"), "Apple");
		softAssert.assertEquals(actprodinfolistMap.get("Brand"), "Apple");
        softAssert.assertAll();

	}
	
	@Test(dataProvider="getCartTestData")
	public void addProductToCart(String searchKey, String productName,int qty ) {
		searchpage = accountspage.performSearch(searchKey);
		productinfopage = searchpage.selectProduct(productName);
		productinfopage.enterQuantity(qty);
		String actCartMesg = productinfopage.clickonAddToCart();
		//Success: You have added MacBook Pro to your shopping cart!

		softAssert.assertTrue(actCartMesg.indexOf("Success")>=0);
		softAssert.assertTrue(actCartMesg.indexOf(productName)>=0);
		softAssert.assertEquals(actCartMesg, "Success: You have added "+productName+" to your shopping cart!");
	}
	
	
}
