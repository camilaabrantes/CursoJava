package principal;

import java.util.Locale;
import java.util.Scanner;

public class Matriz {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		/*
		01. Fazer um programa para ler dois n�meros inteiros M e N, e depois ler
		uma matriz de M linhas por N colunas contendo n�meros inteiros,
		podendo haver repeti��es. Em seguida, ler um n�mero inteiro X que
		pertence � matriz. Para cada ocorr�ncia de X, mostrar os valores �
		esquerda, acima, � direita e abaixo de X, quando houver, conforme
		exemplo.
		 */
		
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		int[][] matriz = new int[m][n];
		
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Digite o number: ");
		int number = sc.nextInt();
		
		
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				if(matriz[i][j] == number) {
					System.out.println("Position " + i + "," + j + ":");
					
					if(j != 0) {
						System.out.println("Left: " + matriz[i][j-1]);
					}
					if(j < n-1) {
						System.out.println("Right: " + matriz[i][j+1]);
					}
					if(i != 0) {
						System.out.println("Up: " + matriz[i-1][j]);
					}
					if(i < m-1) {
						System.out.println("Down: " + matriz[i+1][j]);
					}					
					
				}
			}
		}	
				
		sc.close();
		

	}


}
