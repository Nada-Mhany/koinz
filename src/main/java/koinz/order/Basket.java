package koinz.order;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Basket {
	AndroidDriver<AndroidElement> driver;
	By CheckoutBtn = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.LinearLayout/android.view.ViewGroup");
	
	public Basket (AndroidDriver<AndroidElement> driver) {
		this.driver = driver;
	}
	public void viewOrder() {
		
		driver.findElement(CheckoutBtn).click();
    	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

			}
}
