package PageObjects;

import org.junit.Assert;
import org.openqa.selenium.By;
import static entidades.TimerSleeper.timesleep;

public class CartPage extends BasePage {

    private By barra_de_pesquisa = By.xpath("//input[@id='twotabsearchtextbox']");

    private By botao_pesquisar = By.xpath("//input[@id='nav-search-submit-button']");

    private String resultados_da_pesquisa = "//span[text()='RESULTADOS']";

    private By click_produto = By.xpath("//span [@class='a-size-base-plus a-color-base a-text-normal']");

    private String em_estoque = "//span[@class='a-size-medium a-color-success']";

    private By botao_add_carrinho = By.id("add-to-cart-button");

    private By verificacao_carrinho1 = By.xpath("//span[@class='a-size-medium-plus a-color-base sw-atc-text a-text-bold']");

    private By click_carrinho = By.xpath("//a[@id='nav-cart']");

    private By estou_no_carrinho = By.xpath("//h1[text()]");

    private By lista_do_carrinho = By.xpath("//div[@class='sc-list-item-content']");

    private By carrinho_vazio = By.xpath("//h2[text()]");

    public void pesquisar(String busca){
        driver.findElement(barra_de_pesquisa).sendKeys(busca);
        driver.findElement(botao_pesquisar).click();
        timesleep(1000);
        verificacao_pesquisa();
        timesleep(1000);
    }
    private void verificacao_pesquisa(){
        String verif = "RESULTADOS";
        verificando_pagina(resultados_da_pesquisa, verif);
        driver.findElement(By.xpath("//div[@data-index='7']"));
        timesleep(1000);
    }

    public void clicando_no_produto(){
        String verif = "Em estoque.";
        driver.findElement(click_produto).click();
        timesleep(1000);
        produto_em_estoque(em_estoque, verif);

    }
    private void produto_em_estoque(String elemento_xpath, String verifica){
        String texto =driver.findElement(By.xpath(elemento_xpath)).getText();
        Assert.assertEquals(verifica, texto);
        timesleep(1000);

    }

    public void adicionando_carrinho(){
        driver.findElement(botao_add_carrinho).click();
        timesleep(2000);
    }

    public void verificando_se_esta_no_carrinho(){
        String verif = "Adicionado ao carrinho";
        String text =driver.findElement(verificacao_carrinho1).getText();
        Assert.assertEquals(text, verif);
        timesleep(1000);
        verificacao_carrinho();
    }

    private void verificacao_carrinho(){
        String verif = "Carrinho de compras";
        driver.findElement(click_carrinho).click();
        timesleep(1000);
        String text = driver.findElement(estou_no_carrinho).getText();
        Assert.assertEquals(text,verif);
        timesleep(1000);
        driver.findElement(lista_do_carrinho);
        timesleep(1000);
    }

    public void verifica_carrinho_sem_produto(){
        String verif = "Seu carrinho da Amazon está vazio";
        driver.findElement(click_carrinho).click();
        timesleep(1000);
        String text = driver.findElement(carrinho_vazio).getText();
        Assert.assertEquals(text,verif);
    }


}
