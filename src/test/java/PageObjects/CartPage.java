package PageObjects;

import basePages.BasePage;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import static entidades.TimerSleeper.timesleep;

public class CartPage extends BasePage {

    public CartPage(WebDriver browser) {
        super(browser);
    }

    private By cartPage_barra_de_pesquisa = By.xpath("//input[@id='twotabsearchtextbox']");

    private By cart_pagebotao_pesquisar = By.xpath("//input[@id='nav-search-submit-button']");

    private String cartPage_resultados_da_pesquisa = "//span[text()='RESULTADOS']";

    private By cartPage_click_produto = By.xpath("//span [@class='a-size-base-plus a-color-base a-text-normal']");

    private String cartPage_em_estoque = "//span[@class='a-size-medium a-color-success']";

    private By cartPage_botao_add_carrinho = By.id("add-to-cart-button");

    private By cartPage_verificacao_carrinho1 = By.xpath("//span[@class='a-size-medium-plus a-color-base sw-atc-text a-text-bold']");

    private By cartPage_click_carrinho = By.xpath("//a[@id='nav-cart']");

    private By cartPage_estou_no_carrinho = By.xpath("//h1[text()]");

    private By cartPage_lista_do_carrinho = By.xpath("//div[@class='sc-list-item-content']");

    private By cartPage_carrinho_vazio = By.xpath("//h2[text()]");

    private By cartPage_botao_excluir_do_carrinho = By.xpath("//input[@class='a-color-link']");

    private By cartPage_depois_de_excluir_do_carrinho = By.xpath("//h1[text()]");



}
