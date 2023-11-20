package steps;

import PageObjects.CartPage;
import basePages.BaseStep;
import cucumber.api.PendingException;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import org.junit.Assert;

public class CarrinhoSteps extends BaseStep {

    CartPage pagina = new CartPage(BaseStep.driver);

    @Dado("^que o usuario acessa a pagina da amazon$")
    public void que_o_usuario_acessa_a_pagina_da_amazon() throws Throwable {
      pagina.abrindo_pagina();
    }

    @Entao("^verifica se url da o acesso na pagina da amazon$")
    public void verifica_se_url_da_o_acesso_na_pagina_da_amazon() throws Throwable {
        Assert.assertTrue(pagina.verificando_pagina());
        BaseStep.Screenshot("01 cart verificando pagina");
    }

    @Quando("^o usuario faz a busca por um \"([^\"]*)\"$")
    public void o_usuario_faz_a_busca_por_um(String produto) throws Throwable {
        pagina.pesquisando(produto);
        Assert.assertTrue(pagina.verificandoResuPesquisa());
        BaseStep.Screenshot("02 cart resultadoPesquisa");
    }

    @Quando("^clica no produto$")
    public void clica_no_produto() throws Throwable {
        pagina.click_no_produto();
        Assert.assertTrue(pagina.verifica_em_estoque());
        BaseStep.Screenshot("03 cart Em estoque");
    }

    @Entao("^o usuario adiciona o produto ao carrinho$")
    public void o_usuario_adiciona_o_produto_ao_carrinho() throws Throwable {
        pagina.adicionando_carrinho();
        BaseStep.Screenshot("04 cart adicionando ao carrinho");
    }

    @Entao("^verifica se o produto esta no carrinho$")
    public void verifica_se_o_produto_esta_no_carrinho() throws Throwable {
        Assert.assertTrue(pagina.verificando_carrinho1());
        pagina.click_carrinho();
        Assert.assertTrue(pagina.verificando_carrinho2());
        BaseStep.Screenshot("05 cart adicionando ao carrinho");
    }

    @Entao("^faz uma verificação se o produto esta no carrinho$")
    public void faz_uma_verificação_se_o_produto_esta_no_carrinho() throws Throwable {
        pagina.click_carrinho();
        Assert.assertTrue(pagina.carrinho_vazio());
        BaseStep.Screenshot("06 cart carrinho vazio");
    }

    @Entao("^o usuario tira o produto do carrinho$")
    public void o_usuario_tira_o_produto_do_carrinho() throws Throwable {
        pagina.click_excluir_do_carrinho();
        Assert.assertTrue(pagina.verificando_exclusao_do_carrinho());
        BaseStep.Screenshot("07 cart excluindo do carrinho");
    }

}
