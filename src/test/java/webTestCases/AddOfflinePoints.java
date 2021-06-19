package webTestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import cashier.LoginScreen;
import cashier.LoyaltyScreen;
import cashier.OrderScreen;

public class AddOfflinePoints {
	@Test
	public void CheckAddOfflinePoints() {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\drivers\\Chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://cashier-web-app.firebaseapp.com/#/dashboard/new-orders");
		LoginScreen loginscreen = new LoginScreen(driver);
		loginscreen.Login();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		OrderScreen orderScreen = new OrderScreen(driver);
		orderScreen.SwitchToLoyalty();
		LoyaltyScreen loyaltyScreen = new LoyaltyScreen(driver);
		loyaltyScreen.AddOfflinePoints();
//		assertEquals(loyaltyScreen.CustomerName(), "Jerry");

	}

}
