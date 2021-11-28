package Pages;

import estrutura.Basic;

import java.io.IOException;


public class ContaPage extends Basic {
    public static String mensagem;
    public void nome(String nome){
        escrever("nome",nome);
    }
    public void btnSalvar() throws IOException {
        clicarPorXpath("//button");
        printarTela("AdicionaConta");
    }

    public String mensagem(){
            mensagem = obterTexto("//div[starts-with(@class, 'alert alert-')]");
           return obterTexto("//div[starts-with(@class, 'alert alert-')]");
    }

}
