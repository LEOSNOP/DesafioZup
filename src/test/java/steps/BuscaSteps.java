package steps;

import PageObjects.SearchPage;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class BuscaSteps {

    SearchPage busca = new SearchPage();

    @Dado("^que o usuario acessa o site da amazon$")
    public void que_o_usuario_acessa_o_site_da_amazon() throws Throwable {
        busca.entrando_no_site();
    }

    @Entao("^verifica se o url da acesso ao site amazon$")
    public void verifica_se_o_url_da_acesso_ao_site_amazon() throws Throwable {
        busca.validando_site();
        busca.ScreenShot("Busca_validando_site");
    }

    @Quando("^o usuario faz busca de um \"([^\"]*)\"$")
    public void o_usuario_faz_busca_de_um(String produtos_valido) throws Throwable {
      busca.pesquisar(produtos_valido);
      busca.ScreenShot("Busca_Cenario1_"+produtos_valido);
    }

    @Entao("^verifica o resultado da busca valida$")
    public void verifica_o_resultado_da_busca_valida() throws Throwable {
        busca.verificacao_pesquisa_valida();
        busca.ScreenShot("Busca_Cenario1_validacao_pesquisa");
    }

    @Quando("^o usuario faz a busca de um \"([^\"]*)\"$")
    public void o_usuario_faz_a_busca_de_um(String produto_invalido) throws Throwable {
        busca.pesquisar(produto_invalido);
        busca.ScreenShot("Busca_Cenario2_3_"+produto_invalido);
    }

    @Entao("^verifica o resultado invalido$")
    public void verifica_o_resultado_invalido() throws Throwable {
        busca.verificacao_pesquisa_invalida();
        busca.ScreenShot("Busca_Cenario2_buscaInvalida_validando");
    }

    @Entao("^verifica o resultado dessa busca$")
    public void verifica_o_resultado_dessa_busca() throws Throwable {
        busca.verificacao_pesquisa_valida();
        busca.ScreenShot("Busca_Cenario3_genericos_validando");
    }

    @Quando("^o usuario faz a busca com \"([^\"]*)\"$")
    public void o_usuario_faz_a_busca_com(String arg1) throws Throwable {
        busca.pesquisar(arg1);
        busca.ScreenShot("Busca_cenario4");
    }

    @Entao("^o sistema vai permanecer na pagina$")
    public void o_sistema_vai_permanecer_na_pagina() throws Throwable {
       busca.validando_site();
       busca.ScreenShot("Busca_cenario4_permaneceNoSite");
    }

    @After(order = 1)
    public void ScreenshotAfter(Scenario cenario){
        busca.ScreenShot("FimDoTeste/busca"+cenario);
    }

    @After(order = 0)
    public void terminando(){
        busca.saindo_do_navegador();
    }

}
