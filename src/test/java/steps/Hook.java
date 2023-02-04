package steps;

import basePages.BaseStep;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hook {

    @Before
    public void BeforeAllTest() throws Throwable {
        BaseStep.abrindo_nav();
    }

    @After
    public void AfterAllTest(Scenario scenario) throws Throwable {
        BaseStep.Screenshot("Fim do test/"+ scenario.getName());
        BaseStep.saindo_nav();
    }

}
