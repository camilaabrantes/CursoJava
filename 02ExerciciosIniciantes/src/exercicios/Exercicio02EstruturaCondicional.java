package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio02EstruturaCondicional {
	public static void main(String[] args) {
	
	Locale.setDefault(Locale.US);
	
	Scanner sc = new Scanner(System.in);
	
	//01. Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.
	
	//int x = sc.nextInt();

	/*
	if(x<0) {
		System.out.println("NEGATIVO");
	}else {
		System.out.println("NÃO NEGATIVO");
	}
	*/

	//02. Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.
	
	/*
	if(x%2 == 0) {
		System.out.println("PAR");
	}else {
		System.out.println("ÍMPAR");
	}
	*/

	//03. Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
	//Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em
	//ordem crescente ou decrescente.

	/*
	int A = sc.nextInt();
	int B = sc.nextInt();
	
	if(A>B) {
		if(A%B == 0) {
			System.out.println("São Múltiplos");
		}else {
			System.out.println("Não São Múltiplos");
		}
	}else {
		if(B%A == 0) {
			System.out.println("São Múltiplos");
		}else {
			System.out.println("Não São Múltiplos");
		}
		
	}
	*/
	
	//04.Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
	//começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.
	
	/*
	int horaInicio = sc.nextInt();
	int horaFinal = sc.nextInt();
	int tempoTotal = 0;
	
	if(horaInicio == horaFinal) {
		tempoTotal = 24;
	}else if(horaFinal < horaInicio){
		tempoTotal = 24-horaInicio+horaFinal;
		
	}else {
		tempoTotal = horaFinal-horaInicio;
	}
	
		String mensagem = "O JOGO DUROU " + Integer.toString(tempoTotal) + " HORA";
		if(tempoTotal > 1) {
			mensagem = mensagem.concat("(S)");
		}
		
		System.out.println(mensagem);
	*/

	//05. Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
	//seguir, calcule e mostre o valor da conta a pagar.
		
	/*
	int codigo = sc.nextInt();
		int quantity =0;
		if(codigo > 0 && codigo < 6) {
			quantity = sc.nextInt();
		}		
		double preco = 0.0;
		String mensagem = "Total: R$ ";
		
		switch(codigo) {
		case 1:
			preco = (double) quantity*4.00; 
			mensagem = mensagem.concat(Double.toString(preco));
			break;
		case 2:
			preco = (double) quantity*4.50; 
			mensagem = mensagem.concat(Double.toString(preco));
			break;
		case 3:
			preco = (double) quantity*5.00; 
			mensagem = mensagem.concat(Double.toString(preco));
			break;
		case 4:
			preco = (double) quantity*2.00; 
			mensagem = mensagem.concat(Double.toString(preco));
			break;
		case 5:
			preco = (double) quantity*1.50; 
			mensagem = mensagem.concat(Double.toString(preco));
			break;
		default:
			mensagem = "Codigo Inválido";
			break;
		
		}
		
		System.out.println(mensagem);
		
	*/

	//06. Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos
	//seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. Obviamente se o valor não estiver em
	//nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”.

	
	/*
	double valor = sc.nextDouble();
	
	if(valor >= 0 && valor <= 100) {
		if (valor<=25) {
			System.out.println("Intervalo [0,25]");
		}else if(valor<=50) {
			System.out.println("Intervalo (25, 50]");
		}else if(valor<=75) {
			System.out.println("Intervalo (50,75]");
		}else {
			System.out.println("Intervalo (75, 100]");
		}
	}else {
		System.out.println("Fora de intervalo");
	}
	*/
	
	//07. Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas
	//de um ponto em um plano. A seguir, determine qual o quadrante ao qual pertence o
	//ponto, ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0).

   /*
	double x = sc.nextDouble();
	double y = sc.nextDouble();
	
	if(x != 0 && y != 0) {
		if(x>0 && y>0) {
			System.out.println("Q1");
		}else if(x<0 && y>0) {
			System.out.println("Q2");
		}else if(x<0 && y<0) {
			System.out.println("Q3");
		}else {
			System.out.println("Q4");
		}
	}else if(x == 0 && y == 0) {
		System.out.println("Origem");
	}else if(x == 0) {
		System.out.println("Eixo Y");
	}else {
		System.out.println("Eixo X");
	}
	
	*/
	
	//08. Em um país imaginário denominado Lisarb, todos os habitantes ficam felizes em pagar seus impostos, pois sabem
	//que nele não existem políticos corruptos e os recursos arrecadados são utilizados em benefício da população, sem
	//qualquer desvio. A moeda deste país é o Rombus, cujo símbolo é o R$.
	
	
	double salario = sc.nextDouble();
	double imposto = 0;
	String mensagem = "R$ ";
	
	
	
	if(salario > 2000.00) {
		if(salario <= 3000.00) {
			imposto = (salario - 2000.00) * 0.08;
		}else if(salario <= 4500.00) {
			imposto = ((salario - 2000.00) * 0.08) + ((salario - 3000.00) * 0.18);
		}else {
			imposto = ((salario - 2000.00) * 0.08) + ((salario - 3000.00) * 0.18) + ((salario - 4500.00) * 0.28);	
		}
		mensagem = mensagem.concat(Double.toString(imposto));
	}else {
		mensagem = "Isento";
	}
	
	System.out.println(mensagem);
	
	}
}
