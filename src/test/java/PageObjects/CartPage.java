package PageObjects;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import static entidades.TimerSleeper.timesleep;

public class CartPage extends BasePage {

    JavascriptExecutor js = (JavascriptExecutor)driver;

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

    public void pesquisar(String busca){
        driver.findElement(cartPage_barra_de_pesquisa).sendKeys(busca);
        driver.findElement(cart_pagebotao_pesquisar).click();
        timesleep(1000);
        verificacao_pesquisa();
        timesleep(1000);

    }
    private void verificacao_pesquisa(){
        String verif = "RESULTADOS";
        verificando_pagina(cartPage_resultados_da_pesquisa, verif);
        driver.findElement(By.xpath("//div[@data-index='7']"));
        timesleep(1000);
        js.executeScript("window.scroll(0,300)");
    }

    public void clicando_no_produto(){
        String verif = "Em estoque.";
        driver.findElement(cartPage_click_produto).click();
        timesleep(1000);
        produto_em_estoque(cartPage_em_estoque, verif);

    }
    private void produto_em_estoque(String elemento_xpath, String verifica){
        String texto =driver.findElement(By.xpath(elemento_xpath)).getText();
        Assert.assertEquals(verifica, texto);
        timesleep(1000);

    }

    public void adicionando_carrinho(){
        driver.findElement(cartPage_botao_add_carrinho).click();
        timesleep(2000);
    }

    public void verificando_se_esta_no_carrinho(){
        String verif = "Adicionado ao carrinho";
        String text =driver.findElement(cartPage_verificacao_carrinho1).getText();
        Assert.assertEquals(text, verif);
        timesleep(1000);
        verificacao_carrinho();
    }

    private void verificacao_carrinho(){
        String verif = "Carrinho de compras";
        driver.findElement(cartPage_click_carrinho).click();
        timesleep(1000);
        String text = driver.findElement(cartPage_estou_no_carrinho).getText();
        Assert.assertEquals(text,verif);
        timesleep(1000);
        driver.findElement(cartPage_lista_do_carrinho);
        timesleep(1000);
    }

    public void verifica_carrinho_sem_produto(){
        String verif = "Seu carrinho da Amazon está vazio";
        driver.findElement(cartPage_click_carrinho).click();
        timesleep(1000);
        String text = driver.findElement(cartPage_carrinho_vazio).getText();
        Assert.assertEquals(text,verif);
    }

    public void tirando_produto_carrinho(){
        String verif = "Seu carrinho de compras da Amazon está vazio.";
        driver.findElement(cartPage_botao_excluir_do_carrinho).click();
        timesleep(1000);
        String text = driver.findElement(cartPage_depois_de_excluir_do_carrinho).getText();
        Assert.assertEquals(text, verif);
    }

}
