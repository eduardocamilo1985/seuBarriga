package Pages;

import estrutura.Basic;

import java.io.IOException;

public class MovimentacaoPage extends Basic {

    public void tipo(String tipo){
        selecionarTexto("tipo",tipo);
    }
    public void dataMovimentacao(String data){
        escrever("data_transacao",data);
    }
    public void datapagamento(String data){
        escrever("data_pagamento",data);
    }
    public void descricao(String descricao){
        escrever("descricao",descricao);
    }
    public void interessado(String interessado){
        escrever("interessado", interessado);
    }
    public void valor(String valor){
        escrever("valor", valor);
    }
    public void conta(String conta){
        selecionarTexto("conta",conta);
    }
    public void situacaoPago(){
        clicarPorXpath("//input[@id='status_pago']");
    }
    public void situacaoPendente(){
        clicarPorXpath("//input[@id='status_pendente']");
    }
    public void btnsalvar() throws IOException {
        printarTela("Movimentacao");
        clicarPorXpath("//button");
    }
    public String mensagem() throws IOException {
        printarTela("SalvarMovimentacao");
       return obterTexto("//div[starts-with(@class, 'alert alert-')]");
    }




}
