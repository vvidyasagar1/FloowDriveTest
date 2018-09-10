package com.app.pages;


import org.openqa.selenium.By;

import com.framework.appium.BaseClass;
import com.framework.appium.CommonMethod;

import io.appium.java_client.android.AndroidKeyCode;

public class LogoutPage extends BaseClass{


	public By about = By.xpath("//android.widget.TextView[@text='About']");
	public By logout = By.xpath("//android.widget.Button[@text='Log out']");
	public By ok = By.xpath("//android.widget.Button[@text='OK']");
	
	
	
	
	
	public void logoutTest() throws Exception {
		driver.findElement(about).click();
		driver.findElement(logout).click();
		driver.findElement(ok).click();
		Thread.sleep(10000);
		
	}

	
	
	
	
	
	
}