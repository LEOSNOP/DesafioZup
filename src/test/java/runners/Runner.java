package runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/cliente.feature",
        glue = "steps",
        plugin = {"pretty", "html:target/report-HTML", "json:target/report.json"},
        monochrome = true,
        snippets = SnippetType.CAMELCASE,
        dryRun = false
)

public class Runner {
}
