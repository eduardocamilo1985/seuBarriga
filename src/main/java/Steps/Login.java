package Steps;

import Pages.LoginPage;

import java.io.IOException;

public class Login {
    LoginPage login = new LoginPage();

    public void realizaLogin() throws IOException {
        login.acessarSite();
        login.email("abcd@testeabcd.com");
        login.senha("1234");
        login.btnEntrar();
    }
}
