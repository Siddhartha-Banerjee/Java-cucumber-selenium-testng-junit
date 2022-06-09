package cucumberOptions;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="@target/failed_tests.txt",
					glue="stepDefinations",
					monochrome=true
					//tags="@placeorder or @offerspage",
					//plugin={"html:target/report1.html","json:target/report1.json",
					//		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
					//		"rerun:target/failed_tests.txt"}
				)
public class failedTestRunner extends AbstractTestNGCucumberTests
{
	@Override
	@DataProvider(parallel=true)
	public Object[][] scenarios()
	{
		return super.scenarios();
	}
}
