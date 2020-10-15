package principal;

import java.util.Locale;
import java.util.Scanner;

import entities.Banco;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		/* Em um banco, para se cadastrar uma conta banc�ria, � necess�rio informar o n�mero da conta, o nome do
		titular da conta, e o valor de dep�sito inicial que o titular depositou ao abrir a conta. Este valor de dep�sito
		inicial, entretanto, � opcional, ou seja: se o titular n�o tiver dinheiro a depositar no momento de abrir sua
		conta, o dep�sito inicial n�o ser� feito e o saldo inicial da conta ser�, naturalmente, zero.
		*/
		
		Banco conta;
		
		System.out.println("Entre com o numero da conta: ");
		int numConta = sc.nextInt();		
		sc.nextLine();
		System.out.println("Entre com o nome do titular: ");
		String titular = sc.nextLine();		
		System.out.println("Ir� fazer um deposito inicial? (s/n)");
		char flag = sc.next().charAt(0);
		
		if(flag == 's') {
			System.out.println("Entre com deposito inicial: ");
			double depositoInicial = sc.nextDouble();
			conta = new Banco(numConta, titular, depositoInicial);
		}else {
			conta = new Banco(numConta, titular);
		}
		
		System.out.println("Dados da conta: ");
		System.out.println(conta);
		
		System.out.println("Entre com o valor do deposito: ");
		double deposito = sc.nextDouble();
		conta.Deposito(deposito);
		
		System.out.println("Atualiza��o da conta: ");
		System.out.println(conta);
		
		System.out.println("Entre com o valor do saque: ");
		double saque = sc.nextDouble();
		conta.Saque(saque);
		
		System.out.println("Atualiza��o da conta: ");
		System.out.println(conta);
		
		sc.close();

	}

}
