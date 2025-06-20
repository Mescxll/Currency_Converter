package main.java.com.mescxll.conversion;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Converter {
	private static Gson gson = new GsonBuilder()
			.setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).create();
	private static ConverterExchangeRate rate;
	
	private static ConverterExchangeRate search(String busca) throws IOException, InterruptedException {
		
		String url_str = "https://v6.exchangerate-api.com/v6/c146f5c2c330ea850ba189c7/latest/";
		
		HttpClient client = HttpClient.newHttpClient();
		HttpRequest request = HttpRequest.newBuilder()
				.uri(URI.create(url_str + busca))
				.build();
		HttpResponse<String> response = client
				.send(request, BodyHandlers.ofString());
		String json = response.body();
		
		rate = gson.fromJson(json, ConverterExchangeRate.class);
		return rate;
	}
	
	public static double getRateARS_USD(String code) throws IOException, InterruptedException {
		ConverterExchangeRate c = search("ARS");
		return c.getRate("USD");
	}
	
	public static double getRateBRL_EUR(String code) throws IOException, InterruptedException {
        ConverterExchangeRate c = search("BRL");
        return c.getRate("EUR");
    }

    public static double getRateBRL_USD(String code) throws IOException, InterruptedException {
        ConverterExchangeRate c = search("BRL");
        return c.getRate("USD");
    }

    public static double getRateEUR_BRL(String code) throws IOException, InterruptedException {
        ConverterExchangeRate c = search("EUR");
        return c.getRate("BRL");
    }

    public static double getRateUSD_ARS(String code) throws IOException, InterruptedException {
        ConverterExchangeRate c = search("USD");
        return c.getRate("ARS");
    }

    public static double getRateUSD_BRL(String code) throws IOException, InterruptedException {
        ConverterExchangeRate c = search("USD");
        return c.getRate("BRL");
    }
}
