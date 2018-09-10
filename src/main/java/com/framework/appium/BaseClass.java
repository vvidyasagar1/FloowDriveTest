package com.framework.appium;

import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

    public class BaseClass extends GenerateLogs
    {
    	
    	public static AndroidDriver<MobileElement> driver;
    	
	 @BeforeClass
     @Parameters({"device"})
     public void Setup(String device) throws Exception {  
		 generateLogs();
		 log.info("Configuration setup.....");
		 AppiumManager.startServer();
    	 DesiredCapabilities capabilities = new DesiredCapabilities();
         capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
         capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, device);
         capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.0");
         capabilities.setCapability("appPackage", "com.thefloow.thefloowltd.floowdrive.app");
         capabilities.setCapability("appActivity", "com.thefloow.turnkey.ui.launcher.LauncherActivity");
         driver = new AndroidDriver<>(new URL("http://127.0.0.1:4729/wd/hub"), capabilities);       
         driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
         log.info("Application opended Successfully.....");
 
     }
     
	 	@AfterClass()
		public void tearDown() throws Exception {
			driver.quit();
			AppiumManager.stopServer();
		}

	 	
      
   
     
     
     
     
     
    }