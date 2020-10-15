package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio03EstruturaRepetitiva01 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
	
	//01. Escreva um programa que repita a leitura de uma senha at� que ela seja v�lida. Para cada leitura de senha
	//incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser
	//impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta � o valor 2002.
	
	/*
		int senha = sc.nextInt();
		
		while(senha != 2002) {
			System.out.println("Senha Inv�lida.");
			senha = sc.nextInt();
		}
		System.out.println("Acesso Permitido.");
		*/

	//02. Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema
	//cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo ser� encerrado quando pelo
	//menos uma de duas coordenadas for NULA (nesta situa��o sem escrever mensagem alguma).
		
	/*	
		
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		
		while(x !=0 && y != 0) {
			if(x>0 && y>0) {
				System.out.println("Q1");
			}else if(x<0 && y>0) {
				System.out.println("Q2");
			}else if(x<0 && y<0) {
				System.out.println("Q3");
			}else {
				System.out.println("Q4");
			}
			x = sc.nextDouble();
			y = sc.nextDouble();
		}
			
*/
		

	//03. Um Posto de combust�veis deseja determinar qual de seus produtos tem a prefer�ncia de seus clientes. Escreva
	//um algoritmo para ler o tipo de combust�vel abastecido (codificado da seguinte forma: 1.�lcool 2.Gasolina 3.Diesel
	//4.Fim). Caso o usu�rio informe um c�digo inv�lido (fora da faixa de 1 a 4) deve ser solicitado um novo c�digo (at�
	//que seja v�lido). O programa ser� encerrado quando o c�digo informado for o n�mero 4. Deve ser escrito a
	//mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combust�vel, conforme
	//exemplo.
		
		int opcao =sc.nextInt();
		int alcool = 0, gasolina = 0, diesel = 0;
		
		while(opcao != 4) {
			if(opcao == 1) {
				alcool++;
			}else if(opcao == 2) {
				gasolina ++;
			}else if(opcao ==3) {
				diesel++;
			}else {
				System.out.println("Op��o Inv�lida.");
				System.out.println("Digite novamente");
			}			
			opcao =sc.nextInt();
		}
		
		System.out.println("MUITO OBRIGADO");
		System.out.println("ALCOOL: " + alcool);
		System.out.println("GASOLINA: " + gasolina);
		System.out.println("DIESEL: "+ diesel);
	
	sc.close();

	}

}
