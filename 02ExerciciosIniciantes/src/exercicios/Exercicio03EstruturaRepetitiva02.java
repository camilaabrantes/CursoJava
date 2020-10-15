package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio03EstruturaRepetitiva02 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		// 01. Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os �mpares de
		// 1 at� X, um valor por linha, inclusive o
		// X, se for o caso.
		/*
		 * int x = sc.nextInt();
		 * 
		 * for(int i = 1; i <= 1000; i ++) { if(i <= x) { if(i%2 != 0) {
		 * System.out.println(i); } } }
		 */

		// 02. Leia um valor inteiro N. Este valor ser� a quantidade de valores inteiros
		// X que ser�o lidos em seguida.
		// Mostre quantos destes valores X est�o dentro do intervalo [10,20] e quantos
		// est�o fora do intervalo, mostrando
		// essas informa��es conforme exemplo (use a palavra "in" para dentro do
		// intervalo, e "out" para fora do intervalo).

		/*
		 * int n = sc.nextInt();
		 * 
		 * int countIn = 0, countOut = 0;
		 * 
		 * for(int i = 0; i < n; i++) { int number = sc.nextInt();
		 * 
		 * if(number >= 10 && number <= 20 ) { countIn++; }else { countOut++; } }
		 * 
		 * System.out.println(countIn + " in"); System.out.println(countOut + " out");
		 */
		// 03. Leia 1 valor inteiro N, que representa o n�mero de casos de teste que vem
		// a seguir. Cada caso de teste consiste
		// de 3 valores reais, cada um deles com uma casa decimal. Apresente a m�dia
		// ponderada para cada um destes
		// conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo
		// valor tem peso 3 e o terceiro valor tem
		// peso 5.

		/*
		 * 
		 * int n = sc.nextInt(); double total = 0; double[] vetorMedia = new double[n];
		 * 
		 * for(int i = 0; i < vetorMedia.length; i++) { for(int j = 0; j < 3; j++) {
		 * total += sc.nextDouble(); } vetorMedia[i] = total/3; total = 0; }
		 * 
		 * for(int i = 0; i < vetorMedia.length; i++) { System.out.printf("%.2f\n",
		 * vetorMedia[i]); }
		 * 
		 */

		// 04. Fazer um programa para ler um n�mero N. Depois leia N pares de n�meros e
		// mostre a divis�o do primeiro pelo
		// segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao
		// impossivel".
		
		/*

		int n = sc.nextInt();
		double Divisao = 0;

		for (int i = 0; i < n; i++) {
			double a = sc.nextDouble();
			double b = sc.nextDouble();
			if (b != 0) {
				Divisao += a / b;
				System.out.println(Divisao);
				Divisao = 0;
			} else {
				System.out.println("divis�o imposs�vel");
			}

		}
		
		*/

		// 05. Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de
		// N = N * (N-1) * (N-2) * (N-3) * ... * 1.
		// Lembrando que, por defini��o, fatorial de 0 � 1.
		
		/*
		
		int n = sc.nextInt();
		int fatorial = 1;
		
		for(int i = n-1; i >= 0; i--) {
			fatorial *= n-i;
		}			
				
		System.out.println(fatorial);
		*/

		// 06. Ler um n�mero inteiro N e calcular todos os seus divisores.
		
		/*
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			if(n%i == 0) {
				System.out.println(i);
			}
		}
		*/

		// 07. Fazer um programa para ler um n�mero inteiro positivo N. O programa deve
		// ent�o mostrar na tela N linhas,
		// come�ando de 1 at� N. Para cada linha, mostrar o n�mero da linha, depois o
		// quadrado e o cubo do valor, conforme
		// exemplo.
		
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			System.out.println(i + " " + Math.pow(i, 2) + " " + Math.pow(i, 3));
		}

		sc.close();
	}
}
