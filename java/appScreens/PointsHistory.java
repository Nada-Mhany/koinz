package appScreens;

import org.openqa.selenium.By;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class PointsHistory {
	AndroidDriver<AndroidElement> driver;
	By LastPointsText = By.id("tech.gplanet.shopx:id/log_row_desc");
	public PointsHistory(AndroidDriver<AndroidElement> driver) {
		this.driver = driver;
	}
	public String GetPointsText() {
		return driver.findElement(LastPointsText).getText();
	}
}
