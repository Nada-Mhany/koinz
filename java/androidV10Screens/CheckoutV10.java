package androidV10Screens;

import org.openqa.selenium.By;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class CheckoutV10 {
	AndroidDriver<AndroidElement> driver;
	By OrderBtn = MobileBy.AndroidUIAutomator("text(\"Order\")");
	By PromoCodeText = By.id("tech.gplanet.shopx:id/promocodeEditText");
	By ApplyPromo = By.id("tech.gplanet.shopx:id/tv_add");
	public CheckoutV10(AndroidDriver<AndroidElement> driver) {
		this.driver = driver;
	}

	public void Order() {
		driver.findElement(OrderBtn).click();
	}
	public void AddPromo () {

		driver.findElement(PromoCodeText).click();
		driver.findElement(PromoCodeText).sendKeys("automation");
		driver.findElement(ApplyPromo).click();

	}
}
