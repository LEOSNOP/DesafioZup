$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/cliente.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#language: pt"
    }
  ],
  "line": 2,
  "name": "simulando uma compra",
  "description": "\nComo um usuario\ngostaria de pesquisar por um produto\ne aciona-lo ao meu carrinho de compras",
  "id": "simulando-uma-compra",
  "keyword": "Funcionalidade"
});
formatter.scenario({
  "line": 8,
  "name": "adicionando produto no carrinho",
  "description": "",
  "id": "simulando-uma-compra;adicionando-produto-no-carrinho",
  "type": "scenario",
  "keyword": "Cenario"
});
formatter.step({
  "line": 9,
  "name": "que estou acessando o site",
  "keyword": "Dado "
});
formatter.step({
  "line": 10,
  "name": "visualizo a pagina inicial",
  "keyword": "Entao "
});
formatter.step({
  "line": 11,
  "name": "pesquiso por um produto",
  "keyword": "E "
});
formatter.step({
  "line": 12,
  "name": "aperto no botao de pesquisar",
  "keyword": "E "
});
formatter.step({
  "line": 13,
  "name": "visualizo se estou na pagina de resultados",
  "keyword": "Entao "
});
formatter.step({
  "line": 14,
  "name": "depois clico em um produto",
  "keyword": "E "
});
formatter.step({
  "line": 15,
  "name": "depois verifico se tem estoque do produto",
  "keyword": "E "
});
formatter.step({
  "line": 16,
  "name": "clico no adicionar ao carrinho",
  "keyword": "Entao "
});
formatter.step({
  "line": 17,
  "name": "verifico se foi adicionado ao carrinho",
  "keyword": "E "
});
formatter.match({
  "location": "InserirProduto.queEstouAcessandoOSite()"
});
formatter.result({
  "duration": 5710377348,
  "status": "passed"
});
formatter.match({
  "location": "InserirProduto.visualizoAPaginaInicial()"
});
formatter.result({
  "duration": 103613356,
  "status": "passed"
});
formatter.match({
  "location": "InserirProduto.pesquisoPorUmProduto()"
});
formatter.result({
  "duration": 275557049,
  "status": "passed"
});
formatter.match({
  "location": "InserirProduto.apertoNoBotaoDePesquisar()"
});
formatter.result({
  "duration": 2390606225,
  "status": "passed"
});
formatter.match({
  "location": "InserirProduto.visualizoOsResultadosDaPesquisa()"
});
formatter.result({
  "duration": 59639542,
  "status": "passed"
});
formatter.match({
  "location": "InserirProduto.clicoEmUmProduto()"
});
formatter.result({
  "duration": 3790738784,
  "status": "passed"
});
formatter.match({
  "location": "InserirProduto.depoisVerificoSeTemEstoqueDoProduto()"
});
formatter.result({
  "duration": 69590771,
  "status": "passed"
});
formatter.match({
  "location": "InserirProduto.clicoNoAdicionarAoCarrinho()"
});
formatter.result({
  "duration": 1483799150,
  "status": "passed"
});
formatter.match({
  "location": "InserirProduto.verificoSeFoiAdicionadoAoCarrinho()"
});
formatter.result({
  "duration": 110742364,
  "status": "passed"
});
formatter.after({
  "duration": 301827445,
  "status": "passed"
});
formatter.after({
  "duration": 120614968,
  "status": "passed"
});
});