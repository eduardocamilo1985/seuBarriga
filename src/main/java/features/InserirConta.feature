#language: pt

Funcionalidade: Cadastro de contas
  Como um usuario
  Gostaria de cadastrar contas
  Para que eu possa distribuir meu dinheiro de uma forma mais organizada

  Contexto: Realizar login
    Dado que o usuário realiza login com sucesso

  Cenário: Deve adicionar conta com sucesso
    Quando o usuario adicionar uma conta "Conta de luz"
    Então o sistema apresenta a mensagem "Conta adicionada com sucesso!"

  Cenário: Deve adicionar conta com sucesso
    Quando o usuario adicionar uma conta "Salário mensal"
    Então o sistema apresenta a mensagem "Conta adicionada com sucesso!"

  Cenário: Não deve adicionar conta duplicada
    Quando o usuario adicionar uma conta ja existente
    Então o sistema apresenta a mensagem "Já existe uma conta com esse nome!"

  Cenário: Não deve adicionar conta em branco
    Quando o usuario adicionar uma conta em branco
    Então o sistema apresenta a mensagem "Informe o nome da conta"
