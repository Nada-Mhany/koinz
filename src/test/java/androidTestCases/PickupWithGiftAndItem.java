package androidTestCases;

import static org.testng.Assert.assertEquals;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import androidScreens.Basket;
import androidScreens.Checkout;
import androidScreens.LoginScreen;
import androidScreens.Menu;
import androidScreens.OrderingMethod;
import androidScreens.SearchBrands;
import androidScreens.SelectBranchs;
import androidScreens.SelectZones;
import cashier.OrderScreen;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class PickupWithGiftAndItem {
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
		orderingMethod.SelectPickupMethod();
		SelectBranchs selectBranch = new SelectBranchs(driver);
		selectBranch.SelectBranch();
		Menu menu = new Menu(driver);
		menu.AddMenuItem();
		menu.AddGift();
		menu.ViewBasket();
		Basket basket = new Basket(driver);
		basket.ViewOrder();
		Checkout checkout = new Checkout(driver);
		checkout.Order();
		AndroidElement OrderIDFull = driver.findElement(By.id("tech.gplanet.shopx:id/tv_order_code"));
		assertEquals(driver.findElement(By.id("tech.gplanet.shopx:id/tv_order_code")).getText().contains("Order ID"),
				true);
		System.out.println(OrderIDFull.getText());
		String OrderID = OrderIDFull.getText().substring(9);
//	  	System.out.println(OrderID);	
		// String OrderID = "1000";
		OrderScreen.y = OrderID;
	}
}
