package Pages;

import estrutura.Basic;

import java.io.IOException;

public class LoginPage extends Basic {

    public void acessarSite (){
      acessar("https://seubarriga.wcaquino.me/");
    }

    public void email(String emailUsuario){
        escrever("email",emailUsuario);
    }

    public void senha(String senha) throws IOException {
        printarTela("telaLogin");
        escrever("senha",senha);
    }

    public void btnEntrar() throws IOException {
        clicarPorXpath("//button");
        printarTela("LoginSucesso");
    }
}
