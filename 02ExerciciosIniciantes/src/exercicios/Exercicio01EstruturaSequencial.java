package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio01EstruturaSequencial {

	public static void main(String[] args) {
		//01. Fa�a um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses n�meros com uma
		//mensagem explicativa, conforme exemplos.
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		
		//int a = sc.nextInt();
		//int b = sc.nextInt();
		
		//System.out.printf("SOMA: %d", a+b);
		
		//02. Fa�a um programa para ler o valor do raio de um c�rculo, e depois mostrar o valor da �rea deste c�rculo com quatro
		//casas decimais conforme exemplos.
		
		//double pi = 3.14159;
		
		//double raio = sc.nextDouble();
		
		//double area = pi*Math.pow(raio,2);
		
		//System.out.printf("A = %.2f", area);
		
		//03. Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferen�a do produto
		//de A e B pelo produto de C e D segundo a f�rmula: DIFERENCA = (A * B - C * D).
		
		//int A = sc.nextInt();
		//int B = sc.nextInt();
		//int C = sc.nextInt();
		//int D = sc.nextInt();
		
		//System.out.println("Diferen�a = " + (A * B - C * D));
		
		//04. Fazer um programa que leia o n�mero de um funcion�rio, seu n�mero de horas trabalhadas, o valor que recebe por
		//hora e calcula o sal�rio desse funcion�rio. A seguir, mostre o n�mero e o sal�rio do funcion�rio, com duas casas
		//decimais.
		
		//int number = sc.nextInt();
		//int horas = sc.nextInt();
		//double valorHora = sc.nextDouble();
		//double salario = (double) horas*valorHora;
		
		//System.out.println("NUMBER = " + number);
		//System.out.println("SALARY = U$ " + salario);
		
		//05. Fazer um programa para ler o c�digo de uma pe�a 1, o n�mero de pe�as 1, o valor unit�rio de cada pe�a 1, o
		//c�digo de uma pe�a 2, o n�mero de pe�as 2 e o valor unit�rio de cada pe�a 2. Calcule e mostre o valor a ser pago.
		
		//int codigo1 = sc.nextInt();
		//int quantidade1 = sc.nextInt();
		//double valor1 = sc.nextDouble();
		//int codigo2 = sc.nextInt();
		//int quantidade2 = sc.nextInt();
		//double valor2 = sc.nextDouble();
		//double valorTotal = (double) quantidade1*valor1 + quantidade2*valor2;
		
		//System.out.printf("Valor a pagar: R$ %.2f", valorTotal);
		
		//06. Fazer um programa que leia tr�s valores com ponto flutuante de dupla precis�o: A, B e C. Em seguida, calcule e
		//mostre:
		
		double A = sc.nextDouble();
		double B = sc.nextDouble();
		double C = sc.nextDouble();
		
		//	a) a �rea do tri�ngulo ret�ngulo que tem A por base e C por altura.
		
		double areaTriangulo = (A*C)/2;
		System.out.println("TRIANGULO: " + areaTriangulo);
		
		//	b) a �rea do c�rculo de raio C. (pi = 3.14159)
		
		double pi = 3.14159;
		
		double areaCirculo = pi*Math.pow(C,2);
		System.out.println("CIRCULO: " + areaCirculo);
		
		//	c) a �rea do trap�zio que tem A e B por bases e C por altura.
		
		double areaTrapezio = ((A+B)*C)/2;
		System.out.println("TRAPEZIO: " + areaTrapezio);
		
		//	d) a �rea do quadrado que tem lado B.
		
		double areaQuadrado = Math.pow(B, 2);
		System.out.println("QUADRADO: " + areaQuadrado);
			
		
		//	e) a �rea do ret�ngulo que tem lados A e B.
		
		double areaRetangulo = A*B;
		System.out.println("RETANGULO: " + areaRetangulo);
		
		sc.close();
	}

}
