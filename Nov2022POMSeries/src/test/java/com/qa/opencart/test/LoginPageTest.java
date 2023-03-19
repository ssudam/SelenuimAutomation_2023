package com.qa.opencart.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.opencart.base.BaseTest;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
@Epic("EPIC - 100: design login for open cart app")
@Story("US-Login: 101: design login page features for open cart")
public class LoginPageTest extends BaseTest{
	
	@Severity(SeverityLevel.TRIVIAL)
	@Description("....checking the title of the page.... tester: Naveen")
	@Test(priority=1)
	public void loginPageTitleTest() {
		String acttitle=loginpage.getLoginPageTitle();
		Assert.assertEquals(acttitle,"Account Login" );

	}
	
	@Severity(SeverityLevel.NORMAL)
	@Description("....checking the url of the page.... tester: Naveen")
	@Test(priority=2)
	public void loginPageUrlTest() {
		String actUrl=loginpage.getLoginPageUrl();
		Assert.assertTrue(actUrl.contains("route=account/login"));
	}

	@Severity(SeverityLevel.CRITICAL)
	@Description("....checking forgot pwd link exist.... tester: Naveen")
	@Test(priority=3)
	public void forgotPwdLinkExistsTest() {
	Assert.assertTrue(loginpage.isForgotPwdLinkExist());
	}
	
	@Severity(SeverityLevel.BLOCKER)
	@Description("....checking user is able to login to app with correct username and password....")
	@Test(priority=4)
	public void doLoginTest() {
		// no assert becasue do login is not returning any 
		accountspage=loginpage.doLogin(prop.getProperty("username").trim(),prop.getProperty("password").trim());
	}
	
}
