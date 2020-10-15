package entities;

public class CurrencyConverter {
		
	public static final double IOF = 0.06;
	public static double amount(double cotacaoDolar, double valorDolar) {
		return cotacaoDolar*valorDolar*(1 + IOF);
	}

}
