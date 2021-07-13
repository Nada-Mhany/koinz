package androidScreens;

import org.openqa.selenium.By;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Checkout {
	AndroidDriver<AndroidElement> driver;
	By OrderBtn = MobileBy.AndroidUIAutomator("text(\"Order\")");
	By PromoBtn = By.id("tech.gplanet.shopx:id/ll_add_promo");
	By TypePromo = By.id("tech.gplanet.shopx:id/et_promocode");
	By AddTypedPromo = By.id("tech.gplanet.shopx:id/cl_add");
	By MapElement= By.id("tech.gplanet.shopx:id/cv_map_snapshot");
	By AddPromoCode = By.id("tech.gplanet.shopx:id/cl_add_new_promocode");
	public Checkout(AndroidDriver<AndroidElement> driver) {
		this.driver = driver;
	}

	public void Order() {
		driver.findElement(OrderBtn).click();
	}
	public void AddPromo () {
//		TouchActions action = new TouchActions(driver);
//		action.scroll(driver.findElement(MapElement), 10, 100);
//		action.perform();
	    String Promo = "Promo";
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+Promo+"\").instance(0))").click();
		driver.findElement(AddPromoCode).click();
		driver.findElement(TypePromo).click();
		driver.findElement(TypePromo).sendKeys("automation");
		driver.findElement(AddTypedPromo).click();

	}
}
