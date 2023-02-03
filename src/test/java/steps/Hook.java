package steps;

import basePages.BaseStep;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hook {

    @Before
    public void BeforeAllTest(Scenario _scenario) throws Throwable {
        BaseStep.abrindo_nav();
    }

    @After
    public void AfterAllTest() throws Throwable {
        BaseStep.saindo_nav();
    }

}
