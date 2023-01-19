package PageObjects;

import org.openqa.selenium.By;

public class SearchPage extends BasePage {

    private By barra_de_pesquisa = By.xpath("//input[@id='twotabsearchtextbox']");
    private By botao_pesquisar = By.xpath("//input[@id='nav-search-submit-button']");

    private String resultados_da_pesquisa = "//span[text()='RESULTADOS']";

    private String resultado_invalido = "//span[text()='Nenhum resultado para ']";
    public void pesquisar(String busca){
       driver.findElement(barra_de_pesquisa).sendKeys(busca);
       driver.findElement(botao_pesquisar).click();
    }

    public void verificacao_pesquisa_valida(){
        String verif = "RESULTADOS";
        verificando_pagina(resultados_da_pesquisa, verif);

        driver.findElement(By.xpath("//div[@data-index='7']"));
    }

    public void verificacao_pesquisa_invalida(){
        String verif = "Nenhum resultado para";
        verificando_pagina(resultado_invalido, verif);

    }



}
