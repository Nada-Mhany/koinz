package koinz.Admin;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginScreen {
 WebDriver driver;
	By UserName = By.name("phoneNumber");
	By Password = By.id("password");
	By LoginBtb = By.xpath("//*[@id=\"root\"]/div[3]/div/div/form/div[3]/button");
	public loginScreen(WebDriver driver){

        this.driver = driver;

    }
	public void Login() {
		driver.findElement(UserName).sendKeys("666");
	    driver.findElement(Password).sendKeys("123456");
	    driver.findElement(LoginBtb).click();
	}
}
