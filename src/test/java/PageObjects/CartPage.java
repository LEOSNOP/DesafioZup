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

    JavascriptExecutor js = (JavascriptExecutor)driver;

    private String url = "https://www.amazon.com.br/";

    private By verificando_pagina = By.xpath("//span[text()='© 2021-2023 Amazon.com, Inc. ou suas afiliadas']");

    private By cartPage_barra_de_pesquisa = By.xpath("//input[@id='twotabsearchtextbox']");

    private By cartpage_botao_pesquisar = By.xpath("//input[@id='nav-search-submit-button']");

    private By cartPage_resultados_da_pesquisa = By.xpath("//span[text()='RESULTADOS']");

    private By cartPage_click_produto = By.xpath("//span [@class='a-size-base-plus a-color-base a-text-normal']");

    private By cartPage_em_estoque = By.xpath("//span[@class='a-size-medium a-color-success']");

    private By cartPage_botao_add_carrinho = By.id("add-to-cart-button");

    private By cartPage_verificacao_carrinho1 = By.xpath("//span[@class='a-size-medium-plus a-color-base sw-atc-text a-text-bold']");

    private By cartPage_click_carrinho = By.xpath("//a[@id='nav-cart']");

    private By cartPage_estou_no_carrinho = By.xpath("//h1[text()]");

    private By cartPage_lista_do_carrinho = By.xpath("//div[@class='sc-list-item-content']");

    private By cartPage_carrinho_vazio = By.xpath("//h2[text()]");

    private By cartPage_botao_excluir_do_carrinho = By.xpath("//input[@class='a-color-link']");

    private By cartPage_verifica_exclusao_do_carrinho = By.xpath("//h1[text()]");

    public void abrindo_pagina(){
        driver.get(url);
    }
    public boolean verificando_pagina(){
        String verif = "© 2021-2023 Amazon.com, Inc. ou suas afiliadas";
        String texto = driver.findElement(verificando_pagina).getText();
        Assert.assertEquals(verif, texto);
        return true;
    }
    public void pesquisando(String pesquisa){
        driver.findElement(cartPage_barra_de_pesquisa).sendKeys(pesquisa);
        driver.findElement(cartpage_botao_pesquisar).click();
        timesleep(1000);
    }
    public boolean verificandoResuPesquisa(){
        String verif = "RESULTADOS";
        String texto = driver.findElement(cartPage_resultados_da_pesquisa).getText();
        Assert.assertEquals(verif, texto);
        timesleep(200);
        js.executeScript("window.scroll(0,300)");
        driver.findElement(By.xpath("//div[@data-index='7']"));
        timesleep(1000);
        return true;
    }
    public void click_no_produto(){
        driver.findElement(cartPage_click_produto).click();
    }
    public boolean verifica_em_estoque(){
        String verif = "Em estoque.";
        String texto = driver.findElement(cartPage_em_estoque).getText();
        Assert.assertEquals(verif, texto);
        return true;
    }
    public void adicionando_carrinho(){
        driver.findElement(cartPage_botao_add_carrinho).click();
        timesleep(2000);
    }
    public boolean verificando_carrinho1(){
        String verif = "Adicionado ao carrinho";
        String texto = driver.findElement(cartPage_verificacao_carrinho1).getText();
        Assert.assertEquals(verif, texto);
        timesleep(1000);
        return true;
    }
    public void click_carrinho(){
        driver.findElement(cartPage_click_carrinho).click();
        timesleep(1000);
    }
    public boolean verificando_carrinho2(){
        String verif = "Carrinho de compras";
        String texto = driver.findElement(cartPage_estou_no_carrinho).getText();
        Assert.assertEquals(verif, texto);
        timesleep(1000);
        driver.findElement(cartPage_lista_do_carrinho);
        timesleep(1000);
        return true;
    }
    public boolean carrinho_vazio(){
        String verif = "Seu carrinho da Amazon está vazio";
        String texto = driver.findElement(cartPage_carrinho_vazio).getText();
        Assert.assertEquals(verif, texto);
        return true;
    }
    public void click_excluir_do_carrinho(){
        driver.findElement(cartPage_botao_excluir_do_carrinho).click();
        timesleep(1000);
    }
    public boolean verificando_exclusao_do_carrinho(){
        String verif = "Seu carrinho de compras da Amazon está vazio.";
        String texto = driver.findElement(cartPage_verifica_exclusao_do_carrinho).getText();
        Assert.assertEquals(verif, texto);
        timesleep(1000);
        return true;
    }

}
