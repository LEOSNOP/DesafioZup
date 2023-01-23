package steps;


import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;


public class InserirProdutoSteps {
    WebDriver driver;
    @Dado("^que estou acessando o site$")
    public void queEstouAcessandoOSite() {
        System.setProperty("webdriver.chrome.driver", "/home/familia/Drivers/chromedriver_linux64/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://www.amazon.com.br/");// entrando no site da amazon
    }

    @Entao("^visualizo a pagina inicial$")
    public void visualizoAPaginaInicial() {
        String verifica = "© 2021-2023 Amazon.com, Inc. ou suas afiliadas";

        String texto = driver.findElement(By.xpath("//span[text()='© 2021-2023 Amazon.com, Inc. ou suas afiliadas']")).getText();
        Assert.assertEquals(verifica, texto);// verificando se estou na pagina da amazon

    }

    @Entao("^pesquiso por um produto$")
    public void pesquisoPorUmProduto() {
        String pesquisa = "fone de ouvido";

        driver.findElement(By.id("twotabsearchtextbox")).sendKeys(pesquisa);// fazendo a pesquisa de um produto
    }

    @Entao("^aperto no botao de pesquisar$")
    public void apertoNoBotaoDePesquisar() {
        driver.findElement(By.id("nav-search-submit-button")).click();// click na lupa de pesquisa
        System.out.println("pesquisa feita");// confirmando no console esse passo foi feito
    }

    @Entao("^visualizo se estou na pagina de resultados$")
    public void visualizoOsResultadosDaPesquisa() {
        String verifica = driver.findElement(By.xpath("//span[text()='RESULTADOS']")).getText();
        Assert.assertEquals("RESULTADOS", verifica);//confirmando se estou na pagina da amazon e se estou na aba de resultados
    }

    @Entao("^depois clico em um produto$")
    public void clicoEmUmProduto() {
        driver.findElement(By.xpath("//span[@class='a-size-base-plus a-color-base a-text-normal']")).click();
    }

    @Entao("^depois verifico se tem estoque do produto$")
    public void depoisVerificoSeTemEstoqueDoProduto() {
       String verifica = "Em estoque.";

       String verifica1 = "Estimativa de envio de 2 a 3 dias.";

       try{ String texto = driver.findElement(By.xpath("//span[@class='a-size-medium a-color-success']")).getText();
        Assert.assertEquals(verifica, texto);}catch (RuntimeException e){
           String texto = driver.findElement(By.xpath("//span[@class='a-size-medium a-color-state']")).getText();
           Assert.assertEquals(verifica1, texto);
       }
    }

    @Entao("^clico no adicionar ao carrinho$")
    public void clicoNoAdicionarAoCarrinho() {
       driver.findElement(By.id("add-to-cart-button")).click();// adicionando ao carrinho
    }

    @Entao("^verifico se foi adicionado ao carrinho$")
    public void verificoSeFoiAdicionadoAoCarrinho() {
        String texto = driver.findElement(By.xpath("//span[@class='a-size-medium-plus a-color-base sw-atc-text a-text-bold']")).getText();
        Assert.assertEquals("Adicionado ao carrinho", texto);
        System.out.println("adicionado ao carrinho com sucesso");
    }
    @After(order = 1)
    public void screenshot (Scenario cenario)  {
        File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(file, new File("target/screenshot/"+cenario.getId()+".jpg"));
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    @After(order = 0)
    public void saindo (){
        driver.quit();
        System.out.println("saindo do navegador");
    }

}