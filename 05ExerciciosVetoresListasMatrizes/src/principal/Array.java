package principal;

import java.util.Locale;
import java.util.Scanner;

import personal.Inquilino;

public class Array {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		/*
		 A dona de um pensionato possui dez quartos para alugar para estudantes,
		sendo esses quartos identificados pelos números 0 a 9.
		Fazer um programa que inicie com todos os dez quartos vazios, e depois
		leia uma quantidade N representando o número de estudantes que vão
		alugar quartos (N pode ser de 1 a 10). Em seguida, registre o aluguel dos
		N estudantes. Para cada registro de aluguel, informar o nome e email do
		estudante, bem como qual dos quartos ele escolheu (de 0 a 9). Suponha
		que seja escolhido um quarto vago. Ao final, seu programa deve imprimir
		um relatório de todas ocupações do pensionato, por ordem de quarto,
		conforme exemplo.
		 */
		
		System.out.println("How many rooms will be rented?");
		int n = sc.nextInt();
		
		Inquilino vect[] = new Inquilino[10];
		
		for(int i = 0; i<n; i++) {
			sc.nextLine();
			System.out.println("Rent #" + (i+1));
			System.out.println("Nome: ");
			String nome = sc.nextLine();
			System.out.println("Email: ");
			String email = sc.next();
			System.out.println("Room: ");
			int quarto = sc.nextInt();
			
			vect[quarto] = new Inquilino(nome, email);
		}
		
		System.out.println("Busy rooms:");
		for(int i = 0; i<vect.length; i++) {
			if(vect[i] != null) {				
				System.out.println(i + ": " + vect[i]);
			}
		}
				
		sc.close();

	}

}
