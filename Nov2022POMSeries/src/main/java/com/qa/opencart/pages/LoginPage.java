package com.qa.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.opencart.Constants.AppConstants;
import com.qa.opencart.utils.ElementUtil;

import io.qameta.allure.Step;

public class LoginPage {
	
	private WebDriver driver; // its pointing to null
	private ElementUtil eleUtil;
	
	//1. private by locators ...: no one can change it and cannot be used by other pages
	// dont want to give access to any layer
	private By emailId = By.id("input-email");
	private By password = By.id("input-password");
	private By loginBtn = By.xpath("//input[@value='Login']");
	private By forgotPwdLink = By.linkText("Forgotten Password");
	private By registerLink = By.linkText("Register");

	
	
	// to initailise the driver to this page we are using const.. 
	//so whenever we create obj of this class , constructor will be called
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		eleUtil = new ElementUtil(driver);

		
	}
	
	//2. page methods/actions - behaviour - should be public 
	@Step("getting login title title ...")
	public String getLoginPageTitle() {
		//String loginTitle=driver.getTitle();
		String title = eleUtil.waitForTitleIsAndFetch(AppConstants.DEFAULT_SHORT_TIME_OUT, AppConstants.LOGIN_PAGE_TITLE_VALUE);

		System.out.println("the title is "+title);
		return title;
	}
	
	public String getLoginPageUrl() {
		//String url=driver.getCurrentUrl();
		String url = eleUtil.waitForURLIsAndFetch(AppConstants.DEFAULT_MEDIUM_TIME_OUT, AppConstants.LOGIN_PAGE_URL_FRACTION_VALUE );

		System.out.println("the title is "+url);
		return url;
	}
	
	public boolean isForgotPwdLinkExist() {
		//boolean pwdlink=driver.findElement(forgotPwdLink).isDisplayed();
	    //return pwdlink;
		
		return eleUtil.waitForElementVisible(forgotPwdLink, AppConstants.DEFAULT_SHORT_TIME_OUT).isDisplayed();

	}
	
	public AccountsPage doLogin(String un, String pwd) {
//		driver.findElement(emailId).sendKeys(un);
//		driver.findElement(password).sendKeys(pwd);
//		driver.findElement(loginBtn).click();
		
		eleUtil.waitForElementVisible(emailId, AppConstants.DEFAULT_MEDIUM_TIME_OUT).sendKeys(un);
		eleUtil.doSendKeys(password, pwd);
		eleUtil.doClick(loginBtn);
		return new AccountsPage(driver); // next landing page

	}
	
	public RegisterPage navigateToRegisterPage() {
		eleUtil.doClick(registerLink);
		return new RegisterPage(driver);
	}
}
