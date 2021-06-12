package koinz.order;

import org.openqa.selenium.By;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class SelectZone {
	AndroidDriver<AndroidElement> driver;

	By ContinueBtn = By.id("tech.gplanet.shopx:id/tv_continue");
	By SavedZone = By.id("tech.gplanet.shopx:id/tv_delivery_sub_district");
	By ChangeBtn = By.id("tech.gplanet.shopx:id/tv_change");
    By ChooseZone = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]");
    
	
	public SelectZone (AndroidDriver<AndroidElement> driver) {
		this.driver = driver;
	}
	public void selectZone() {
		
		driver.findElement(ChangeBtn).click();;
	    driver.findElement(ChooseZone).click();
	//driver.findElement(ContinueBtn).click();
		
	}
}
