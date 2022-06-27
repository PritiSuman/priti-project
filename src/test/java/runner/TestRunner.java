package runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RunWith(Cucumber.class)
@CucumberOptions
        (features = "Features",
        glue ={"teststeps"},
        plugin = {"pretty", "summary", "json:target/cucumber-Report/cucumber.json",
        "junit:target/test-reports/cucumber.xml",
        "html:target/cucumberReport/cucumberHtmlReport.html"},
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        tags = ("@automated"))

public class TestRunner {
    private static final Logger LOGGER = LoggerFactory.getLogger(TestRunner.class.getSimpleName());

}
