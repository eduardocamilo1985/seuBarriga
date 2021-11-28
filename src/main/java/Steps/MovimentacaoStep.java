package Steps;

import Pages.HomePage;
import Pages.MenuPage;
import Pages.MovimentacaoPage;
import estrutura.EvidenciaWord;
import io.cucumber.java.After;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;

import java.io.IOException;

public class MovimentacaoStep {
    MenuPage menu = new MenuPage();
    MovimentacaoPage movimentacao = new MovimentacaoPage();
    HomePage home = new HomePage();
    EvidenciaWord evidencia = new EvidenciaWord();

    @After(order = 0)
    public void finalizar() throws Exception {

        home.finalizar();
    }
    @Quando("o usuario criar uma movimentacao com os dados {string}{string}{string}{string}{string}{string}{string}")
    public void criarMovimentacaoSucesso(String tipo, String dataMovimentacao, String datapagamento,
                                         String descricao, String interessado, String valor, String conta) throws IOException {
        menu.movimentacao();
        movimentacao.tipo(tipo);
        movimentacao.dataMovimentacao(dataMovimentacao);
        movimentacao.datapagamento(datapagamento);
        movimentacao.descricao(descricao);
        movimentacao.interessado(interessado);
        movimentacao.valor(valor);
        movimentacao.conta(conta);
        movimentacao.situacaoPago();
        movimentacao.btnsalvar();
    }

    @Então("o sistema apresenta a mensagem {string} da movimentacao")
    public void apresentaMensagem(String mensagem) throws Exception {
        Assert.assertEquals(mensagem, movimentacao.mensagem());
        evidencia.geraEvidenciaCriarMovSucesso("Criar movimentação com sucesso");
    }
}
