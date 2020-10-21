package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;
import entities.exception.DomainException;

public class ExercicioProposto {

	public static void main(String[] args) {
		/*
		 Fazer um programa para ler os dados de uma conta bancária e depois realizar um
		saque nesta conta bancária, mostrando o novo saldo. Um saque não pode ocorrer
		ou se não houver saldo na conta, ou se o valor do saque for superior ao limite de
		saque da conta. Implemente a conta bancária conforme projeto abaixo:
		 */
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner (System.in);
		
		
		System.out.println("Entre com os dados da conta: ");
		System.out.print("Numero: ");
		int numero = sc.nextInt();
		sc.nextLine();
		System.out.print("Titular: ");
		String titular = sc.nextLine();
		System.out.print("Saldo Inicial: ");
		Double saldoInicial = sc.nextDouble();
		System.out.print("Limite de saque: ");
		Double limiteSaque = sc.nextDouble();
		
		Account conta = new Account(numero, titular, saldoInicial, limiteSaque);
		
		System.out.println();
		
		try {
			
			System.out.print("Entre com o valor de saque: ");
			conta.saque(sc.nextDouble());
			System.out.print("Novo saldo: ");
			System.out.println(conta.getSaldo());
		}
		catch(DomainException e) {
			System.out.println("Saque Error: " + e.getMessage());
		}
		catch(Exception e) {
			System.out.println("Erro não mapeado!");
		}
		
		sc.close();
		
		//
	}

}
