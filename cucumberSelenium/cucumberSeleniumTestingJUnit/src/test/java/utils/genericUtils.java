package utils;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;

public class genericUtils 
{
	public WebDriver driver;
	public genericUtils(WebDriver driver)
	{
		this.driver=driver;
	}
	public void switchWindowToChild()
	{
		Set<String> s1=driver.getWindowHandles();
		Iterator<String> i1=s1.iterator();
		String parent=i1.next();
		String child=i1.next();
		driver.switchTo().window(child);
	}

}
