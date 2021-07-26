package androidV10Screens;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class OrderingMethodV10 {
	AndroidDriver<AndroidElement> driver;

	By PickupBtn = By.id("tech.gplanet.shopx:id/cl_pickup_container");
	By DeliveryBtn = By.id("tech.gplanet.shopx:id/cl_delivery_container");
	By AllowLocation = By.id("com.android.packageinstaller:id/permission_allow_button");
	By RetryBtn = By.id("tech.gplanet.shopx:id/tv_retry");

	public OrderingMethodV10(AndroidDriver<AndroidElement> driver) {
		this.driver = driver;
	}

	public void SelectPickupMethod() {

		driver.findElement(PickupBtn).click();
		driver.findElement(AllowLocation).click();
		driver.findElement(RetryBtn).click();

	}

	public void SelectDeliveryMethod() {

		driver.findElement(DeliveryBtn).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
}
