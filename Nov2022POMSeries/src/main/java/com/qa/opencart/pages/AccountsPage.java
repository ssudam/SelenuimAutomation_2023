package com.qa.opencart.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.qa.opencart.Constants.AppConstants;
import com.qa.opencart.utils.ElementUtil;

public class AccountsPage {

	private WebDriver driver;
	private ElementUtil eleUtil;

	
	private By logoutLink=By.linkText("Logout");
	private By accsHeaders = By.cssSelector("div#content h2");
	//private By search = By.name("search");
	private By search=By.xpath("(//input[@name='search'])[1]");
	private By searchIcon = By.cssSelector("#search button");

	
	public AccountsPage(WebDriver driver) {
		this.driver=driver;
		eleUtil = new ElementUtil(driver);

	}
	
	public String getAcctsPageTitle() {
	//String title=driver.getTitle();
		String title = eleUtil.waitForTitleIsAndFetch(AppConstants.DEFAULT_SHORT_TIME_OUT, AppConstants.ACCOUNTS_PAGE_TITLE_VALUE);
        System.out.println("title of accts page is"+title);
	    return title;
	}
	
	public String getAccPageURL() {
		//String url=driver.getCurrentUrl();
		String url = eleUtil.waitForURLContainsAndFetch(AppConstants.DEFAULT_SHORT_TIME_OUT, AppConstants.ACCOUNTS_PAGE_URL_FRACTION_VALUE);

		System.out.println("title of accts page is"+url);
        return url;
	}
	
	public boolean isLogoutLinkExist() {
		//return driver.findElement(logoutLink).isDisplayed();
		return eleUtil.waitForElementVisible(logoutLink, AppConstants.DEFAULT_MEDIUM_TIME_OUT).isDisplayed();

	}

	public boolean isSearchExist() {
		//return driver.findElement(search).isDisplayed();
		return eleUtil.waitForElementVisible(search, AppConstants.DEFAULT_MEDIUM_TIME_OUT).isDisplayed();


	}
	public List<String> getAcctPageHeadersList() {
		//List<WebElement> acctheaders=driver.findElements(accsHeaders);
		List<WebElement> accHeadersList = eleUtil.waitForElementsVisible(accsHeaders, AppConstants.DEFAULT_MEDIUM_TIME_OUT);		

		List<String> accHeadersValuelist=new ArrayList<String>();
		for(WebElement e: accHeadersList) {
			String text=e.getText();
			accHeadersValuelist.add(text);
			
		}
		return accHeadersValuelist;
	}
	
	public SearchPage performSearch(String searchkey) {
		if(isSearchExist()) {
			eleUtil.doSendKeys(search,searchkey); // check this
			eleUtil.doClick(searchIcon);
			return new SearchPage(driver);
		}
		else {
			System.out.println("search not found");
			return null;
		}
	}
}
