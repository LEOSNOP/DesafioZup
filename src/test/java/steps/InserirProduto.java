package steps;


import cucumber.api.PendingException;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InserirProduto {
    WebDriver driver;

    @Dado("^que estou acessando o site$")
    public void queEstouAcessandoOSite() throws Throwable {
        System.setProperty("webdriver.chrome.driver", "/home/familia/Drivers/chromedriver_linux64/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://www.amazon.com.br/");// entrando no site da amazon
    }

    @Entao("^visualizo a pagina inicial$")
    public void visualizoAPaginaInicial() throws Throwable {
        String texto = driver.findElement(By.xpath("//span[text()='© 2021-2022 Amazon.com, Inc. ou suas afiliadas']")).getText();
        Assert.assertEquals("© 2021-2022 Amazon.com, Inc. ou suas afiliadas", texto);// verificando se estou na pagina da amazon

    }

    @Entao("^pesquiso por um produto$")
    public void pesquisoPorUmProduto() throws Throwable {
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("fone de ouvido");// fazendo a pesquisa de um produto
    }

    @Entao("^aperto no botao de pesquisar$")
    public void apertoNoBotaoDePesquisar() throws Throwable {
        driver.findElement(By.id("nav-search-submit-button")).click();// click na lupa de pesquisa
        System.out.println("pesquisa feita");// confirmando no console esse passo foi feito
    }

    @Entao("^visualizo se estou na pagina de resultados$")
    public void visualizoOsResultadosDaPesquisa() throws Throwable {
        String verifica = driver.findElement(By.xpath("//span[text()='RESULTADOS']")).getText();
        Assert.assertEquals("RESULTADOS", verifica);//confirmando se estou na pagina da amazon e se estou na aba de resultados
    }

    @Entao("^depois clico em um produto$")
    public void clicoEmUmProduto() throws Throwable {
        driver.findElement(By.xpath("//span[@class='a-size-base-plus a-color-base a-text-normal']")).click();
    }

    @Entao("^depois verifico se tem estoque do produto$")
    public void depoisVerificoSeTemEstoqueDoProduto() throws Throwable {
        String texto = driver.findElement(By.xpath("//span[@class='a-size-medium a-color-success']")).getText();
        Assert.assertEquals("Em estoque.", texto);
    }

    @Entao("^clico no adicionar ao carrinho$")
    public void clicoNoAdicionarAoCarrinho() throws Throwable {
       driver.findElement(By.id("add-to-cart-button")).click();
    }

    @Entao("^verifico se foi adicionado ao carrinho$")
    public void verificoSeFoiAdicionadoAoCarrinho() throws Throwable {
        String texto = driver.findElement(By.xpath("//span[@class='a-size-medium-plus a-color-base sw-atc-text a-text-bold']")).getText();
        Assert.assertEquals("Adicionado ao carrinho", texto);
    }

}
