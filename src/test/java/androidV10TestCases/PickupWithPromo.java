package androidV10TestCases;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import androidV10Screens.BasketV10;
import androidV10Screens.CheckoutV10;
import androidV10Screens.LoginScreenV10;
import androidV10Screens.MenuV10;
import androidV10Screens.OrderingMethodV10;
import androidV10Screens.SearchBrandV10;
import androidV10Screens.SelectBranchV10;
import cashier.OrderScreen;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class PickupWithPromo {
	AndroidDriver<AndroidElement> driver;

	@BeforeTest
	public void OpenApp() throws MalformedURLException {
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("avdArgs", "-no-window");
		caps.setCapability("isHeadless", true);
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Koinz");
		// caps.setCapability(MobileCapabilityType.APP,"C:\\Users\\user\\eclipse-workspace\\Admin\\app-debug.apk");
		caps.setCapability(MobileCapabilityType.APP, System.getProperty("user.dir") + "\\koinz_dev.apk");
		driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"), caps);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		LoginScreenV10 loginscreen = new LoginScreenV10(driver);
		loginscreen.CountrySelect();
		loginscreen.Login();
	}
	@Test
	public void CreateOrder() {

		SearchBrandV10 searchbrand = new SearchBrandV10(driver);
		searchbrand.SelectBrand();
		OrderingMethodV10 orderingMethod = new OrderingMethodV10(driver);
		orderingMethod.SelectPickupMethod();
		SelectBranchV10 selectBranch = new SelectBranchV10(driver);
		selectBranch.SelectBranch();
		MenuV10 menu = new MenuV10(driver);
		menu.SearchMenuItem();
		menu.AddMenuItem();
		menu.ViewBasket();
		BasketV10 basket = new BasketV10(driver);
		basket.ViewOrder();
		CheckoutV10 checkout = new CheckoutV10(driver);
		checkout.AddPromo();
		checkout.Order();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		AndroidElement OrderIDFull = driver.findElement(By.id("tech.gplanet.shopx:id/order_id_tv"));
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		System.out.println(OrderIDFull.getText());
		String OrderID = OrderIDFull.getText();
		OrderScreen.OrderCode = OrderID;
}
}