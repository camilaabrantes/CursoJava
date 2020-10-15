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
		 * 01. Fazer um programa para ler um n�mero inteiro N e depois os dados (id,
		 * nome e salario) de N funcion�rios. N�o deve haver repeti��o de id. Em
		 * seguida, efetuar o aumento de X por cento no sal�rio de um determinado
		 * funcion�rio. Para isso, o programa deve ler um id e o valor X. Se o id
		 * informado n�o existir, mostrar uma mensagem e abortar a opera��o. Ao final,
		 * mostrar a listagem atualizada dos funcion�rios, conforme exemplos. Lembre-se
		 * de aplicar a t�cnica de encapsulamento para n�o permitir que o sal�rio possa
		 * ser mudado livremente. Um sal�rio s� pode ser aumentado com base em uma
		 * opera��o de aumento por porcentagem dada.
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
				System.out.println("Id j� existente, digite novamente: ");
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
			System.out.println("Esse Id n�o existe!");
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
