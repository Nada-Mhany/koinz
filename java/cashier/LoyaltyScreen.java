package cashier;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class LoyaltyScreen {
	WebDriver driver;

	public LoyaltyScreen(AndroidDriver<AndroidElement> driver) {
		this.driver = driver;
	}

	public LoyaltyScreen(WebDriver driver) {
		this.driver = driver;
	}

	By ManagePointsBtn = By.xpath("//a[contains(text(),'Manage Points')]");
	By PhoneNumber = By.name("phone_number");
	By Receipt = By.name("receiptValue");
	By SendPointsBtn = By.xpath("//body/div[@id='root']/div[3]/div[2]/div[1]/div[1]/div[2]/div[2]/button[1]");
	By Customer = By.xpath("//body/div[@id='root']/div[3]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]");
	By Points = By.xpath("//body/div[@id='root']/div[3]/div[3]/div[1]/div[1]/div[1]/div[1]/div[3]");
	int MoneyAdded = 100;
	public int PointsAdded = (MoneyAdded *52)/100;
	public void AddOfflinePoints() {
		driver.findElement(ManagePointsBtn).click();
		driver.findElement(PhoneNumber).sendKeys("01061334326");
		driver.findElement(Receipt).sendKeys(String.valueOf(MoneyAdded));
		driver.findElement(SendPointsBtn).click();
	}

	public String CustomerName() {
		return driver.findElement(Customer).getText();
	}
//	public String ReceivedPoints () {
//		return driver.findElement(Points).getText();
//	}
}
