package Principal;

import java.util.Locale;
import java.util.Scanner;

import entities.CurrencyConverter;

public class ExercicioFixacao04Estatico {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		/*
		04. Fa�a um programa para ler a cota��o do d�lar, e depois um valor em d�lares a ser comprado por
		uma pessoa em reais. Informar quantos reais a pessoa vai pagar pelos d�lares, considerando ainda
		que a pessoa ter� que pagar 6% de IOF sobre o valor em d�lar. Criar uma classe CurrencyConverter
		para ser respons�vel pelos c�lculos.
		 */
		
		
		System.out.println("Qual o valor do dolar?");
		double cotacaoDolar = sc.nextDouble();		
		System.out.println("Quanto em dolar deseja comprar?");
		double valorDolar = sc.nextDouble();		
		System.out.println("Valor total a ser pago e reais: " + CurrencyConverter.amount(cotacaoDolar, valorDolar));
		
		
		sc.close();
	}

}
