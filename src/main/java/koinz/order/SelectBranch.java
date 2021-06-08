package koinz.order;

import org.openqa.selenium.By;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class SelectBranch {
	AndroidDriver<AndroidElement> driver;

	By Branch = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[4]");
	By ProceedBtn = By.id("tech.gplanet.shopx:id/tv_confirm");
	
	public SelectBranch (AndroidDriver<AndroidElement> driver) {
		this.driver = driver;
	}
	public void selectBranch() {
		driver.findElement(Branch).click();
		driver.findElement(ProceedBtn).click();
	}

}
