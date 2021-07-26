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

public class PickupWithOnlyItem {
	AndroidDriver<AndroidElement> driver;

	@BeforeTest
	public void OpenApp() throws MalformedURLException {
		DesiredCapabilities caps = new DesiredCapabilities();

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
		checkout.Order();
		AndroidElement OrderIDFull = driver.findElement(By.id("tech.gplanet.shopx:id/tv_order_code"));
//		assertEquals(driver.findElement(By.id("tech.gplanet.shopx:id/tv_order_code")).getText().contains("Order ID"),
//				true);
		System.out.println(OrderIDFull.getText());
		String OrderID = OrderIDFull.getText();
		OrderScreen.OrderCode = OrderID;

		// System.out.println(OrderID);
		// String OrderID = "1000";
//		OrderScreen.OrderCode = OrderID;
//		String OrderSummary = "Order summary";
//		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+OrderSummary+"\").instance(0))").click();
//		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Total\").instance(0))").click();
//
//		AndroidElement OrderPoints = driver.findElement(By.id("tech.gplanet.shopx:id/tv_added_points"));
//		System.out.println(OrderPoints.getText());
		//To do: OrderPoints should be printed then assert with the class OnlinePointRec

	}

}
