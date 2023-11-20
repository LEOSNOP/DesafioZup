package PageObjects;

import basePages.BasePage;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import static entidades.TimerSleeper.timesleep;

public class SearchPage extends BasePage {

    public SearchPage(WebDriver browser) {
        super(browser);
    }

    JavascriptExecutor js = (JavascriptExecutor)driver;

    private String url = "https://www.amazon.com.br/";

    private By verificando_pagina = By.xpath("//span[text()='© 2021-2023 Amazon.com, Inc. ou suas afiliadas']");

    private By serchPage_barra_de_pesquisa = By.xpath("//input[@id='twotabsearchtextbox']");

    private By SearchPage_botao_pesquisar = By.xpath("//input[@id='nav-search-submit-button']");

    private By  searchPage_resultados_da_pesquisa = By.xpath("//span[text()='RESULTADOS']");

    private By searchPage_resultado_invalido = By.xpath("//span[text()='Nenhum resultado para ']");

    public void abrindo_pagina(){
        driver.get(url);
        timesleep(1000);
    }
    public boolean verificando_pagina(){
        String verif = "© 2021-2023 Amazon.com, Inc. ou suas afiliadas";
        String texto = driver.findElement(verificando_pagina).getText();
        Assert.assertEquals(verif, texto);
        return true;
    }
    public void pesquisando(String pesquisa){
        driver.findElement(serchPage_barra_de_pesquisa).sendKeys(pesquisa);
        driver.findElement(SearchPage_botao_pesquisar).click();
        timesleep(1000);
    }
    public boolean verificandoResultadoValido(){
        String verif = "RESULTADOS";
        String texto = driver.findElement(searchPage_resultados_da_pesquisa).getText();
        Assert.assertEquals(verif, texto);
        timesleep(200);
        js.executeScript("window.scroll(0,300)");
        driver.findElement(By.xpath("//div[@data-index='7']"));
        timesleep(1000);
        return true;
    }
    public boolean verificandoResultadoInvalido(){
        String verif = "Nenhum resultado para";
        String texto = driver.findElement(searchPage_resultado_invalido).getText();
        Assert.assertEquals(verif, texto);
        timesleep(1000);
        return true;
    }


}
