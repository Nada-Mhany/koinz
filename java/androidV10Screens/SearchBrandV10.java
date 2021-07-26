package androidV10Screens;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class SearchBrandV10 {

	AndroidDriver<AndroidElement> driver;
	By Explore = By.xpath("	\r\n"
			+ "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.LinearLayout/android.view.ViewGroup/android.widget.ImageView");
	By Search = By.id("tech.gplanet.shopx:id/iv_search");
	By SearchBar = By.id("tech.gplanet.shopx:id/et_search");
	By SelectedBrand = By.id("tech.gplanet.shopx:id/iv_background");
	// By AllowLocation = By.id("com.android.packageinstaller:id/permission_allow_button");

	public SearchBrandV10(AndroidDriver<AndroidElement> driver) {
		this.driver = driver;
	}

	public void SelectBrand() {
		driver.findElement(Explore).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(Search).click();
		driver.findElement(SearchBar).sendKeys("Space");
		driver.findElement(SelectedBrand).click();
		//driver.findElement(AllowLocation).click();

//		WebDriverWait wait = new WebDriverWait(driver, 3000);
//		driver.findElement(SearchLocation).sendKeys("Space");
//		wait.until(ExpectedConditions.visibilityOfElementLocated(SelectBrand));
//		driver.findElement(SelectBrand).click();

	}

}
