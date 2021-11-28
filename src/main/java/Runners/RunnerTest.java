package Runners;

import Pages.HomePage;
import Steps.Login;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import java.io.IOException;

import static io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "summary","html:Relatorio-html.html","json:Relatorio.json"},
        monochrome = true,
        features = {"src/main/java/features/"},
        glue = {"Steps"},
        snippets = CAMELCASE,
       // tags = "@Conta",
        dryRun = false
)

public class RunnerTest {
    static Login login = new Login();
    static HomePage home = new HomePage();

    @BeforeClass
    public static void reset() throws IOException {
       login.realizaLogin();
        home.btnReset();
        home.finalizar();
    }
}
