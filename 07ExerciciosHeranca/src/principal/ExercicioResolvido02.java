package principal;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Empregado;
import entities.EmpregadoTerceirizado;

public class ExercicioResolvido02 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		/*
		 Uma empresa possui funcion�rios pr�prios e terceirizados.
		Para cada funcion�rio, deseja-se registrar nome, horas
		trabalhadas e valor por hora. Funcion�rios terceirizado
		possuem ainda uma despesa adicional.
		O pagamento dos funcion�rios corresponde ao valor da hora
		multiplicado pelas horas trabalhadas, sendo que os
		funcion�rios terceirizados ainda recebem um b�nus
		correspondente a 110% de sua despesa adicional.
		Fazer um programa para ler os dados de N funcion�rios (N
		fornecido pelo usu�rio) e armazen�-los em uma lista. Depois
		de ler todos os dados, mostrar nome e pagamento de cada
		funcion�rio na mesma ordem em que foram digitados.
		 */
		
		List<Empregado> empregados = new ArrayList<>();
		
		System.out.println("Entre com o numero de empregados:");
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			System.out.println("Entre com o emregado numero #" + (i+1));
			System.out.println("Terceirizado (y/n)?");
			char flag = sc.next().charAt(0);
			sc.nextLine();
			System.out.println("Nome:");
			String nome = sc.nextLine();
			System.out.println("Horas:");
			int hours = sc.nextInt();
			System.out.println("Valor por hora:");
			Double valorPorHora = sc.nextDouble();			
			if(flag =='y') {
				System.out.println("Taxa adicional:");
				Double taxaAdicional = sc.nextDouble();
				empregados.add(new EmpregadoTerceirizado(nome, hours, valorPorHora, taxaAdicional));
			}else {
				empregados.add(new Empregado(nome, hours, valorPorHora));
			}
		}		
		
		System.out.println("PAYMENTS");
		for(Empregado list: empregados) {
			System.out.println(list);			
		}

		
		sc.close();
	}

}
