package steps;

import PageObjects.SearchPage;
import basePages.BaseStep;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import org.junit.Assert;


import static entidades.TimerSleeper.timesleep;

public class BuscaSteps extends BaseStep {
    SearchPage pagina = new SearchPage(BuscaSteps.driver);


    @Dado("^que o usuario acessa o site da amazon$")
    public void que_o_usuario_acessa_o_site_da_amazon() throws Throwable {
        pagina.abrindo_pagina();
    }

    @Entao("^verifica se o url da acesso ao site amazon$")
    public void verifica_se_o_url_da_acesso_ao_site_amazon() throws Throwable {
        Assert.assertTrue(pagina.verificando_pagina());
        timesleep(1000);
    }

    @Quando("^o usuario faz busca de um \"([^\"]*)\"$")
    public void o_usuario_faz_busca_de_um(String produtos_valido) throws Throwable {
        pagina.pesquisando(produtos_valido);

    }

    @Entao("^verifica o resultado da busca valida$")
    public void verifica_o_resultado_da_busca_valida() throws Throwable {
        Assert.assertTrue(pagina.verificandoResultadoValido());

    }

    @Quando("^o usuario faz a busca de um \"([^\"]*)\"$")
    public void o_usuario_faz_a_busca_de_um(String produto_invalido) throws Throwable {
        pagina.pesquisando(produto_invalido);
    }

    @Entao("^verifica o resultado invalido$")
    public void verifica_o_resultado_invalido() throws Throwable {
        Assert.assertTrue(pagina.verificandoResultadoInvalido());
    }

    @Entao("^verifica o resultado dessa busca$")
    public void verifica_o_resultado_dessa_busca() throws Throwable {
        Assert.assertTrue(pagina.verificandoResultadoValido());
    }

    @Quando("^o usuario faz a busca com \"([^\"]*)\"$")
    public void o_usuario_faz_a_busca_com(String arg1) throws Throwable {
        pagina.pesquisando(arg1);
    }

    @Entao("^o sistema vai permanecer na pagina$")
    public void o_sistema_vai_permanecer_na_pagina() throws Throwable {
        Assert.assertTrue(pagina.verificando_pagina());

    }

    @After(order = 1)
    public void ScreenshotAfter(Scenario cenario){

    }

    @After(order = 0)
    public void terminando(){
        pagina.saindo();
    }

}
