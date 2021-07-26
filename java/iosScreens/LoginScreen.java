package iosScreens;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import io.appium.java_client.MobileBy;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;

public class LoginScreen {
	IOSDriver<IOSElement> driver;
	By CountryBtn = By.xpath("//XCUIElementTypeImage[@name=\"CountryPickerView.bundle/Images/US\"]\n"
			+ "");
	By CountrySelect = By.id("tech.gplanet.shopx:id/textView_countryName");
	By PhoneNumber = By.id("tech.gplanet.shopx:id/phone_field");
	By NextBtn = By.id("tech.gplanet.shopx:id/btn_next");
	By Password = By.id("tech.gplanet.shopx:id/et_password");
	By LoginBtn = MobileBy.AndroidUIAutomator("text(\"Login\")");
	By PopUp = MobileBy.AndroidUIAutomator("text(\"ALLOW\")");
	By SideMenu = By.id("tech.gplanet.shopx:id/iv_menu_icon");
	By PointHistory = By.id("tech.gplanet.shopx:id/cl_points_history_container");
	

	public LoginScreen(IOSDriver<IOSElement> driver) {
		this.driver = driver;
	}
	public void NavigateSideMenu() {
		driver.findElement(SideMenu).click();
	}
	public void NavigatePointHistory() {
		driver.findElement(PointHistory).click();
	}

	public void CountrySelect() {
		driver.findElement(CountryBtn).click();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		//driver.findElement(CountrySearch).sendKeys("Egypt");
		//driver.findElement(CountrySelect).click();
	}

	public void Login() {
		driver.findElement(PhoneNumber).click();
		driver.findElement(PhoneNumber).sendKeys("01061334326");
		driver.findElement(NextBtn).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(Password).click();
		driver.findElement(Password).sendKeys("123456");
		driver.navigate().back();
		driver.findElement(LoginBtn).click();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.findElement(PopUp).click();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

	}

}
