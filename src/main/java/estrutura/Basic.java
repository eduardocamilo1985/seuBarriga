package estrutura;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.io.IOException;

import static estrutura.DriverFactory.getDriver;
import static estrutura.DriverFactory.killDriver;

public class Basic {

    public void acessar(String url){
        getDriver().get(url);
    }

    public void fecharNavegador(){
        killDriver();
    }

     public void escrever(String id, String texto){
         getDriver().findElement(By.id(id)).sendKeys(texto);
     }

     public void clicarPorXpath(String xpath){
         getDriver().findElement(By.xpath(xpath)).click();
     }
     public void clicarPorLinkText (String link){
        getDriver().findElement(By.linkText(link)).click();
    }

     public String obterTexto(String xpath){
        return getDriver().findElement(By.xpath(xpath)).getText();
     }

    //####### combos
    public void selecionarTexto(String id,String texto){
        Select selecionar = new Select(getDriver().findElement(By.id(id)));
        selecionar.selectByVisibleText(texto);
    }

    public void printarTela(String nomeArquivo) throws IOException {

        TakesScreenshot print =(TakesScreenshot) getDriver();
        File arquivo = print.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(arquivo, new File( nomeArquivo + ".jpg"));
    }


}
