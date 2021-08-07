package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

import entities.Produto;
import services.CalculationService;

public class Program2 {

	public static void main(String[] args) {
		
		/*
		 Uma empresa de consultoria deseja avaliar a performance de produtos,
		funcionários, dentre outras coisas. Um dos cálculos que ela precisa é encontrar
		o maior dentre um conjunto de elementos. Fazer um programa que leia um
		conjunto de produtos a partir de um arquivo, conforme exemplo, e depois
		mostre o mais caro deles.
		 */

		Locale.setDefault(Locale.US);
		
		List<Produto> list = new ArrayList<>();

		String path = "C:\\Users\\cliente\\Documents\\Cursos\\Java\\in.txt";

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String line = br.readLine();
			while (line != null) {
				String[] fields = line.split(",");
				list.add(new Produto(fields[0], Double.parseDouble(fields[1])));
				line = br.readLine();
			}
			
			Produto x = CalculationService.max(list);
			System.out.println("Most expensive:");
			System.out.println(x);
			
			//funciona pq a classe Produto implementa Comparable
			System.out.println("Testando: " + Collections.max(list));

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		} 
	}
}