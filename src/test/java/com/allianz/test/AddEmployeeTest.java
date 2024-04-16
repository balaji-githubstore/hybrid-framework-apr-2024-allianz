package com.allianz.test;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.allianz.base.AutomationWrapper;

public class AddEmployeeTest extends AutomationWrapper {
	
	@Test
	public void uploadInvalidDisplayPictureTest()
	{
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		
		//click on PIM menu
		//click on add employee
		//upload the pdf file instead of image
		//Assert the error - File type not allowed
	}

}
