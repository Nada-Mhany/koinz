package koinz.order;

import org.openqa.selenium.By;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Checkout {
	AndroidDriver<AndroidElement> driver;
	By OrderBtn = MobileBy.AndroidUIAutomator("text(\"Order\")");
	
	public Checkout (AndroidDriver<AndroidElement> driver) {
		this.driver = driver;
	}
	public void Order() {
		
		driver.findElement(OrderBtn).click();
			}
}
