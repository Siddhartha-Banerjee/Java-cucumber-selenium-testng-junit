package cucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/feature", //package name of feature file or can use exact name
		glue="stepDefinations", //package name of implementation code
		tags="@portaltest",     //can use and,or,not keywords for multiple tags
		plugin= {"pretty","html:target/report1.html","json:target/report1.json","junit:target/report1.xml"},
					            //generates report in target folder
		//dryRun=true,          //used to get implementation code in console of feature
		//monochrome=true,      //it is used to get clear output in console without funkey symbols etc
		stepNotifications=true) // it is used to get all tests in junit tab
public class JUnitTestRunner
{
	
}