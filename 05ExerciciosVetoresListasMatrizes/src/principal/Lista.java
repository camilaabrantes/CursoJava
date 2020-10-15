package principal;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import personal.Empregado;

public class Lista {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		/*
		 * 01. Fazer um programa para ler um número inteiro N e depois os dados (id,
		 * nome e salario) de N funcionários. Não deve haver repetição de id. Em
		 * seguida, efetuar o aumento de X por cento no salário de um determinado
		 * funcionário. Para isso, o programa deve ler um id e o valor X. Se o id
		 * informado não existir, mostrar uma mensagem e abortar a operação. Ao final,
		 * mostrar a listagem atualizada dos funcionários, conforme exemplos. Lembre-se
		 * de aplicar a técnica de encapsulamento para não permitir que o salário possa
		 * ser mudado livremente. Um salário só pode ser aumentado com base em uma
		 * operação de aumento por porcentagem dada.
		 */

		System.out.println("Quantos empregados deseja registar? ");
		int n = sc.nextInt();
		boolean flag = false;
		


		List<Empregado> empregado = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			System.out.println("Empregado #" + (i + 1));
			System.out.println("Id:");
			int id = sc.nextInt();			

			while(verificaId(id, empregado)) {
				System.out.println("Id já existente, digite novamente: ");
				id = sc.nextInt();
			}			
			
			sc.nextLine();
			System.out.println("Nome:");
			String nome = sc.nextLine();
			System.out.println("Salario:");
			double salario = sc.nextDouble();
			empregado.add(new Empregado(id, nome, salario));
		}

		System.out.println("Entre com o id do aumento:");
		int number = sc.nextInt();
		flag = false;			

		for (Empregado list : empregado) {
			if (list.getId() == number) {
				System.out.println("Entre com a porcentagem do aumento:");
				double aumento = sc.nextDouble();
				list.increaseSalario(aumento);
				flag = true;
			}
		}
		if (!flag) {
			System.out.println("Esse Id não existe!");
		}

		for (Empregado list : empregado) {
			System.out.println(list);
		}

		sc.close();

	}
	
	public static boolean verificaId(int Id, List<Empregado> lista) {
		
		for (Empregado listEmpregados : lista) {
			if (listEmpregados.getId() == Id) {				
				return true;
			}
		}
		return false;
	}
		
}
