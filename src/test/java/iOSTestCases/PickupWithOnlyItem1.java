package iOSTestCases;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.IOSMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class PickupWithOnlyItem1 {
	IOSDriver<IOSElement> driver;

	@Test
    public void OpenApp() throws MalformedURLException
    { 
	
    	DesiredCapabilities caps = new DesiredCapabilities();

    	caps.setCapability(MobileCapabilityType.AUTOMATION_NAME,AutomationName.IOS_XCUI_TEST);
    	caps.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 11");
    	caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "ios");
    	caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "14.4");
    	caps.setCapability(IOSMobileCapabilityType.BUNDLE_ID, "tech.gplanet.shopx");
    	
    	
    	IOSDriver driver = new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
    	
    	
    	driver.findElementByXPath("//XCUIElementTypeApplication[@name=\"Koinz\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTextField\n"
    			+ "").click();
    	LoginScreen2 loginscreen = new LoginScreen2(driver);
    	
    	loginscreen.CountrySelect();

    }
	

} 