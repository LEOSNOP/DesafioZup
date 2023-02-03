package runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/busca.feature",
        glue = "steps",
        tags = "@caminho04",
        plugin = {"pretty", "html:target/report_html_busca"},
        monochrome = true,
        snippets = SnippetType.CAMELCASE,
        dryRun = false
)


public class RunnerBusca {

}
