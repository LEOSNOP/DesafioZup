package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import static entidades.TimerSleeper.timesleep;

public class SearchPage extends BasePage {

    JavascriptExecutor js = (JavascriptExecutor)driver;
    private By serchPage_barra_de_pesquisa = By.xpath("//input[@id='twotabsearchtextbox']");

    private By SearchPage_botao_pesquisar = By.xpath("//input[@id='nav-search-submit-button']");

    private String searchPage_searchPage_resultados_da_pesquisa = "//span[text()='RESULTADOS']";

    private String searchPage_resultado_invalido = "//span[text()='Nenhum resultado para ']";
    public void pesquisar(String busca){
       driver.findElement(serchPage_barra_de_pesquisa).sendKeys(busca);
       driver.findElement(SearchPage_botao_pesquisar).click();
       timesleep(2000);
    }

    public void verificacao_pesquisa_valida(){
        String verif = "RESULTADOS";
        verificando_pagina(searchPage_searchPage_resultados_da_pesquisa, verif);
        timesleep(200);
        js.executeScript("window.scroll(0,300)");
        driver.findElement(By.xpath("//div[@data-index='7']"));
        timesleep(1000);
    }

    public void verificacao_pesquisa_invalida(){
        String verif = "Nenhum resultado para";
        verificando_pagina(searchPage_resultado_invalido, verif);
        timesleep(1000);
    }



}
