package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

//encapsulation
public class checkoutPage 
{
	public WebDriver driver;
	public checkoutPage(WebDriver driver)
	{
		this.driver=driver;
	}
	private By cartbag=By.xpath("/html/body/div/div/header/div/div[3]/a[4]/img");
	private By checkout=By.xpath("/html/body/div/div/header/div/div[3]/div[2]/div[2]/button");
	private By promobtn=By.xpath("/html/body/div/div/div/div/div/div/button");
	private By placeorder=By.xpath("/html/body/div/div/div/div/div/button");
	
	
	public void checkOut() throws InterruptedException
	{
		driver.findElement(cartbag).click();
		driver.findElement(checkout).click();
		Thread.sleep(3000);
	}
	
	public Boolean verifyPromo()
	{
		return driver.findElement(promobtn).isDisplayed();
	}
	
	public Boolean verifyPlOrder()
	{
		return driver.findElement(placeorder).isDisplayed();
	}
	
	
}
