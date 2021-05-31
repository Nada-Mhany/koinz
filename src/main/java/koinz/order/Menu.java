package koinz.order;

import org.openqa.selenium.By;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Menu {
	AndroidDriver<AndroidElement> driver;
	By item = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]");
	By AddBasketBtn = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[1]");
	By ViewBasketBtn = MobileBy.AndroidUIAutomator("text(\"View Order\")");
	
	public Menu (AndroidDriver<AndroidElement> driver) {
		this.driver = driver;
	}
	public void addMenuItem() {
		
		driver.findElement(item).click();
		driver.findElement(AddBasketBtn).click();
		driver.findElement(ViewBasketBtn).click();
	}
}
