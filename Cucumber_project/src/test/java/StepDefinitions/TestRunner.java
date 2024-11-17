package StepDefinitions;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features",glue= {"StepDefinitions"},
monochrome= true,

//plugin= {"pretty","html:target/htmlreports"}
//plugin= {"pretty","json:target/JSONReports/report.json"}
plugin= {"pretty","junit:target/JUnitReports/report.xml"},
tags="@SmokeScenario"
)
public class TestRunner {

}
