package com.framework.tests;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class ChromeBrowserTest {
	
	
	public AndroidDriver<MobileElement> driver;

	
	@BeforeClass
	public void setup() throws MalformedURLException, InterruptedException {
	
		 DesiredCapabilities capabilities = new DesiredCapabilities();
         capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
         capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "192.168.220.101:5555");
         capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.0");
         capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
         capabilities.setCapability("appPackage", "com.android.chrome");
         capabilities.setCapability("appActivity", "com.google.android.apps.chrome.Main");
         driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);       
         driver.get("https://www.thefloow.com/");
         Thread.sleep(5000);
	}
	
	@Test(priority=1)
	public void requestDemo() throws InterruptedException {
		Thread.sleep(5000);
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[contains(@class,'requestDemo')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("inquiry_first_name")).sendKeys("Sachin");
		driver.findElement(By.id("inquiry_last_name")).sendKeys("Tendulkar");
		driver.findElement(By.id("inquiry_email")).sendKeys("sachint@gmail.com");
		driver.findElement(By.id("inquiry_company")).sendKeys("Test Company");
		driver.findElement(By.id("inquiry_job_title")).sendKeys("Test Engineer");
		driver.findElement(By.id("inquiry_country")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[@data-index='1']")).click();
		driver.findElement(By.id("inquiry_message")).sendKeys("test Message");
		driver.findElement(By.className("checkbox__label")).click();
		driver.findElement(By.className("popup__close")).click();
		Thread.sleep(3000);
		

	}
	@Test(priority=2)
	public void contactUs() throws InterruptedException {
		driver.findElement(By.xpath("//span[@class='burger']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@href='/contact']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("inquiry_name")).sendKeys("Test");
		driver.findElement(By.id("inquiry_email")).sendKeys("test@gmail.com");
		driver.findElement(By.id("inquiry_phone")).sendKeys("9874563210");
		driver.findElement(By.id("inquiry_message")).sendKeys("Test message");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@href='/privacy-policy/']")).click();
		
	}
	
	@AfterClass
	public void tearDown() {
		
		driver.quit();
		
	}
	
	
	
	
	
	
	
	
	
	
	

}
