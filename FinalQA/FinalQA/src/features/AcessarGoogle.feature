#language:pt
  Funcionalidade: Acessar Google

    Contexto:
      Dado que o usuário instanciou o chrome-driver

    @basico
    Cenario: Acessar Google
      Dado que o usuario digitou o endereco do google no navegador
      E que o usuário digitou Rockstar Games
      Quando clicar em Enter
      Então deve apresentar a lista de pesquisa com Rockstar Games
      E acessar o site
      E apos fechar navegador


