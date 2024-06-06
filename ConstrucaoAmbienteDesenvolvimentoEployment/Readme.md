# README

Este repositório contém informações e instruções relacionadas ao ambiente de desenvolvimento e deployment para aplicações Java, incluindo a integração com servidores de aplicação e bancos de dados.

## Conteúdo

- **Instalação do VSCode:** Passos para instalar o Visual Studio Code (VSCode), uma IDE leve e poderosa para desenvolvimento de software, adequada para desenvolvimento Java.https://code.visualstudio.com/download


## Desenvolvimento de uma aplicação Spring Boot no Visual Studio Code

1. Instale a extensão Spring Boot Tools no VS Code.

2. Crie um novo projeto Spring Boot pressionando \`Ctrl+Shift+P\`, digitando \`Spring Initializr\` e selecionando \`Spring Initializr: Generate a Maven Project\`. Siga as instruções para criar seu projeto.

3. Abra o projeto no VS Code usando o comando \"File -> Open Folder...\".

4. Desenvolva sua aplicação. Você pode criar controladores Spring MVC na pasta \`src/main/java\` e você pode criar arquivos HTML na pasta \`src/main/resources/templates\`.

5. Execute sua aplicação usando o comando \`./mvnw spring-boot:run\` no terminal, ou use a extensão Spring Boot Tools para executar sua aplicação diretamente do VS Code.

Adicione as dependências necessárias: Para usar JSF com Spring Boot, você precisará adicionar as dependências JSF ao seu arquivo pom.xml. Aqui está um exemplo de como você pode fazer isso:

<dependency>
    <groupId>org.joinfaces</groupId>
    <artifactId>jsf-spring-boot-starter</artifactId>
    <version>4.3.1</version>
</dependency>
Configure o JSF: Você precisará configurar o JSF para trabalhar com Spring Boot. Você pode fazer isso adicionando as seguintes propriedades ao seu arquivo application.properties:

joinfaces.jsf.primefaces-theme=none
joinfaces.jsf.project-stage=Development


Desenvolva sua aplicação: Agora você pode começar a desenvolver sua aplicação. Você pode criar arquivos XHTML na pasta src/main/resources/META-INF/resources, e você pode criar classes Java na pasta src/main/java. Em um projeto MVC, você terá Modelos (classes Java que representam os dados), Visualizações (páginas XHTML que apresentam os dados) e Controladores (classes Java que lidam com a lógica de negócios).

Execute sua aplicação: Para executar sua aplicação, você pode usar o comando ./mvnw spring-boot:run no terminal, ou você pode usar a extensão Spring Boot Tools para executar sua aplicação diretamente do VS Code.

- **Instalação do Servidor de Aplicação - WildFly:** Instruções detalhadas sobre como instalar o WildFly, anteriormente conhecido como JBoss, um servidor de aplicação Java EE. [Clique aqui para começar](https://www.wildfly.org/get-started/)

Instale a extensão "Server Connector" no Visual Studio Code. Esta extensão suporta WildFly e muitos outros servidores.

Após a instalação, você verá um novo ícone de "Servidor" na barra lateral. Clique nele.

Clique no sinal de "+" para adicionar um novo servidor. Selecione "WildFly".

Navegue até a pasta onde você instalou o WildFly e selecione-a.

Agora, você deve ver o WildFly listado em seus servidores. Você pode clicar com o botão direito do mouse nele para iniciar, parar, reiniciar ou remover o servidor.

Para implantar sua aplicação no WildFly, você pode clicar com o botão direito do mouse no servidor e selecionar "Adicionar ou remover...". Em seguida, selecione o arquivo WAR de sua aplicação.



- **Integração WildFly-MySQL:** Guia passo a passo sobre como integrar o WildFly com o banco de dados MySQL usando JDBC, incluindo configurações no servidor de aplicação e no banco de dados.

- **Integração Glassfish-MySQL:** Instruções para integrar o Glassfish com o MySQL através do NetBeans, permitindo a comunicação entre a aplicação e o banco de dados.

## Como Utilizar

1. Clone este repositório para sua máquina local.
2. Siga as instruções fornecidas em cada seção para configurar seu ambiente de desenvolvimento e deployment.
3. Adapte as instruções conforme necessário para atender às suas necessidades específicas.
4. Contribua com quaisquer melhorias ou correções enviando pull requests para este repositório.

## Contribuição

Sinta-se à vontade para contribuir com este repositório através de pull requests para adicionar mais informações, corrigir erros ou melhorar a clareza das instruções.

Se você tiver dúvidas ou precisar de ajuda, abra uma issue e teremos prazer em ajudar.

