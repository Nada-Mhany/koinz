package webTestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import appTestCases.GetGiftCode;
import cashier.LoginScreen;
import cashier.OrderScreen;

public class RedeemGift {
	public static String CodeOfGift;

	@Test
	public void Redeem() {

		// System.setProperty("webdriver.chrome.driver",
		// "C:\\Users\\user\\Chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\drivers\\Chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://cashier-web-app.firebaseapp.com/#/dashboard/new-orders");
		LoginScreen loginscreen = new LoginScreen(driver);
		loginscreen.Login();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		OrderScreen orderScreen = new OrderScreen(driver);
		orderScreen.SwitchToLoyalty();
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		orderScreen.SwitchRedeemgift();
		System.out.print(CodeOfGift);
		//String test2 = GetGiftCode.test;
		orderScreen.EnterRedeemCode(CodeOfGift);
	}
}
