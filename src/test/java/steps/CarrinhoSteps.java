package steps;

import basePages.BaseStep;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class CarrinhoSteps extends BaseStep {



    @Dado("^que o usuario acessa a pagina da amazon$")
    public void que_o_usuario_acessa_a_pagina_da_amazon() throws Throwable {

    }

    @Entao("^verifica se url da o acesso na pagina da amazon$")
    public void verifica_se_url_da_o_acesso_na_pagina_da_amazon() throws Throwable {

    }

    @Quando("^o usuario faz a busca por um \"([^\"]*)\"$")
    public void o_usuario_faz_a_busca_por_um(String produto) throws Throwable {

    }

    @Quando("^clica no produto$")
    public void clica_no_produto() throws Throwable {

    }

    @Entao("^o usuario adiciona o produto ao carrinho$")
    public void o_usuario_adiciona_o_produto_ao_carrinho() throws Throwable {

    }

    @Entao("^verifica se o produto esta no carrinho$")
    public void verifica_se_o_produto_esta_no_carrinho() throws Throwable {

    }

    @Entao("^faz uma verificação se o produto esta no carrinho$")
    public void faz_uma_verificação_se_o_produto_esta_no_carrinho() throws Throwable {

    }

    @Entao("^o usuario tira o produto do carrinho$")
    public void o_usuario_tira_o_produto_do_carrinho() throws Throwable {

    }

    @After(order = 1)
    public void Fim_do_teste(Scenario cenario){

    }

    @After(order = 0)
    public void saindo(){

    }


}
