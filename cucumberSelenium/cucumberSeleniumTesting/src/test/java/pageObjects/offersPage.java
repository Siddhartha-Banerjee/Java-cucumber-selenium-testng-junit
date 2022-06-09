package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

//encapsulation
public class offersPage 
{
	public WebDriver driver;
	public offersPage(WebDriver driver)
	{
		this.driver=driver;
	}
	private By search=By.xpath("//*[@id=\"search-field\"]");
	private By productName=By.xpath("/html/body/div/div/div/div/div/div/div/table/tbody/tr/td[1]");
	
	
	public void searchItem(String name)
	{
		driver.findElement(search).sendKeys(name);
	}
	
	public String getSearchItem()
	{
		String s=driver.findElement(productName).getText();
		return s;
	}
	
	
}
