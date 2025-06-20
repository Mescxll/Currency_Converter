package main.java.com.mescxll.conversion;

import java.util.Map;
import com.google.gson.annotations.SerializedName;

public record ConverterExchangeRate(
		@SerializedName("conversion_rates") Map<String, Double> conversionRates) {
	 
	public Double getRate(String currencyCode) {
		 return conversionRates().get(currencyCode);
	}
}
