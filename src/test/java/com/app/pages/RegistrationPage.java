package com.app.pages;


import org.openqa.selenium.By;

import com.framework.appium.BaseClass;
import com.framework.appium.CommonMethod;

public class RegistrationPage extends BaseClass {
	
	//Object locators for  User registration
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
	
	
/**
 * Reusable Method for User registration
 * @throws InterruptedException
 */
	public void userRegistration() throws InterruptedException {
		
		/**
		 * Getting data from Excel
		 */
		String email = ereader.getCellData("UserRegistration", 1, 0);
		String pass = ereader.getCellData("UserRegistration", 1, 1);
		String confirmPassword = ereader.getCellData("UserRegistration", 1, 2);
		String fname = ereader.getCellData("UserRegistration", 1, 3);
		String sname = ereader.getCellData("UserRegistration", 1, 4);
		String postaCode = ereader.getCellData("UserRegistration", 1, 5);
		
		Thread.sleep(3000);
		driver.findElement(email_addr).setValue(email);
		driver.findElement(password).setValue(pass);
		driver.findElement(confirm_password).setValue(confirmPassword);
		driver.findElement(first_name).setValue(fname);
		driver.findElement(surname).setValue(sname);
		driver.findElement(dob).click();
		driver.findElement(dob_ok).click();
		driver.findElement(postalCode).setValue(postaCode);
		CommonMethod.scroolToText(driver, "Register");
		
	}
	
	/**
	 * Clicking on Check box
	 */
	public void clickOnCheckBox() {
		
		driver.findElement(checkBox).click();

	}
	
	
	/**
	 * Clicking on Register Button
	 * @throws InterruptedException
	 */
	public void clickOnRegisterButton() throws InterruptedException {
		
		driver.findElement(register_button).click();
		Thread.sleep(10000);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
