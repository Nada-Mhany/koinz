package appScreens;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class SearchBrands {

	AndroidDriver<AndroidElement> driver;
	By SearchBar = By.id("tech.gplanet.shopx:id/cl_search_bar");
	By SearchLocation = By.id("tech.gplanet.shopx:id/et_search_locations");
	By SelectBrand = By.id("tech.gplanet.shopx:id/civ_store_logo");

	public SearchBrands(AndroidDriver<AndroidElement> driver) {
		this.driver = driver;
	}

	public void SelectBrand() {

		driver.findElement(SearchBar).click();
		driver.findElement(SearchLocation).click();
		driver.findElement(SearchLocation).sendKeys("Space");
		WebDriverWait wait = new WebDriverWait(driver, 3000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(SelectBrand));
		driver.findElement(SelectBrand).click();

	}

}
