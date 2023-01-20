package PageObjects;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static entidades.TimerSleeper.timesleep;


public class BasePage {
    WebDriver driver;

    private String acessando_site = "https://www.amazon.com.br/";
    private String verificando_pagina_xpath = "//span[text()='© 2021-2023 Amazon.com, Inc. ou suas afiliadas']";

    private String verificador_da_pagina = "© 2021-2023 Amazon.com, Inc. ou suas afiliadas";

    public BasePage (){
        System.setProperty("webdriver.chrome.driver","/home/familia/Drivers/chromedriver_linux64/chromedriver");
        driver = new ChromeDriver();

    }

    public void entrando_no_site(){
        this.driver.get(acessando_site);
        System.out.println("entrando no site");
        timesleep(3000);
    }
    public void saindo_do_navegador(){
        this.driver.quit();
        System.out.println("saindo do navegador");
    }
    public void validando_site(){
       String texto = driver.findElement(By.xpath(verificando_pagina_xpath)).getText();
        Assert.assertEquals(verificador_da_pagina, texto);
        timesleep(1000);
    }


    public void verificando_pagina(String elemento_xpath, String verifica){
    String texto =driver.findElement(By.xpath(elemento_xpath)).getText();
    Assert.assertEquals(verifica, texto);
    timesleep(1000);
    }

}
