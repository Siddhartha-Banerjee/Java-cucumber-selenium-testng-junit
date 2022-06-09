package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

//encapsulation
public class landingPage 
{
	public WebDriver driver;
	public landingPage(WebDriver driver)
	{
		this.driver=driver;
	}
	private By search=By.xpath("/html/body/div/div/header/div/div[2]/form/input");
	private By productName=By.xpath("/html/body/div/div/div[1]/div/div/h4");
	private By topDealPage=By.xpath("/html/body/div/div/header/div/div[3]/a[2]");
	private By increment=By.xpath("/html/body/div/div/div[1]/div/div/div[2]/a[2]");
	private By addtocart=By.xpath("/html/body/div/div/div[1]/div/div/div[3]/button");
	
	public void searchItem(String name)
	{
		driver.findElement(search).sendKeys(name);
	}
	
	public String getSearchItem()
	{
		String s=driver.findElement(productName).getText();
		return s;
	}
	
	public void selectTopDealsPage()
	{
		driver.findElement(topDealPage).click();
	}
	
	
	public void incrementqty(int qty)
	{
		for(int i=0;i<qty-1;i++)
		{
			driver.findElement(increment).click();
		}
	}
	
	public void addtocart()
	{
		driver.findElement(addtocart).click();
	}
}
