package androidV10;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class SelectBrand {
	
	AndroidDriver<AndroidElement> driver;
	
	By SelectBrand = MobileBy.AndroidUIAutomator("text(\"SPACE Portal\")");
	
	

	public SelectBrand(AndroidDriver<AndroidElement> driver) {
		this.driver = driver;
	}
	public void Brand() {
		
		WebDriverWait wait = new WebDriverWait(driver, 3000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(SelectBrand));
		driver.findElement(SelectBrand).click();

	}

}
