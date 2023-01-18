package PageObjects;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class BasePage {
    WebDriver driver;

    public BasePage (){
        System.setProperty("webdriver.chrome.driver","/home/familia/Drivers/chromedriver_linux64/chromedriver");
        driver = new ChromeDriver();

    }

    public void entrando_no_site(String url){
        this.driver.get(url);
        System.out.println("entrando no site");
    }
    public void saindo_do_navegador(){
        this.driver.quit();
        System.out.println("saindo do navegador");
    }

    public void verificando(String elemento_da_pagina){
    String texto =driver.findElement(By.xpath("//span[text()='© 2021-2023 Amazon.com, Inc. ou suas afiliadas']")).getText();
    Assert.assertEquals(elemento_da_pagina, texto);
    }

}
