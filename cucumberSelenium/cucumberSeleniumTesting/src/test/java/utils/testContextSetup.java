package utils;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

public class testContextSetup 
{
	public WebDriver driver;
    public String prodname;
    public pageObjects.pageObjectManager pageObjectManager;
	public testBase testBase;
	public genericUtils genericUtils;
	
    public testContextSetup() throws IOException
    {
    	testBase=new testBase();
    	pageObjectManager=new pageObjects.pageObjectManager(testBase.webDriverManager());
    	genericUtils=new genericUtils(testBase.webDriverManager());
    }
}
