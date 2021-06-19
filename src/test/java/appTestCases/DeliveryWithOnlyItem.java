package appTestCases;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import appScreens.Basket;
import appScreens.Checkout;
import appScreens.LoginScreen;
import appScreens.Menu;
import appScreens.OrderingMethod;
import appScreens.SearchBrands;
import appScreens.SelectZones;
import cashier.OrderScreen;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class DeliveryWithOnlyItem {
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
	public void CreateOrder() {
		

		SearchBrands searchbrand = new SearchBrands(driver);
		searchbrand.SelectBrand();
		OrderingMethod orderingMethod = new OrderingMethod(driver);
		orderingMethod.SelectDeliveryMethod();
		SelectZones selectZone = new SelectZones(driver);
		selectZone.SelectZone();
		Menu menu = new Menu(driver);
		menu.AddMenuItem();
		menu.ViewBasket();

		Basket basket = new Basket(driver);
		basket.ViewOrder();
		Checkout checkout = new Checkout(driver);
		checkout.Order();
		AndroidElement OrderIDFull = driver.findElement(By.id("tech.gplanet.shopx:id/tv_order_code"));
		System.out.println(OrderIDFull.getText());
		String OrderID = OrderIDFull.getText();

		OrderScreen.y = OrderID;
	}
}
