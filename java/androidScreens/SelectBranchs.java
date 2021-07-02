package androidScreens;

import org.openqa.selenium.By;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class SelectBranchs {
	AndroidDriver<AndroidElement> driver;
	By Branch = By.xpath("//android.widget.TextView[contains(@text, 'Mokkatam branch')]");
	// By Branch =
	// By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[4]");
	By ProceedBtn = By.id("tech.gplanet.shopx:id/tv_confirm");

	public SelectBranchs(AndroidDriver<AndroidElement> driver) {
		this.driver = driver;
	}

	public void SelectBranch() {
		driver.findElement(Branch).click();
		driver.findElement(ProceedBtn).click();
	}

}
