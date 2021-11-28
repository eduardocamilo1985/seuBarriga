package Steps;

import Pages.ContaPage;
import Pages.HomePage;
import Pages.MenuPage;
import estrutura.EvidenciaWord;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;

import java.io.IOException;
import java.util.Objects;

public class InserirContaStep {

    Login login = new Login();

    HomePage home = new HomePage();
    MenuPage menu = new MenuPage();
    ContaPage conta = new ContaPage();
    EvidenciaWord evidencia = new EvidenciaWord();
    private Scenario cenario;

    @Before
    public void nomeCenario(Scenario cenario) {
        this.cenario = cenario;
    }

    @After(order = 0)
    public void finalizar() throws Exception {
        if (cenario.getName().contains("adicionar conta")) {
            evidencia.geraEvidenciaAdicionarContaSucesso("Adicionar conta com sucesso");
        }
        if (Objects.equals(cenario.getName(), "Não deve adicionar conta duplicada")) {
            evidencia.geraEvidenciaAdicionarContaDuplicada("Adicionar conta duplicada");
        }
        if (Objects.equals(cenario.getName(), "Não deve adicionar conta em branco")) {
            evidencia.geraEvidenciaAdicionarContaEmBranco("Adicionar conta sem nome");
        }
        home.finalizar();
    }

    @Dado("que o usuário realiza login com sucesso")
    public void usuarioRealizaLoginComSucesso() throws IOException {
        login.realizaLogin();
        Assert.assertEquals("Bem vindo, FULANO DE TAL!", home.mensagemLoginSucesso());
    }

    @Quando("o usuario adicionar uma conta {string}")
    public void adicionarUmaConta(String nome) throws IOException {
        menu.contas();
        menu.contasAdicionar();
        conta.nome(nome);
        conta.btnSalvar();
    }

    @Quando("o usuario adicionar uma conta ja existente")
    public void adicionarContaExistente() throws IOException {
        menu.contas();
        menu.contasAdicionar();
        conta.nome("Conta de luz");
        conta.btnSalvar();
    }

    @Quando("o usuario adicionar uma conta em branco")
    public void adicionarContaEmBranco() throws IOException {
        menu.contas();
        menu.contasAdicionar();
        conta.nome("");
        conta.btnSalvar();
    }

    @Então("o sistema apresenta a mensagem {string}")
    public void oSistemaApresentaMensagem(String mensagem) throws Exception {
        Assert.assertEquals(mensagem, conta.mensagem());

    }
}
