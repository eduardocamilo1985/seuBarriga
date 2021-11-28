package Pages;

import estrutura.Basic;

import java.io.IOException;

public class HomePage extends Basic {
    public String mensagemLoginSucesso(){
        return obterTexto("//div[contains(text(),'Bem vindo,')]");
    }
    public void finalizar(){
        fecharNavegador();
    }
    public void btnReset(){
        clicarPorLinkText("reset");
    }
    public void printLoginSucesso() throws IOException {
        printarTela("LoginSucesso");
    }



}
