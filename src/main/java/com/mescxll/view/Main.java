package main.java.com.mescxll.view;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application{
	private static Scene currencyConverterScene;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Currency Converter");
        
        FXMLLoader loader = new FXMLLoader(getClass().getResource("CurrencyConverter.fxml"));
        Parent parent = loader.load();
        currencyConverterScene = new Scene(parent);
        
        primaryStage.setScene(currencyConverterScene);
        primaryStage.centerOnScreen();
        primaryStage.show();
	}

}

//javac --module-path "C:\javafx-sdk-21.0.7\lib" --add-modules javafx.controls,javafx.fxml -d bin -cp "lib\gson-2.13.1.jar;src" src\main\java\com\mescxll\conversion\*.java src\main\java\com\mescxll\view\*.java
//java --module-path "C:\javafx-sdk-21.0.7\lib" --add-modules javafx.controls,javafx.fxml -cp "bin;lib\gson-2.13.1.jar" main.java.com.mescxll.view.Main

