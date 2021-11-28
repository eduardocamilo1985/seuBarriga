package estrutura;

import org.docx4j.dml.wordprocessingDrawing.Inline;
import org.docx4j.openpackaging.exceptions.Docx4JException;
import org.docx4j.openpackaging.packages.WordprocessingMLPackage;
import org.docx4j.openpackaging.parts.WordprocessingML.BinaryPartAbstractImage;
import org.docx4j.openpackaging.parts.WordprocessingML.MainDocumentPart;
import org.docx4j.wml.ObjectFactory;
import org.docx4j.wml.Drawing;
import org.docx4j.wml.P;
import org.docx4j.wml.R;

import java.io.File;
import java.nio.file.Files;

public class EvidenciaWord {

    public File arquivo;
    public File imagem;
    public WordprocessingMLPackage wordPackage;
    public MainDocumentPart mainDocumentPart;

    public void geraEvidenciaAdicionarContaSucesso(String nomeArquivo) throws Docx4JException, Exception {
        wordPackage = WordprocessingMLPackage.createPackage();
        mainDocumentPart = wordPackage.getMainDocumentPart();
        arquivo = new File(nomeArquivo + ".docx");
        mainDocumentPart.addStyledParagraphOfText("Title", nomeArquivo);
        mainDocumentPart.addStyledParagraphOfText("Heading2", "Autor: Eduardo Camilo da Silva");
        mainDocumentPart.addStyledParagraphOfText("Heading2", "Passos realizados:");
        mainDocumentPart.addStyledParagraphOfText("Heading3", "1 - Acessar o sistema");
        inserirImagem("telaLogin");
        inserirImagem("LoginSucesso");
        mainDocumentPart.addStyledParagraphOfText("Heading3", "2 - Clicar em Contas");
        mainDocumentPart.addStyledParagraphOfText("Heading3", "3 - Clicar em Adicionar");
        mainDocumentPart.addStyledParagraphOfText("Heading3", "4 - Preencher o nome da conta");
        mainDocumentPart.addStyledParagraphOfText("Heading3", "5 - Clicar Salvar");
        mainDocumentPart.addStyledParagraphOfText("Heading3", "Resultado esperado: A conta é adicionada " +
                "e o sistema exibe mensagem de sucesso");
        inserirImagem("AdicionaConta");
        wordPackage.save(arquivo);
    }
    public void geraEvidenciaAdicionarContaDuplicada(String nomeArquivo) throws Docx4JException, Exception {
        wordPackage = WordprocessingMLPackage.createPackage();
        mainDocumentPart = wordPackage.getMainDocumentPart();
        arquivo = new File(nomeArquivo + ".docx");
        mainDocumentPart.addStyledParagraphOfText("Title", nomeArquivo);
        mainDocumentPart.addStyledParagraphOfText("Heading2", "Autor: Eduardo Camilo da Silva");
        mainDocumentPart.addStyledParagraphOfText("Heading2", "Passos realizados:");
        mainDocumentPart.addStyledParagraphOfText("Heading3", "1 - Acessar o sistema");
        inserirImagem("telaLogin");
        inserirImagem("LoginSucesso");
        mainDocumentPart.addStyledParagraphOfText("Heading3", "2 - Clicar em Contas");
        mainDocumentPart.addStyledParagraphOfText("Heading3", "3 - Clicar em Adicionar");
        mainDocumentPart.addStyledParagraphOfText("Heading3", "4 - Preencher o nome da conta com um nome já existente");
        mainDocumentPart.addStyledParagraphOfText("Heading3", "5 - Clicar Salvar");
        mainDocumentPart.addStyledParagraphOfText("Heading3", "Resultado esperado: A conta não é " +
                "adicionada e o sistema exibe mensagem informando que a conta está duplicada");
        inserirImagem("AdicionaConta");
        wordPackage.save(arquivo);
    }
    public void geraEvidenciaAdicionarContaEmBranco(String nomeArquivo) throws Docx4JException, Exception {
        wordPackage = WordprocessingMLPackage.createPackage();
        mainDocumentPart = wordPackage.getMainDocumentPart();
        arquivo = new File(nomeArquivo + ".docx");
        mainDocumentPart.addStyledParagraphOfText("Title", nomeArquivo);
        mainDocumentPart.addStyledParagraphOfText("Heading2", "Autor: Eduardo Camilo da Silva");
        mainDocumentPart.addStyledParagraphOfText("Heading2", "Passos realizados:");
        mainDocumentPart.addStyledParagraphOfText("Heading3", "1 - Acessar o sistema");
        inserirImagem("telaLogin");
        inserirImagem("LoginSucesso");
        mainDocumentPart.addStyledParagraphOfText("Heading3", "2 - Clicar em Contas");
        mainDocumentPart.addStyledParagraphOfText("Heading3", "3 - Clicar em Adicionar");
        mainDocumentPart.addStyledParagraphOfText("Heading3", "4 - Deixar o nome da conta em branco");
        mainDocumentPart.addStyledParagraphOfText("Heading3", "5 - Clicar Salvar");
        mainDocumentPart.addStyledParagraphOfText("Heading3", "Resultado esperado: A conta não é " +
                "adicionada e o sistema exibe mensagem informando que o campo é obrigatório");
        inserirImagem("AdicionaConta");
        wordPackage.save(arquivo);
    }
    public void geraEvidenciaCriarMovSucesso(String nomeArquivo) throws Docx4JException, Exception {
        wordPackage = WordprocessingMLPackage.createPackage();
        mainDocumentPart = wordPackage.getMainDocumentPart();
        arquivo = new File(nomeArquivo + ".docx");
        mainDocumentPart.addStyledParagraphOfText("Title", nomeArquivo);
        mainDocumentPart.addStyledParagraphOfText("Heading2", "Autor: Eduardo Camilo da Silva");
        mainDocumentPart.addStyledParagraphOfText("Heading2", "Passos realizados:");
        mainDocumentPart.addStyledParagraphOfText("Heading3", "1 - Acessar o sistema");
        inserirImagem("telaLogin");
        inserirImagem("LoginSucesso");
        mainDocumentPart.addStyledParagraphOfText("Heading3", "2 - Clicar em criar movimentação");
        mainDocumentPart.addStyledParagraphOfText("Heading3", "3 - Preencher todos os campos de forma válida");
        inserirImagem("Movimentacao");
        mainDocumentPart.addStyledParagraphOfText("Heading3", "4 - clicar em salvar");
        mainDocumentPart.addStyledParagraphOfText("Heading3", "Resultado esperado: A movimentação é criada com sucesso ") ;
        inserirImagem("SalvarMovimentacao");
        wordPackage.save(arquivo);
    }



    private void inserirImagem(String nomeImagem) throws Exception {
        File imagem = new File(nomeImagem + ".jpg");
        byte[] fileContent = Files.readAllBytes(imagem.toPath());
        BinaryPartAbstractImage imagePart = BinaryPartAbstractImage.createImagePart(wordPackage, fileContent);
        Inline inline = imagePart.createImageInline("Teste automatizado", "Alt Text", 1, 2, false);
        P Imageparagraph = addImagem(inline);
        mainDocumentPart.getContent().add(Imageparagraph);
    }

    private static P addImagem(Inline inline) {
        ObjectFactory factory = new ObjectFactory();
        P p = factory.createP();
        R r = factory.createR();
        p.getContent().add(r);
        Drawing drawing = factory.createDrawing();
        r.getContent().add(drawing);
        drawing.getAnchorOrInline().add(inline);
        return p;
    }


}

