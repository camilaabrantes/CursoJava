package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio01EstruturaSequencial {

	public static void main(String[] args) {
		//01. Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
		//mensagem explicativa, conforme exemplos.
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		
		//int a = sc.nextInt();
		//int b = sc.nextInt();
		
		//System.out.printf("SOMA: %d", a+b);
		
		//02. Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
		//casas decimais conforme exemplos.
		
		//double pi = 3.14159;
		
		//double raio = sc.nextDouble();
		
		//double area = pi*Math.pow(raio,2);
		
		//System.out.printf("A = %.2f", area);
		
		//03. Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
		//de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).
		
		//int A = sc.nextInt();
		//int B = sc.nextInt();
		//int C = sc.nextInt();
		//int D = sc.nextInt();
		
		//System.out.println("Diferença = " + (A * B - C * D));
		
		//04. Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
		//hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
		//decimais.
		
		//int number = sc.nextInt();
		//int horas = sc.nextInt();
		//double valorHora = sc.nextDouble();
		//double salario = (double) horas*valorHora;
		
		//System.out.println("NUMBER = " + number);
		//System.out.println("SALARY = U$ " + salario);
		
		//05. Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
		//código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.
		
		//int codigo1 = sc.nextInt();
		//int quantidade1 = sc.nextInt();
		//double valor1 = sc.nextDouble();
		//int codigo2 = sc.nextInt();
		//int quantidade2 = sc.nextInt();
		//double valor2 = sc.nextDouble();
		//double valorTotal = (double) quantidade1*valor1 + quantidade2*valor2;
		
		//System.out.printf("Valor a pagar: R$ %.2f", valorTotal);
		
		//06. Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
		//mostre:
		
		double A = sc.nextDouble();
		double B = sc.nextDouble();
		double C = sc.nextDouble();
		
		//	a) a área do triângulo retângulo que tem A por base e C por altura.
		
		double areaTriangulo = (A*C)/2;
		System.out.println("TRIANGULO: " + areaTriangulo);
		
		//	b) a área do círculo de raio C. (pi = 3.14159)
		
		double pi = 3.14159;
		
		double areaCirculo = pi*Math.pow(C,2);
		System.out.println("CIRCULO: " + areaCirculo);
		
		//	c) a área do trapézio que tem A e B por bases e C por altura.
		
		double areaTrapezio = ((A+B)*C)/2;
		System.out.println("TRAPEZIO: " + areaTrapezio);
		
		//	d) a área do quadrado que tem lado B.
		
		double areaQuadrado = Math.pow(B, 2);
		System.out.println("QUADRADO: " + areaQuadrado);
			
		
		//	e) a área do retângulo que tem lados A e B.
		
		double areaRetangulo = A*B;
		System.out.println("RETANGULO: " + areaRetangulo);
		
		sc.close();
	}

}
