package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

/*
comment the file LoginDemoSteps_POM.java
 */

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/Features/LoginDemo.feature",
    glue = {"StepDefinitions"},
    monochrome = true,
    plugin = {
        "pretty", "junit:target/JUnitReports/report.xml",
        "json:target/JSONReports/report.json",
        "html:target/HtmlReports.html"
    }
)
public class TestRunnerForLoginUsingPF {
}


