package Principal;

import java.util.Locale;
import java.util.Scanner;

import entities.Empregado;

public class ExercicioFixacao02 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		/*
		02. Fazer um programa para ler os dados de um funcionário (nome, salário bruto e imposto). Em
		seguida, mostrar os dados do funcionário (nome e salário líquido). Em seguida, aumentar o
		salário do funcionário com base em uma porcentagem dada (somente o salário bruto é
		afetado pela porcentagem) e mostrar novamente os dados do funcionário. Use a classe
		projetada abaixo.
		 */
		
		Empregado empregado = new Empregado();
		
		System.out.println("Nome:");
		empregado.nome = sc.nextLine();		
		System.out.println("Salario Grosso:");
		empregado.salarioGrosso = sc.nextDouble();	
		System.out.println("Tax:");
		empregado.tax = sc.nextDouble();	
		System.out.println("Empregado: " + empregado);
		
		System.out.println("Qual porcentaem deseja aumentar o saalrio do funcionario " + empregado.nome + "?");
		double porcentagem = sc.nextDouble();
		empregado.IncreaseSalary(porcentagem);
		
		System.out.println("Updated data: " + empregado);
		
		sc.close();
		
	}

}
