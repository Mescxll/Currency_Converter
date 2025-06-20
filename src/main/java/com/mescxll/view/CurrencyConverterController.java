package main.java.com.mescxll.view;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import main.java.com.mescxll.conversion.Converter;

public class CurrencyConverterController implements Initializable{
	@FXML private TextField fieldARS_USD;
    @FXML private TextField fieldBRL_EUR;
    @FXML private TextField fieldBRL_USD;
    @FXML private TextField fieldEUR_BRL;
    @FXML private TextField fieldUSD_ARS;
    @FXML private TextField fieldUSD_BRL;
	
	@FXML private Label resultARS_USD;
    @FXML private Label resultBRL_EUR;
    @FXML private Label resultBRL_USD;
    @FXML private Label resultEUR_BRL;
    @FXML private Label resultUSD_ARS;
    @FXML private Label resultUSD_BRL;

	@Override
	public void initialize(URL url, ResourceBundle rb) {
		fieldARS_USD.setStyle("-fx-text-fill: #143D60 !important; -fx-background-color:  #a0c878 !important;");
		fieldBRL_EUR.setStyle("-fx-text-fill: #143D60 !important; -fx-background-color:  #a0c878 !important;");
		fieldBRL_USD.setStyle("-fx-text-fill: #143D60 !important; -fx-background-color:  #a0c878 !important;");
		fieldEUR_BRL.setStyle("-fx-text-fill: #143D60 !important; -fx-background-color:  #a0c878 !important;");
		fieldUSD_ARS.setStyle("-fx-text-fill: #143D60 !important; -fx-background-color:  #a0c878 !important;");
		fieldUSD_BRL.setStyle("-fx-text-fill: #143D60 !important; -fx-background-color:  #a0c878 !important;");
		
		fieldARS_USD.setOnAction(e -> callConverter());
	    fieldBRL_EUR.setOnAction(e -> callConverter());
	    fieldBRL_USD.setOnAction(e -> callConverter());
	    fieldEUR_BRL.setOnAction(e -> callConverter());
	    fieldUSD_ARS.setOnAction(e -> callConverter());
	    fieldUSD_BRL.setOnAction(e -> callConverter());
	}

	private void callConverter() {
		try {
	        converter();
	    } catch (IOException e) {
	        e.printStackTrace();
	    } catch (InterruptedException e) {
	    	e.printStackTrace();
	    }
	}

	private void converter() throws IOException, InterruptedException {
		double arsUsdInput = 0.0;
		double brlEurInput = 0.0;
		double brlUsdInput = 0.0;
		double eurBrlInput = 0.0;
		double usdArsInput = 0.0;
		double usdBrlInput = 0.0;
		
		try {
			String arsUsdValueStr = fieldARS_USD.getText().trim();
			if (!arsUsdValueStr.isEmpty()) { 
		        arsUsdInput = Double.parseDouble(arsUsdValueStr);
		        resultARS_USD.setText("" + (Converter.getRateARS_USD("ARS") * arsUsdInput));
		    } else {
                resultARS_USD.setText("0.0");
            }

		    String brlEurValueStr = fieldBRL_EUR.getText().trim();
		    if (!brlEurValueStr.isEmpty()) {
		        brlEurInput = Double.parseDouble(brlEurValueStr);
		        resultBRL_EUR.setText("" + (Converter.getRateBRL_EUR("BRL") * brlEurInput));
		    } else {
                resultBRL_EUR.setText("0.0");
            }

		    String brlUsdValueStr = fieldBRL_USD.getText().trim();
		    if (!brlUsdValueStr.isEmpty()) {
		        brlUsdInput = Double.parseDouble(brlUsdValueStr);
		        resultBRL_USD.setText("" + (Converter.getRateBRL_USD("BRL") * brlUsdInput));
		    } else {
                resultBRL_USD.setText("0.0");
            }

		    String eurBrlValueStr = fieldEUR_BRL.getText().trim();
		    if (!eurBrlValueStr.isEmpty()) {
		        eurBrlInput = Double.parseDouble(eurBrlValueStr);
		        resultEUR_BRL.setText("" + (Converter.getRateEUR_BRL("EUR") * eurBrlInput));
		    } else {
                resultEUR_BRL.setText("0.0");
            }

		    String usdArsValueStr = fieldUSD_ARS.getText().trim();
		    if (!usdArsValueStr.isEmpty()) {
		        usdArsInput = Double.parseDouble(usdArsValueStr);
		        resultUSD_ARS.setText("" + (Converter.getRateUSD_ARS("USD") * usdArsInput));
		    } else {
                resultUSD_ARS.setText("0.0");
            }

		    String usdBrlValueStr = fieldUSD_BRL.getText().trim();
		    if (!usdBrlValueStr.isEmpty()) {
		        usdBrlInput = Double.parseDouble(usdBrlValueStr);
		        resultUSD_BRL.setText("" + (Converter.getRateUSD_BRL("USD") * usdBrlInput));
		    } else {
                resultUSD_BRL.setText("0.0");
            }
		} catch (NumberFormatException e) {
		    System.err.println("Erro: Entrada inválida em um dos campos de texto. Por favor, digite apenas números válidos.");
		}	
	}  
}