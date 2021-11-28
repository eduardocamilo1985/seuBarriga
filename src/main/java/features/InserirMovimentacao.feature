#language: pt

Funcionalidade: Movimentação
  Como um usuário
  Eu gostaria de criar movimentações de contas
  Para que eu possa controlar os pagamentos/recebimentos de contas

  Contexto: Realizar login
    Dado que o usuário realiza login com sucesso
@Movimentacao
   Esquema do Cenário:
     Quando o usuario criar uma movimentacao com os dados "<tipo>""<dataMovimentacao>""<datapagamento>""<descricao>""<interessado>""<valor>""<conta>"
     Então o sistema apresenta a mensagem "<mensagem>" da movimentacao

     Exemplos:
     |tipo    |dataMovimentacao  |datapagamento|descricao            |interessado|valor|conta               |mensagem                            |
     |Despesa | 25/11/2021       |25/11/2021   |Pagamento de luz     |Light      |500  |Conta de luz        |Movimentação adicionada com sucesso!|
     |Receita |27/11/2021        |27/11/2021   |Salário da empresa X |Fulano     |5000 |Salário mensal      |Movimentação adicionada com sucesso!|
