package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/carrinho.feature",
        glue = "steps",
        tags = "@caminho03",
        plugin = {"pretty", "html:target/report_html_cart"},
        monochrome = true,
        snippets = SnippetType.CAMELCASE,
        dryRun = false
)



public class RunnerCarrinho {
}
