package appScreens;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Menu {
	AndroidDriver<AndroidElement> driver;
	By Item = By.xpath(
			"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]");
	By AddBasketBtn = By.xpath(
			"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[1]");
	By ViewBasketBtn = MobileBy.AndroidUIAutomator("text(\"View Order\")");
	By GiftBtn = By.id("tech.gplanet.shopx:id/cv_gift_fab");
	By AddGift = By.xpath(
			"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.Button");
	By AddGiftToBascketBtn = By.id("tech.gplanet.shopx:id/tv_enabled_add_to_basket");
	By SearchItem = By.id("tech.gplanet.shopx:id/et_search_locations");
	By SearchIcon = By.id("tech.gplanet.shopx:id/iv_pickup_menu_search");
	By GiftItem = By.id("tech.gplanet.shopx:id/my_points_item");
	By GiftCode = By.id("tech.gplanet.shopx:id/store_redeem_code");
	By HowRedeem = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout");
	public Menu(AndroidDriver<AndroidElement> driver) {
		this.driver = driver;
	}

	public void SearchMenuItem() {
		driver.findElement(SearchIcon).click();
		driver.findElement(SearchItem).sendKeys("Automation");
	}
	public void AddMenuItem() {

		driver.findElement(Item).click();
		driver.findElement(AddBasketBtn).click();
	}

	public void AddGift() {
		driver.findElement(GiftBtn).click();
		driver.findElement(AddGift).click();
		driver.findElement(AddGiftToBascketBtn).click();
	}

	public void ViewBasket() {
		driver.findElement(ViewBasketBtn).click();
	}
	public void GiftClick() {
	driver.findElement(HowRedeem).click();
	driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	driver.findElement(GiftItem).click();

	}
	public String GetGiftCode() {
		String GetCode= driver.findElement(GiftCode).getText();
		return GetCode;
	}
}
