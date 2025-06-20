# Currency Converter - Conversor de Moedas
Aplicação de conversão de moedas desenvolvida em Java como parte do programa **ONE - Oracle Next Education** da Alura. 

O projeto utiliza **JavaFX** para interface gráfica, **Gson** para leitura de dados JSON e consome a **ExchangeRate API** para obter as cotações em tempo real.
É necessário ter conexão com a internet para que as conversões funcionem corretamente. **Desenvolvido por:** Maria Eduarda Campos.

💸 Funcionalidades de conversão:

- BRL ⇄ USD
- BRL ⇄ EUR
- USD ⇄ ARS
- EUR ⇄ BRL
- USD ⇄ ARS
- ARS ⇄ USD

**Captura de tela da Aplicação:**     
  
![conversor](https://github.com/user-attachments/assets/279f4883-e627-4407-bba7-42fd9acfc140)


## 🛠 Tecnologias Utilizadas
  
  - [Java 21](https://www.oracle.com/br/java/technologies/javase/jdk21-archive-downloads.html)
  - [JavaFX 21](https://openjfx.io/)
  - [Gson (Google JSON)](https://github.com/google/gson)
  - [ExchangeRate API](https://www.exchangerate-api.com/)
  - [Scene Builder](https://gluonhq.com/products/scene-builder/)
  - [Eclipse IDE](https://eclipseide.org/)

## 💻 Como Executar (cmd)

  Compile:
  ```
  javac --module-path "caminho_do_javafx" --add-modules javafx.controls,javafx.fxml -d bin -cp "lib\jar_gson;src" src\main\java\com\mescxll\conversion\*.java src\main\java\com\mescxll\view\*.java
  ```
  Execute:
  ```
  java --module-path "caminho_do_javafx" --add-modules javafx.controls,javafx.fxml -cp "bin;lib\jar_gson" main.java.com.mescxll.view.Main
  ```

