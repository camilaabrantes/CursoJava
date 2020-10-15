package Principal;

import java.util.Locale;
import java.util.Scanner;

import entities.Retangulo;

public class ExercicioFixacao01 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		/*
		 01. Fazer um programa para ler os valores da largura e altura
		de um retângulo. Em seguida, mostrar na tela o valor de
		sua área, perímetro e diagonal. Usar uma classe como
		mostrado no projeto ao lado.
		 */
		
		Retangulo retangulo = new Retangulo();
		
		System.out.println("Entre com altura e largura do retangulo:");
		retangulo.altura = sc.nextDouble();
		retangulo.largura = sc.nextDouble();
		
		System.out.println("Area: " + retangulo.Area());
		System.out.println("Perimetro: " + retangulo.Perimetro());
		System.out.println("Diagonal: " + retangulo.Diagonal());
				
				sc.close();

	}

}
