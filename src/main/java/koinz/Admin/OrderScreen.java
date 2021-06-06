package koinz.Admin;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class OrderScreen {
 WebDriver driver;
	//By SelectBranch = By.xpath("//*[@id=\"root\"]/div[4]/div[2]/div[1]");
	//By OrderDiv = By.xpath("//*[@id=\"root\"]/div[3]/div[2]/div[2]/div[3]/div");
	//String x is change with orderID from mobile app
	
	String x = "104650";
	
	By OrderDiv = By.xpath("//*[contains(text(),'"+x+"')]");
	By AcceptBtn = By.xpath("/html/body/div[5]/div[2]/div[2]/div/div[3]/div[1]/div/button");
	By PreparingBtn = By.xpath("//*[@id=\"root\"]/div[3]/div[2]/div[1]/a[2]/div[2]");
	By OutForDeliveryBtn = By.xpath("//*[@id=\"root\"]/div[3]/div[2]/div[2]/div/div/div/div[2]/button");
	By ReadyBtn = By.xpath("//*[@id=\"root\"]/div[3]/div[2]/div[1]/a[3]/div[2]");
	By Delivered = By.xpath("//*[@id=\"root\"]/div[3]/div[2]/div[2]/div/div/div/div[2]/button");
	By NoOrder = By.xpath("//*[@id=\"root\"]/div[3]/div[2]/div[2]/div[2]");
	public OrderScreen(WebDriver driver){

        this.driver = driver;

    }
	public void Order() {
		//driver.findElement(SelectBranch).click();
	    driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
	    driver.findElement(OrderDiv).click();
	    driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
	    driver.findElement(AcceptBtn).click();
	    driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
	    driver.findElement(PreparingBtn).click();
	    driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
	    driver.findElement(OutForDeliveryBtn).click();
	    driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
	    driver.findElement(ReadyBtn).click();
	    driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
	    driver.findElement(Delivered).click();
	
	}
	public String NoOrderText() {
	String Text=	driver.findElement(NoOrder).getText();
	return Text;
	}
}
