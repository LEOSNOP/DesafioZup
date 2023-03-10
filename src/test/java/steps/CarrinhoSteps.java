package steps;

import PageObjects.CartPage;
import cucumber.api.PendingException;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class CarrinhoSteps {

    CartPage cart = new CartPage();

    @Dado("^que o usuario acessa a pagina da amazon$")
    public void que_o_usuario_acessa_a_pagina_da_amazon() throws Throwable {
        cart.entrando_no_site();
    }

    @Entao("^verifica se url da o acesso na pagina da amazon$")
    public void verifica_se_url_da_o_acesso_na_pagina_da_amazon() throws Throwable {
        cart.validando_site();
        cart.ScreenShot("Cart_validando_site");
    }

    @Quando("^o usuario faz a busca por um \"([^\"]*)\"$")
    public void o_usuario_faz_a_busca_por_um(String produto) throws Throwable {
        cart.pesquisar(produto);
        cart.ScreenShot("Cart_busca"+ produto);
    }

    @Quando("^clica no produto$")
    public void clica_no_produto() throws Throwable {
       cart.clicando_no_produto();
       cart.ScreenShot("Cart_clicando_no_Produto");
    }

    @Entao("^o usuario adiciona o produto ao carrinho$")
    public void o_usuario_adiciona_o_produto_ao_carrinho() throws Throwable {
        cart.adicionando_carrinho();
        cart.ScreenShot("Cart_adicionando ao carrinho");
    }

    @Entao("^verifica se o produto esta no carrinho$")
    public void verifica_se_o_produto_esta_no_carrinho() throws Throwable {
        cart.verificando_se_esta_no_carrinho();
        cart.ScreenShot("Cart_verificando_esta_no_carrinho");
    }

    @Entao("^faz uma verificação se o produto esta no carrinho$")
    public void faz_uma_verificação_se_o_produto_esta_no_carrinho() throws Throwable {
        cart.verifica_carrinho_sem_produto();
        cart.ScreenShot("Cart_carrinho_sem_produto");
    }

    @Entao("^o usuario tira o produto do carrinho$")
    public void o_usuario_tira_o_produto_do_carrinho() throws Throwable {
        cart.tirando_produto_carrinho();
        cart.ScreenShot("Cart_tirando_do_carrinho");
    }

    @After(order = 1)
    public void Fim_do_teste(Scenario cenario){
        cart.ScreenShot("FimDoTeste/cart"+ cenario);
    }

    @After(order = 0)
    public void saindo(){
        cart.saindo_do_navegador();
    }


}
