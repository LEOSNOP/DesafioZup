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
        driver.get("https://www.amazon.com.br/");
    }

    @Entao("^visualizo a pagina inicial$")
    public void visualizoAPaginaInicial() throws Throwable {
        String texto = driver.findElement(By.xpath("//span[text()='© 2021-2022 Amazon.com, Inc. ou suas afiliadas']")).getText();
        Assert.assertEquals("© 2021-2022 Amazon.com, Inc. ou suas afiliadas", texto);

    }

    @Entao("^pesquiso por um produto$")
    public void pesquisoPorUmProduto() throws Throwable {

    }

    @Entao("^aperto no botao de pesquisar$")
    public void apertoNoBotaoDePesquisar() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Entao("^visualizo os resultados da pesquisa$")
    public void visualizoOsResultadosDaPesquisa() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Entao("^clico em um produto$")
    public void clicoEmUmProduto() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Entao("^depois verifico se tem estoque do produto$")
    public void depoisVerificoSeTemEstoqueDoProduto() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Entao("^clico no adicionar ao carrinho$")
    public void clicoNoAdicionarAoCarrinho() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Entao("^verifico se foi adicionado ao carrinho$")
    public void verificoSeFoiAdicionadoAoCarrinho() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

}
