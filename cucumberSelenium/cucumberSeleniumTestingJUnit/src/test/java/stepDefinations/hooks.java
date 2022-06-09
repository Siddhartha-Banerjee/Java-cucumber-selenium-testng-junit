package stepDefinations;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import utils.testContextSetup;

public class hooks 
{
	testContextSetup tcs;
	public hooks(testContextSetup testContextSetup)
	{
		this.tcs=testContextSetup;
	}
	@After
	public void afterScenario() throws IOException
	{
		tcs.testBase.webDriverManager().quit();
	}
	
	@AfterStep
	public void addss(Scenario scenario) throws IOException
	{
		WebDriver driver=tcs.testBase.webDriverManager();
		if(scenario.isFailed())
		{
			File ss=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			byte filecontent[]=FileUtils.readFileToByteArray(ss);
			scenario.attach(filecontent, "image/png", "image");
		}
	}

}
