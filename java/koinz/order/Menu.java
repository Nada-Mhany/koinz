package koinz.order;

import org.apache.hc.core5.util.ByteArrayBuffer;
import org.openqa.selenium.By;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Menu {
	AndroidDriver<AndroidElement> driver;
	By item = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]");
	By AddBasketBtn = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[1]");
	By ViewBasketBtn = MobileBy.AndroidUIAutomator("text(\"View Order\")");
	By GiftBtn = By.id("tech.gplanet.shopx:id/cv_gift_fab");
	By AddGift = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.Button");
	By AddGiftToBascketBtn = By.id("tech.gplanet.shopx:id/tv_enabled_add_to_basket");
	public Menu (AndroidDriver<AndroidElement> driver) {
		this.driver = driver;
	}
	public void addMenuItem() {
		
		driver.findElement(item).click();
		driver.findElement(AddBasketBtn).click();
		driver.findElement(ViewBasketBtn).click();
	}
	public void addGift() {
	driver.findElement(GiftBtn).click();
	driver.findElement(AddGift).click();
	driver.findElement(AddGiftToBascketBtn).click();
	driver.findElement(ViewBasketBtn).click();

	
	}
}