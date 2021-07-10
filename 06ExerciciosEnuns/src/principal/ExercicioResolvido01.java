package principal;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Departamento;
import entities.HourContract;
import entities.Worker;
import entities.enuns.OrderStatus;
import entities.enuns.WorkerLevel;

public class ExercicioResolvido01 {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		/*
		Ler os dados de um trabalhador com N contratos (N fornecido pelo usuário). Depois, solicitar
		do usuário um mês e mostrar qual foi o salário do funcionário nesse mês
		 */
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		

		System.out.println("Entre com o nome do departamento:");
		String nomeDepartamento = sc.nextLine();		
		System.out.println("Entre com os dados do trabalhador:");		
		System.out.println("Nome:");
		String nome =sc.nextLine();
		System.out.println("Level:");
		WorkerLevel level = WorkerLevel.valueOf(sc.next());
		System.out.println("Salario Base:");
		Double salarioBase =sc.nextDouble();
		Worker worker  = new Worker(nome, level, salarioBase, new Departamento(nomeDepartamento));
			
		System.out.println("Quantos contratos tem esse trabalhador?");
		int quantidadeContratos = sc.nextInt();
		
		HourContract contrato;
		
		for(int i = 0; i < quantidadeContratos; i++) {
			System.out.println("Entre com as informações do contrato #" + (i+1));
			System.out.println("Date (DD/MM/YYY)");	
			Date date = sdf.parse(sc.next());
			System.out.println("Valor por hora:");
			Double valorPorHora = sc.nextDouble();
			System.out.println("Duração (horas):");
			int horas = sc.nextInt();
			contrato = new HourContract(date, valorPorHora, horas);
			worker.addContratos(contrato);
		}
		
		System.out.println("Entre com o mês e ano para calcular o total mensal (MM/YYYY):");
		String data = sc.next();
		int mes = Integer.parseInt(data.substring(0,2));
		int ano = Integer.parseInt(data.substring(3));
		System.out.println(mes);
		System.out.println(ano);	
		double salarioTotal = worker.income(mes, ano);
		
		System.out.println("Nome: " + worker.getNome());
		System.out.println("Departamento: " + worker.getDepartamento().getNome());
		System.out.println("nivel: " + worker.getLevel());
		System.out.println("Salario total de " + data + ": " + salarioTotal);
		
		
		sc.close();

	}

}
