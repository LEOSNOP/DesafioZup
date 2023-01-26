package PageObjects;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

import static entidades.TimerSleeper.timesleep;



public class BasePage {
    WebDriver driver;

    private String BasePage_acessando_site = "https://www.amazon.com.br/";
    private String BasePage_verificando_pagina_xpath = "//span[text()='© 2021-2023 Amazon.com, Inc. ou suas afiliadas']";

    private String BasePage_verificador_da_pagina = "© 2021-2023 Amazon.com, Inc. ou suas afiliadas";

    public BasePage (){
        System.setProperty("webdriver.chrome.driver","/home/familia/Drivers/chromedriver_linux64/chromedriver");
        driver = new ChromeDriver();

    }

    public void entrando_no_site(){
        this.driver.get(BasePage_acessando_site);
        driver.manage().window().maximize();
        System.out.println("entrando no site");
        timesleep(3000);
    }

    public void saindo_do_navegador(){
        this.driver.quit();
        System.out.println("saindo do navegador");
    }
    public void validando_site(){
       String texto = driver.findElement(By.xpath(BasePage_verificando_pagina_xpath)).getText();
        Assert.assertEquals(BasePage_verificador_da_pagina, texto);
        timesleep(1000);
    }

    public void verificando_pagina(String elemento_xpath, String verifica){
    String texto =driver.findElement(By.xpath(elemento_xpath)).getText();
    Assert.assertEquals(verifica, texto);
    timesleep(1000);
    }

    public void ScreenShot (String nome){
        File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try{
            FileUtils.copyFile(file, new File("target/screenshots/"+nome+".jpg"));
        }catch (IOException e){
            e.printStackTrace();
        }
    }

}
