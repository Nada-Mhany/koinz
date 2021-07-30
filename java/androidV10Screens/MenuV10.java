package androidV10Screens;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class MenuV10 {
	AndroidDriver<AndroidElement> driver;
	By Item = By.id("tech.gplanet.shopx:id/tv_pickup_item_name");
	By CancelBtn = By.id("tech.gplanet.shopx:id/tv_cancel");
	By AddBasketBtn = By.id("tech.gplanet.shopx:id/add_item_container");
	By ViewBasketBtn = MobileBy.AndroidUIAutomator("text(\"View Order\")");
	By GiftBtn = By.id("tech.gplanet.shopx:id/cv_gift_fab");
	By AddGift = By.id("tech.gplanet.shopx:id/tv_add_gift");
	By AddGiftToBascketBtn = By.id("tech.gplanet.shopx:id/tv_add_to_basket");
	By SearchItem = By.id("tech.gplanet.shopx:id/searchEditText");
	By SearchIcon = By.id("tech.gplanet.shopx:id/iv_search");
	By GiftItem = By.id("tech.gplanet.shopx:id/my_points_item");
	By GiftCode = By.id("tech.gplanet.shopx:id/store_redeem_code");
	By HowRedeem = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout");
	String element = "Automation";
	public MenuV10(AndroidDriver<AndroidElement> driver) {
		this.driver = driver;
	}

	public void SearchMenuItem() {
		 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	     driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+element+"\").instance(0))").click();
	     driver.findElement(SearchIcon).click();
		 driver.findElement(SearchItem).sendKeys("Automation");
	}
	public void AddMenuItem() {

		driver.findElement(Item).click();
		driver.findElement(AddBasketBtn).click();
		driver.findElement(CancelBtn).click();

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
