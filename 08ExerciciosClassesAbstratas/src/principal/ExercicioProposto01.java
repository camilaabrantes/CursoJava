package principal;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import personal.Personal;
import personal.PessoaFisica;
import personal.PessoaJuridica;

public class ExercicioProposto01 {

	public static void main(String[] args) {
/*
Fazer um programa para ler os dados de N contribuintes (N fornecido pelo usu�rio), os quais
podem ser pessoa f�sica ou pessoa jur�dica, e depois mostrar o valor do imposto pago por cada um,
bem como o total de imposto arrecadado.
Os dados de pessoa f�sica s�o: nome, renda anual e gastos com sa�de. Os dados de pessoa jur�dica
s�o nome, renda anual e n�mero de funcion�rios. As regras para c�lculo de imposto s�o as
seguintes:
Pessoa f�sica: pessoas cuja renda foi abaixo de 20000.00 pagam 15% de imposto. Pessoas com
renda de 20000.00 em diante pagam 25% de imposto. Se a pessoa teve gastos com sa�de, 50%
destes gastos s�o abatidos no imposto.
Exemplo: uma pessoa cuja renda foi 50000.00 e teve 2000.00 em gastos com sa�de, o imposto
fica: (50000 * 25%) - (2000 * 50%) = 11500.00
Pessoa jur�dica: pessoas jur�dicas pagam 16% de imposto. Por�m, se a empresa possuir mais de 10
funcion�rios, ela paga 14% de imposto.
Exemplo: uma empresa cuja renda foi 400000.00 e possui 25 funcion�rios, o imposto fica:
400000 * 14% = 56000.00
 */
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		List<Personal> pagantes = new ArrayList<>();
		
		System.out.print("Entre com de pagadores de impostos: ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			System.out.println("Dados do pagador #" + i);
			System.out.print("Pessoa Fisica ou Juridica (f/j): ");
			char ch = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Rendimento anual: ");
			Double rendaAnual = sc.nextDouble();
			
			if(ch == 'f') {
				System.out.print("Gastos com saude: ");
				Double gastosSaude = sc.nextDouble();
				pagantes.add(new PessoaFisica(nome, rendaAnual, gastosSaude));
			}else {
				System.out.print("Numero de funcionarios: ");
				Integer numFuncionarios = sc.nextInt();
				pagantes.add(new PessoaJuridica(nome, rendaAnual, numFuncionarios));
			}
		}
		
		System.out.println("\nImpostos Pagos:");
		Double totalImpostos = 0.0;
		for(Personal person: pagantes) {
			System.out.println(person.getNome() + ": $" + String.format("%.2f", person.imposto()));
			totalImpostos += person.imposto();
		}
		
		System.out.print("\nTotal de Impostos: $" + String.format("%.2f",totalImpostos));
		sc.close();
	}

}
