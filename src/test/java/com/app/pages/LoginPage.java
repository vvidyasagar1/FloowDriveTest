package com.app.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;

import com.framework.appium.BaseClass;
import com.framework.appium.CommonMethod;

import io.appium.java_client.android.AndroidKeyCode;

public class LoginPage extends BaseClass{


	public By email_addr = By.xpath("//android.widget.EditText[@text='Email']");
	public By password = By.xpath("//android.widget.EditText[@text='Password']");
	public By login = By.xpath("//android.widget.Button[@text='Login']");
	public By already_register = By.xpath("//android.widget.Button[@text='Already registered']");
	public By grant_permission = By.xpath("//android.widget.Button[@text='Grant permission']");
	public By allow = By.xpath("//android.widget.Button[@text='ALLOW']");
	public By get_started = By.xpath("(//android.widget.Button[@text='Get started'])[2]");
	public By settings = By.xpath("//android.widget.Button[@text='Settings']");
	public By more = By.xpath("//android.widget.ImageView[@resource-id='android:id/icon']");
	
	
	public void userLoginDetails() throws Exception {
		/**
		 * Getting data from Excel
		 */
		String username = ereader.getCellData("Login", 1, 0);
		String pass = ereader.getCellData("Login", 1, 1);
		
		driver.findElement(email_addr).setValue(username);
		driver.findElement(password).setValue(pass);
		
	}

	public void clickOnLoginButton() throws InterruptedException, IOException {
		driver.findElement(login).click();
		Thread.sleep(5000);
		
	}
	
	public void clickOnAlreadyRegistered() {
		CommonMethod.scroolToText(driver, "Already registered");
		driver.findElement(already_register).click();
	}
	
	public void clickOnGrantPermission() {
		
		driver.findElement(grant_permission).click();
		
	}
	
	public void verifyLoginAssertion() {
		
		Assert.assertTrue(driver.findElement(grant_permission).isDisplayed());
	}
	
	public void clickOnAllowButton() throws InterruptedException {
		
		driver.findElement(allow).click();
		Thread.sleep(6000);
	}
	
	
	public void clickOnGetStaredButton() throws InterruptedException {
		
		driver.findElement(get_started).click();
		Thread.sleep(3000);
	}
	
	public void clickOnSettingsButton() throws InterruptedException {
		
		driver.findElement(settings).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.findElement(more).click();
		Thread.sleep(1000);
	}
	
	
}