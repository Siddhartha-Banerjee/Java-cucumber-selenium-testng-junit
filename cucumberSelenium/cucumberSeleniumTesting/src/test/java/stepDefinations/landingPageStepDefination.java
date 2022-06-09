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

public class landingPageStepDefination
{
	
    public WebDriver driver;
    public String prodname;
    public String offprodname;
    testContextSetup testContextSetup;
    public landingPage lp;
    
    public landingPageStepDefination(testContextSetup testContextSetup)
    {
    	this.testContextSetup=testContextSetup;
    }
	
	@Given("Verify user is on green card landing page")
	public void verify_user_is_on_green_card_landing_page() throws InterruptedException 
	{
//		System.setProperty("webdriver.chrome.driver", "E:\\cucumber\\driver\\chromedriver.exe");
//		testContextSetup.driver=new ChromeDriver();
//	    testContextSetup.driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		lp=testContextSetup.pageObjectManager.getLandingPage();
	    
	}
	
	@When("^User searched with shortname (.+) and extracted actual name of product$")
	public void user_searched_with_shortname_and_extracted_actual_name_of_product(String shortname) throws InterruptedException 
	{
		//landingPage lp=new landingPage(testContextSetup.driver);
		//landingPage lp=testContextSetup.pageObjectManager.getLandingPage();
		lp.searchItem(shortname);
		
//	    try {
//	    	testContextSetup.driver.findElement(By.xpath("/html/body/div/div/header/div/div[2]/form/input")).sendKeys(shortname);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		Thread.sleep(3000);
	    testContextSetup.prodname=lp.getSearchItem().split("-")[0].trim();
	    System.out.println("product name extracted from home page "+testContextSetup.prodname);
	}
	
	
	@When("Added {string} items of the selected product to cart")
	public void additem(String qty)
	{
		lp.incrementqty(Integer.parseInt(qty));
		lp.addtocart();
	}
	
	
	
}
