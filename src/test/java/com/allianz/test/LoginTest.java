package com.allianz.test;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.allianz.base.AutomationWrapper;

public class LoginTest extends AutomationWrapper {
	@Test
	public void validLoginTest()
	{
		driver.findElement(By.name("username")).sendKeys("Admin");
		//enter password admin123
		//click on login
		//Assert the header - Dashboard
	}

	@Test
	public void invalidLoginTest()
	{
		driver.findElement(By.name("username")).sendKeys("Admin");
		//enter password bala123
		//click on login
		//Assert the error - Invalid credentials
	}
}
