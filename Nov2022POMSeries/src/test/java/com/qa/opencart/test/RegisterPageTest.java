package com.qa.opencart.test;

import java.util.Random;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.opencart.Constants.AppConstants;
import com.qa.opencart.base.BaseTest;
import com.qa.opencart.utils.ExcelUtil;

public class RegisterPageTest extends BaseTest{

	
	@BeforeClass
	public void regPageSetup() {
		registerpage = loginpage.navigateToRegisterPage();
	}
	
	public String getRandomEmail() {
		Random random = new Random();
		//String email = "automation" + random.nextInt(1000) + "@gmail.com";
		
		String email = "automation" + System.currentTimeMillis() + "@gmail.com";
		//automation12121212121@gmail.com
		//automation232323232323@gmail.com
		
		return email;
	}
	
	@DataProvider
	public Object[][] getRegTestData() {
		Object regData[][] = ExcelUtil.getTestData(AppConstants.REGISTER_SHEET_NAME);
		return regData;
	}
	
	@Test(dataProvider="getRegTestData")
	public void userRegTest(String firstName, String lastName, String telephone, String password, String subscribe) {

		Assert.assertTrue(
				registerpage.registerUser(firstName, lastName, getRandomEmail(), telephone, password, subscribe));

	}
}

