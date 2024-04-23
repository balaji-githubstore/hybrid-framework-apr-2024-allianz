package com.allianz.test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.allianz.base.AutomationWrapper;
import com.allianz.pages.LoginPage;
import com.allianz.utils.DataUtils;

public class LoginTest extends AutomationWrapper {
	@Test(dataProvider = "commonDataProvider",dataProviderClass = DataUtils.class)
	public void validLoginTest(String username,String password,String expectedHeader) {
		
		LoginPage.enterUsername(driver, username);
		LoginPage.enterPassword(driver, password);
		LoginPage.clickOnLogin(driver);

		String actualHeader = driver.findElement(By.xpath("//h6[contains(normalize-space(),'Dash')]")).getText();
		Assert.assertEquals(actualHeader,expectedHeader);
	}

	@Test(dataProvider = "commonDataProvider",dataProviderClass = DataUtils.class)
	public void invalidLoginTest(String username, String password, String expectedError) {
		LoginPage.enterUsername(driver, username);
		LoginPage.enterPassword(driver, password);
		LoginPage.clickOnLogin(driver);

		String actualError = driver.findElement(By.xpath("//p[contains(normalize-space(),'Invalid')]")).getText();
		Assert.assertEquals(actualError, expectedError);
	}
}
