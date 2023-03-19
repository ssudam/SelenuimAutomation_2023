package com.qa.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.opencart.Constants.AppConstants;
import com.qa.opencart.utils.ElementUtil;

public class SearchPage {
	
	private WebDriver driver;
	private ElementUtil eleUtil;
	
	private By searchProductResults = By.cssSelector("div#content div.product-layout");

	

	public SearchPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
		eleUtil = new ElementUtil(driver);

	}
	
	public int getSearchProductsCount() {
		int productCount = eleUtil.waitForElementsVisible(searchProductResults, AppConstants.DEFAULT_MEDIUM_TIME_OUT).size();
		System.out.println("Product Count:::" + productCount);
		return productCount;
	}
	
	
	public ProductInfoPage selectProduct(String productName) {
		By productlocator=By.linkText(productName); // dynamic // issue 
		eleUtil.waitForElementVisible(productlocator,AppConstants.DEFAULT_MEDIUM_TIME_OUT).click();;
		return new ProductInfoPage(driver);
	}

}
