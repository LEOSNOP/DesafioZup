# Desafio da zup 

Este projeto foi criado com Mavem usando os recursos abaixo:

 - Java 
 - Selenium 
 - Cucumber
 - Junit
 

# Requisitos

 Utilizando as ferramentas que preferir crie um teste automatizado que faça o fluxo de ponta a ponta de um cliente que:

1 - Entre em um grande portal de comércio online (Exemplo: Americanas, Submarino, Magazine Luiza)

2 - Faça uma busca por um produto

3 - Valide o retorno da busca

4 - Escolha um produto na lista

5 - Adicione o carrinho

6 - Valide o produto no carrinho

Para a criação dos cenários de testes devem ser considerados casos de sucesso e fluxos alternativos

# Como fiz os testes

com base nos Requisitos começei a fazer as features, que no caso são duas, uma para busca, e outra para o carrinho de compras.

Funcionalidade: busca de produtos
    
    Como um usuario na pagina da Amazon
    quero fazer a busca por um produto
    e validar o retorno dessa busca

Funcionalidade: Carrinho de compras

    Como um usuario quero acessar o site da Amazon
    quero fazer uma busca por algum produto
    e adicionar este produto no carrinho de compras

a partir disso comecei a fazer os cenarios

Cenarios da Busca

1- Cenario busca - valida
2- Cenario busca - invalida
3- Cenario busca - generica
4- Cenario busca - em branco

Cenarios do Carrinho de Compras

1- Cenario Carrinho - adicionar ao carrinho
2- Cenario Carrinho - clica no produto sem adicionar ao carrinho
3- Cenario Carrinho - adiciona ao carrinho e tira o item do carrinho

# PageObejcts 

Antes de começar a fazer os PageObejcts comecei a fazer os Runners 
para configurar os Steps e os Cenarios, quando isso foi concluido 

comecei a fazer os PageObjects que estao disponiveis na pasta src/test/java/PageObjects

Ordem de desenvolvimento das pages 

1- BasePage
2- SearchPage
3- CartPage

# Relatorios 

Nos Runners em plugins eu pedi para fazer relatorios em Html 

Mas é possivel pedir outras formas de relatorios

E tambem para complementar os relatorios em Html o programa faz screenshots de passos dos testes 
que vao tudo para pasta Target

