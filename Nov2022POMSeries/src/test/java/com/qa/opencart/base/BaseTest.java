package com.qa.opencart.base;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.asserts.SoftAssert;

import com.qa.opencart.factory.DriverFactory;
import com.qa.opencart.pages.AccountsPage;
import com.qa.opencart.pages.LoginPage;
import com.qa.opencart.pages.ProductInfoPage;
import com.qa.opencart.pages.RegisterPage;
import com.qa.opencart.pages.SearchPage;



public class BaseTest { // parent

	// we are declaring at class level because it can access by any methods all over 
	DriverFactory df;
	WebDriver driver;
	protected Properties prop;
	protected LoginPage loginpage; //  create just reference ... protected: only child class of same package should access that 
	protected AccountsPage accountspage;
	protected SearchPage searchpage;
	
	protected ProductInfoPage productinfopage;
	protected RegisterPage registerpage;
	
	protected SoftAssert softAssert;
	
	@BeforeTest
	public void setup() {
		df=new DriverFactory();
		prop=df.initProp();
		driver=df.initDriver(prop);
		loginpage=new LoginPage(driver);// create object once so can re-use for all tests
	 softAssert=new SoftAssert();
	}
	
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}
