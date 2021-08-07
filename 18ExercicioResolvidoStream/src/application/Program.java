package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		/*
		 Fazer um programa para ler um conjunto de produtos a partir de um
		arquivo em formato .csv (suponha que exista pelo menos um produto).
		Em seguida mostrar o preço médio dos produtos. Depois, mostrar os
		nomes, em ordem decrescente, dos produtos que possuem preço
		inferior ao preço médio.
		Veja exemplo na próxima página.
		 */
		
		Locale.setDefault(Locale.US);
		
		String path = "C:\\Users\\cliente\\Documents\\Cursos\\Java\\in.txt";
		
		List<Product> produtos = new ArrayList<>();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			String line = br.readLine();
			
			while(line != null) {
				String[] fields = line.split(",");
				produtos.add(new Product(fields[0], Double.parseDouble(fields[1])));				
				line = br.readLine();
			}
			
			double media = produtos.stream().map(p -> p.getPrice()).reduce(0.0,(x,y) -> x + y ) / produtos.size();
			
			System.out.printf("Media: %.2f %n", media);
			
			Comparator<String> comparador = (x,y) -> x.compareTo(y);
			
			List<String> nomesProdutos = produtos.stream().filter(p -> p.getPrice() < media).map(p -> p.getName()).sorted(comparador.reversed()).collect(Collectors.toList());
			
			nomesProdutos.forEach(System.out::println);
			
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

	}

}
