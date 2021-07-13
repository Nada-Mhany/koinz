package appTestCases;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import appScreens.LoginScreen;
import appScreens.Menu;
import appScreens.SearchBrands;
import cashier.OrderScreen;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import webTestCases.RedeemGift;

public class GetGiftCode {
	public static String test;
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
		public void NavigateToGifts() {

			SearchBrands searchbrand = new SearchBrands(driver);
			searchbrand.SelectBrand();
			Menu menu = new Menu(driver);
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			menu.GiftClick();
			menu.GetGiftCode();
			System.out.print(menu.GetGiftCode());
			//OrderScreen.CodeOfGift = test;
			RedeemGift.CodeOfGift = menu.GetGiftCode();
	}}

