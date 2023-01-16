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
  "duration": 8367502825,
  "status": "passed"
});
formatter.match({
  "location": "InserirProduto.visualizoAPaginaInicial()"
});
formatter.result({
  "duration": 482164444,
  "status": "passed"
});
formatter.match({
  "location": "InserirProduto.pesquisoPorUmProduto()"
});
formatter.result({
  "duration": 270768095,
  "status": "passed"
});
formatter.match({
  "location": "InserirProduto.apertoNoBotaoDePesquisar()"
});
formatter.result({
  "duration": 2758284781,
  "status": "passed"
});
formatter.match({
  "location": "InserirProduto.visualizoOsResultadosDaPesquisa()"
});
formatter.result({
  "duration": 159253534,
  "status": "passed"
});
formatter.match({
  "location": "InserirProduto.clicoEmUmProduto()"
});
formatter.result({
  "duration": 3609066309,
  "status": "passed"
});
formatter.match({
  "location": "InserirProduto.depoisVerificoSeTemEstoqueDoProduto()"
});
formatter.result({
  "duration": 83780898,
  "status": "passed"
});
formatter.match({
  "location": "InserirProduto.clicoNoAdicionarAoCarrinho()"
});
formatter.result({
  "duration": 1684231645,
  "status": "passed"
});
formatter.match({
  "location": "InserirProduto.verificoSeFoiAdicionadoAoCarrinho()"
});
formatter.result({
  "duration": 165126930,
  "status": "passed"
});
formatter.after({
  "duration": 362408048,
  "status": "passed"
});
formatter.after({
  "duration": 177871423,
  "status": "passed"
});
});