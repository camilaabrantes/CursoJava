package notas_de_aula;

import java.util.Locale;
import java.util.Scanner;

public class debugForWhile {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int soma = 0;
		
		
		while(x != 0 ) {
			soma += x;
			x = sc.nextInt();
		}
		
		System.out.println(soma);

		
		for (int i=0; i<5; i++) {
			System.out.println("Valor de i: " + i);
			}
		

		sc.close();
	}
}