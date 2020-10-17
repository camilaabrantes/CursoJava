package principal;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Circulo;
import entities.Retangulo;
import entities.Shape;
import entities.enums.Color;

public class ExercicioResolvido01 {

	public static void main(String[] args) {
		/*
		Fazer um programa para ler os dados de N figuras (N fornecido
		pelo usuário), e depois mostrar as áreas destas figuras na
		mesma ordem em que foram digitadas.
		 */
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		List<Shape> formas = new ArrayList<>();
		
		System.out.print("Entre com o numero de formas: ");
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			System.out.println("Dados da forma #" + (i+1));
			System.out.print("Retangulo ou Circulo (r/c)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Cor (BLACK/BLUE/RED): ");
			Color color = Color.valueOf(sc.next());
			if(ch == 'r') {
				System.out.print("Altura: ");
				Double altura = sc.nextDouble();
				System.out.print("Largura: ");
				Double largura = sc.nextDouble();
				formas.add(new Retangulo(color, altura, largura));
			}else if(ch == 'c') {
				System.out.print("Raio: ");
				Double raio = sc.nextDouble();
				formas.add(new Circulo(color, raio));
			}
		}
		
		System.out.println("Areas das formas:");
		
		for(Shape forma: formas) {
			System.out.println(String.format("%.2f", forma.area()));
		}
		
		
		sc.close();

	}

}
