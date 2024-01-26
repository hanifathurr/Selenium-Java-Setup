package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = "src/test/java/StepDefinitions",
        plugin = {
                "json:target/cucumber-reports/CucumberTestReport.json",
                "html:target/cucumber-reports"
        }
)
public class TestRunner extends AbstractTestNGCucumberTests {
}
