package com.app.pages;


import org.openqa.selenium.By;

import com.framework.appium.BaseClass;
import com.framework.appium.CommonMethod;

import io.appium.java_client.android.AndroidKeyCode;

public class ChangPasswordPage extends BaseClass{


	public By chnage_password = By.xpath("//android.widget.TextView[@text='Change Password']");
	public By current_password = By.xpath("//android.widget.EditText[@text='Current password']");
	public By newPassword = By.xpath("//android.widget.EditText[@text='New password']");
	public By repeat_newPassword = By.xpath("//android.widget.EditText[@text='Repeat new password']");
	public By change = By.xpath("//android.widget.EditText[@text='Change it']");
	
	
	public void changePassword() throws Exception {
		/**
		 * Getting data from Excel
		 */
		String currentPass = ereader.getCellData("ChangePassword", 1, 0);
		String newPass = ereader.getCellData("ChangePassword", 1, 1);
		String confirm_newPass = ereader.getCellData("ChangePassword", 1, 2);
	
		driver.findElement(chnage_password).click();
		driver.findElement(current_password).setValue(currentPass);
		driver.findElement(newPassword).setValue(newPass);
		driver.findElement(repeat_newPassword).setValue(confirm_newPass);
		//driver.findElement(change).click();
		Thread.sleep(10000);
		
	}

	
	
	
	
	
	
}