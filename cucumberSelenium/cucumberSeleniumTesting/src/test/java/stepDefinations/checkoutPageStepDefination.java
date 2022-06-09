package stepDefinations;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.landingPage;
import utils.testBase;
import utils.testContextSetup;

public class checkoutPageStepDefination
{
	
    public WebDriver driver;
    public String prodname;
    public String offprodname;
    testContextSetup testContextSetup;
    public pageObjects.checkoutPage checkoutPage;
    public landingPage lp;
    
    public checkoutPageStepDefination(testContextSetup testContextSetup)
    {
    	this.testContextSetup=testContextSetup;
		this.checkoutPage=testContextSetup.pageObjectManager.getCheckoutPage();
    }
	
	@Then("Verify user have ability to apply promo and place the order")
	public void verify_user_have_ability_to_apply_promo() throws InterruptedException
	{

		Assert.assertTrue(checkoutPage.verifyPromo());
		Thread.sleep(5000);
		Assert.assertTrue(checkoutPage.verifyPlOrder());
	}
	
	@Then("^User proceeds to checkout and validate the (.+) items in checkout page$")
	public void user_proceeds_to_checkout_and_validate_the_items_in_checkout_page(String name) throws InterruptedException
	{
		checkoutPage.checkOut();
	}
	
}
