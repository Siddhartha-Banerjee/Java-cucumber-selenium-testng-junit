package cucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/features",
					glue="stepDefinations",
					monochrome=true,
					tags="@placeorder or @offerspage",
					plugin={"html:target/report1.html","json:target/report1.json",
							"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
							"rerun:target/failed_tests.txt"})
public class JUnitTestRunnerTest
{
	
}
//feature files can run parallelly in junit using maven configuration 
//but 2 scenario of same feature file cannot run parallelly

//use java version 16 for junit <maven.compiler.source>16</maven.compiler.source>
//<maven.compiler.target>16</maven.compiler.target>