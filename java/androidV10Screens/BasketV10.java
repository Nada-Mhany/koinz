package androidV10Screens;
import org.openqa.selenium.By;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class BasketV10 {
	AndroidDriver<AndroidElement> driver;
	// By CheckoutBtn =
	// By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.LinearLayout/android.view.ViewGroup");
	By CheckoutBtn = By.id("tech.gplanet.shopx:id/ordering_button_custom_view");

	public BasketV10(AndroidDriver<AndroidElement> driver) {
		this.driver = driver;
	}

	public void ViewOrder() {

		driver.findElement(CheckoutBtn).click();
	}
}
