#language:pt
  Funcionalidade: Acessar vários componentes html

    Contexto:
      Dado que o usuário acessou o arquivo Campo de Treinamento

      @informar_cadastro
      Cenario: informar campos solicitados
        Quando o usuário informar nome, sobrenome, sexo, comida, escolaridade e esporte
        Entao o cadastro deve ser ralizado

      @validar_cadastro
      Cenario: validar campos nome, sobrenome, sexo, comida, escolaridade e esporte
        Quando o usuario preencher os campos
        Entao valida os campos

      @validar_botao_confirm
      Cenario: validar botao confirm
        Quando o usuario clicar no botao confirm
        Entao validar o botao confirm