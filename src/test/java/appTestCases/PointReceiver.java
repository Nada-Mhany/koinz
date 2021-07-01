package appTestCases;

import static org.testng.Assert.assertEquals;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import appScreens.LoginScreen;
import appScreens.PointsHistory;
import cashier.LoyaltyScreen;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class PointReceiver {
	AndroidDriver<AndroidElement> driver;

	@BeforeTest
	public void OpenApp() throws MalformedURLException {
		DesiredCapabilities caps = new DesiredCapabilities();

		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Koinz");
		// caps.setCapability(MobileCapabilityType.APP,"C:\\Users\\user\\eclipse-workspace\\Admin\\app-debug.apk");
		caps.setCapability(MobileCapabilityType.APP, System.getProperty("user.dir") + "\\app-debug.apk");

		driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"), caps);
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		LoginScreen loginscreen = new LoginScreen(driver);
		loginscreen.CountrySelect();
		loginscreen.Login();

	}
	@Test
	public void CheckReceivedPoints () {
		LoginScreen loginscreen = new LoginScreen(driver);
		loginscreen.NavigateSideMenu();
		loginscreen.NavigatePointHistory();
		PointsHistory pointhistory = new PointsHistory(driver);
		String PointsText = pointhistory.GetPointsText();
		LoyaltyScreen loyaltyScreen = new LoyaltyScreen(driver);
		String PointsAdded = String.valueOf(loyaltyScreen.PointsAdded);
		System.out.println(PointsAdded);
		System.out.println(PointsText);
		assertEquals(PointsText.contains(PointsAdded), true);	
}
}
