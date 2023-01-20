#language: pt

  Funcionalidade: Carrinho de compras

    Como um usuario quero acessar o site da Amazon
    quero fazer uma busca por algum produto
    e adicionar este produto no carrinho de compras



  Contexto: entrando no site da Amazon
    Dado que o usuario acessa a pagina da amazon
    Entao verifica se url da o acesso na pagina da amazon


  @caminho_alternativo1
  Esquema do Cenário: usuario adiciona carrinho
    Quando o usuario faz a busca por um <produto>
    E clica no produto
    Entao o usuario adiciona o produto ao carrinho
    E verifica se o produto esta no carrinho

      Exemplos:
        |produto      |
        |"headset hyperx"|

  @caminho_alternativo2
  Esquema do Cenário:usuario nao adiciona ao carrinho
    Quando o usuario faz a busca por um <produto>
    E clica no produto
    Entao faz uma verificação se o produto esta no carrinho

      Exemplos:
        |produto         |
        |"headset hyperx"|

    @caminho_alternativo3
    Esquema do Cenário:usuario adiciona ao carrinho e tira o item do carrinho
      Quando o usuario faz a busca por um <produto>
      E clica no produto
      Entao o usuario adiciona o produto ao carrinho
      E verifica se o produto esta no carrinho
      Entao o usuario tira o produto do carrinho


        Exemplos:
          |produto         |
          |"headset hyperx"|