package appScreens;


import org.openqa.selenium.By;


import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class SelectZones {
	AndroidDriver<AndroidElement> driver;
	
//	By ContinueBtn = By.id("tech.gplanet.shopx:id/tv_continue");
//	By SavedZone = By.id("tech.gplanet.shopx:id/tv_delivery_sub_district");
	By ChangeBtn = By.id("tech.gplanet.shopx:id/tv_change");
	By ChooseZone = By.xpath("//android.widget.TextView[contains(@text, '23rd July')]");
	//By SearchZone = By.id("tech.gplanet.shopx:id/et_search_locations");
	//By Zone = By.id("tech.gplanet.shopx:id/tv_place_name");
	//By SearchLocation = By.id("ttech.gplanet.shopx:id/et_search_locations");
	//By Location = By.id("tech.gplanet.shopx:id/tv_place_name");
	
	
	public SelectZones(AndroidDriver<AndroidElement> driver) {
		this.driver = driver;
	}

	public void SelectZone() {
		try
	    {
			driver.findElement(ChangeBtn).click();
	    }
	    catch(Exception e)
	    {
	    	driver.findElement(ChooseZone).click();
	    }
	//driver.findElement(ChangeBtn).click();
}
}
