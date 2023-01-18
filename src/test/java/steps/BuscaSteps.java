package steps;

import PageObjects.BasePage;
import PageObjects.SearchPage;
import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class BuscaSteps {

    SearchPage ini = new SearchPage();

    @Dado("^que o usuario acessa o site da amazon$")
    public void que_o_usuario_acessa_o_site_da_amazon() throws Throwable {
        ini.entrando_no_site("https://www.amazon.com.br/");

    }

    @Entao("^verifica se o url da acesso ao site amazon$")
    public void verifica_se_o_url_da_acesso_ao_site_amazon() throws Throwable {
        ini.verificando("© 2021-2023 Amazon.com, Inc. ou suas afiliadas");

    }

    @Quando("^o usuario faz busca de um \"([^\"]*)\"$")
    public void o_usuario_faz_busca_de_um(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Entao("^verifica o resultado da busca valida$")
    public void verifica_o_resultado_da_busca_valida() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Quando("^o usuario faz a busca de um \"([^\"]*)\"$")
    public void o_usuario_faz_a_busca_de_um(String arg1) throws Throwable {

        throw new PendingException();
    }

    @Entao("^verifica o resultado invalido$")
    public void verifica_o_resultado_invalido() throws Throwable {

        throw new PendingException();
    }

    @Entao("^verifica o resultado dessa busca$")
    public void verifica_o_resultado_dessa_busca() throws Throwable {

        throw new PendingException();
    }

    @Quando("^o usuario faz a busca com \"([^\"]*)\"$")
    public void o_usuario_faz_a_busca_com(String arg1) throws Throwable {

        throw new PendingException();
    }

    @Entao("^o sistema vai permanecer na pagina$")
    public void o_sistema_vai_permanecer_na_pagina() throws Throwable {

        throw new PendingException();
    }

    @After()
    public void terminando(){
        ini.saindo_do_navegador();
        System.out.println("saindo do navegador");
    }

}
