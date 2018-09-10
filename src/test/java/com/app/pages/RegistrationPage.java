package com.app.pages;


import org.openqa.selenium.By;

import com.framework.appium.BaseClass;
import com.framework.appium.CommonMethod;

public class RegistrationPage extends BaseClass {
	
	public By email_addr = By.xpath("//android.widget.EditText[@text='Email address']");
	public By password = By.xpath("//android.widget.EditText[@text='Password']");
	public By confirm_password = By.xpath("//android.widget.EditText[@text='Repeat password']");
	public By first_name = By.xpath("//android.widget.EditText[@text='First name']");
	public By surname = By.xpath("//android.widget.EditText[@text='Surname']");
	public By  dob = By.xpath("//android.widget.EditText[@text='Date of birth']");
	public By dob_ok = By.xpath("//android.widget.Button[@text='OK']");
	public By postalCode =By.xpath("//android.widget.EditText[@text='Zip code']");	
	public By checkBox = By.xpath("//android.widget.CheckBox[@index='0']");
	public By register_button = By.xpath("//android.widget.Button[@text='Register']");
	
	

	public void userRegistration() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(email_addr).setValue("test123@gmail.com");
		driver.findElement(password).setValue("Test@1234");
		driver.findElement(confirm_password).setValue("Test@1234");
		driver.findElement(first_name).setValue("test");
		driver.findElement(surname).setValue("test");
		driver.findElement(dob).click();
		driver.findElement(dob_ok).click();
		driver.findElement(postalCode).setValue("7896541");
		CommonMethod.scroolToText(driver, "Register");
		
	}
	
	public void clickOnCheckBox() {
		
		driver.findElement(checkBox).click();

	}
	
	
	public void clickOnRegisterButton() throws InterruptedException {
		
		driver.findElement(register_button).click();
		Thread.sleep(10000);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
