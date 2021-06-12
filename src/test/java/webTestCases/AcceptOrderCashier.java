package webTestCases;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import cashier.LoginScreen;
import cashier.OrderScreen;

public class AcceptOrderCashier {
	@Test
	public void CompletedOrder() {

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
		orderScreen.Order();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		System.out.println(orderScreen.NoOrderText());

		assertEquals(orderScreen.NoOrderText().contains("There are no recent orders"), true);
	}

}
