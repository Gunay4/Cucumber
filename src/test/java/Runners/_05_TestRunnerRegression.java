package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        tags = "@RegressionTest and @SmokeTest",
        features = {"src/test/java/FeatureFiles"},
        glue = {"StepDefinitions"}
        ,plugin= {"json:target/cucumber/cucumber.json"} // Jenkins için JSON report
)
public class _05_TestRunnerRegression extends AbstractTestNGCucumberTests {

}

// group da or var ise : herhangi birisi olan çağrılır
// group da and var ise : her iki grup adı olanlar çağrılır
