package application;

import java.util.Scanner;

import entities.PrintService;

public class Program {

	public static void main(String[] args) {
		/*
		 Deseja-se fazer um programa que leia uma quantidade N, e depois N números
		inteiros. Ao final, imprima esses números de forma organizada conforme
		exemplo. Em seguida, informar qual foi o primeiro valor informado.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		PrintService<Integer> printService = new PrintService<>();
		
		System.out.print("Quanto valores? ");
		int qNum = sc.nextInt();
		
		for(int i=0; i<qNum; i++) {
			printService.addValue(sc.nextInt());
		}
		
		System.out.println();
		
		System.out.println("First: " + printService.firt());
		
		printService.print();		
		
		sc.close();

	}

}
