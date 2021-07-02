package androidScreens;
import org.openqa.selenium.By;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class BrandInfo {
	
	AndroidDriver<AndroidElement> driver;
	By CurrentPoints = By.id("tech.gplanet.shopx:id/tv_store_points");

	public BrandInfo(AndroidDriver<AndroidElement> driver) {
		this.driver = driver;
	}

	
	public int CurrentPoint() {
		String points = driver.findElement(CurrentPoints).getText();
		int point =Integer.parseInt(points.replaceAll("[\\D]", ""));		
		System.out.println(point);
		return point;
	}

}
