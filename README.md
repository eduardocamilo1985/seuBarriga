# Projeto de teste automático 🤖: Seu Barriga - Gerenciamento de contas 💰

<!--ts-->
* [Objetivo](#objetivo)
* [Tecnologias utilizadas](#tecnologia)
* [Utilização/estrutura](#utilizacao)
* [Casos de teste](#casos)
    * [Funcionalidade: Cadastro de usuários](#CadastrarConta)
* [Links para consulta](#link)
<!--te-->

# <a name="objetivo"></a>Objetivo

Este projeto tem como objetivo demonstrar os meus conhecimentos sobre a ferramenta **Cucumber** e sua integração 
com projetos de testes automatizados utilizando Selenium WebDriver JUnit e Java.

O projeto também utiliza a biblioteca docx4j para a criação também automatizada de
evidências de teste. Nesse projeto fiz o meu primeiro contato com o **Cucumber**

O sistema a ser testado é uma aplicação desenvolvida por Francisco Wagner para fins de treinamento
em cursos oferecidos pelo mesmo - [ver cursos](https://www.udemy.com/user/francisco-wagner-costa-aquino/). O nome do sistema 
é **Seu Barriga**. Essa aplicação realiza o controle de contas a pagar/receber.

## <a name="tecnologia"></a>Tecnologias utilizadas
![Cucumber](icon/cucumber.png)
![JUnit](icon/Junit.png)
![Selenium](icon/SeleniumWebDriver.png)
![java](icon/java.png)
![IntelliJ](icon/IntelliJ.png) 
![Maven](icon/Maven.png)



**Linguagem:** Java

**Frameworks:** Cucumber, JUnit, Selenium WebDriver 3.14

**Integrador/Compilador:** Maven

**Criação de arquivo docx:** Biblioteca docx4j

**IDE:** IntelliJ

## <a name="utilizacao"></a>Utilização/estrutura

Realizar o download do projeto (via git clone ou arquivo zip).

Importar o projeto na sua IDE de desenvolvimento favorita

**Estrutura do projeto**

A estrutura principal do projeto está localizada no diretório src/main/java. Os principais packages são:

* features - Contém os casos de teste
* Steps — Contém as implementações dos casos de teste
* estrutura — Contém as classes estruturais do projeto (base para outras classes).
* page — Contém o mapeamento dos elementos das páginas.

O projeto utiliza os conceitos de DSL e Page Object

**Explicando algumas classes**

A classe **Basic** contém toda a parte Selenium utilizada. 

A classe **EvidenciaWord** é responsável por criar o arquivo docx (arquivo Word) que servirá para evidenciar
os testes realizados. As evidências de testes serão geradas na pasta raiz do projeto.

A **package Page** contém todo o mapeamento de elementos da aplicação. Para cada página da aplicação web,
existe uma classe chamada NomePaginaPage que estende da classe Basic. Exemplo página da criação da conta = ContaPage.  

**Explicando as features criadas** 

InserirConta.feature: O arquivo está bem simples e contém apenas as palavras chaves mais básicas. 
Daria para simplificar um pouco, mas para fins de demonstração para quem tá iniciando é um começo bem didático 😉
No resumo, o usuário realizar login na aplicação web e cadastra nome de contas. 

InserirMovimentacao.feature: O arquivo está um pouco mais sofisticado, utiliza conceitos mais avançados.
No resumo, o usuário realiza login na aplicação web e cadastra movimentações de contas.
Uma de despesa e outra de receita

## <a name="casos"></a>Casos de teste

### Funcionalidade: Cadastro de contas
### Funcionalidade: Cadastro de movimentação

## <a name="link"></a>Links para consulta

[Seu Barriga](https://seubarriga.wcaquino.me/)

[Documentação Selenium](https://www.selenium.dev/documentation/webdriver/)

[Documentação Cucumber](https://cucumber.io/docs/guides/)

[Documentação biblioteca docx4](https://www.docx4java.org/trac/docx4j)
