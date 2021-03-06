package pageObjects;

import org.openqa.selenium.WebDriver;

public class pageObjectManager 
{
	public landingPage lpg;
	public offersPage opg;
	public WebDriver driver;
	public checkoutPage cop;
	
	public pageObjectManager(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public landingPage getLandingPage()
	{
		lpg=new landingPage(driver);
		return lpg;
	}
	
	public offersPage getOfferPage()
	{
		opg=new offersPage(driver);
		return opg;
	}
	
	public checkoutPage getCheckoutPage()
	{
		cop=new checkoutPage(driver);
		return cop;
	}
}
