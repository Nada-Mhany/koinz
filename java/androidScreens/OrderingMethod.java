package androidScreens;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class OrderingMethod {

	AndroidDriver<AndroidElement> driver;

	By OrderBtn = By.id("tech.gplanet.shopx:id/tv_order_now");
	By PickupBtn = By.id("tech.gplanet.shopx:id/cl_pickup_container");
	By DeliveryBtn = By.id("tech.gplanet.shopx:id/cl_delivery_container");

	public OrderingMethod(AndroidDriver<AndroidElement> driver) {
		this.driver = driver;
	}

	public void SelectPickupMethod() {

		driver.findElement(OrderBtn).click();
		driver.findElement(OrderBtn).click();
		driver.findElement(PickupBtn).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	public void SelectDeliveryMethod() {

		driver.findElement(OrderBtn).click();
		driver.findElement(OrderBtn).click();
		driver.findElement(DeliveryBtn).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

}
