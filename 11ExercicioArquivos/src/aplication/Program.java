package aplication;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Produto;

public class Program {
	
	public static void main(String[] args) {
		
		/*
		Fazer um programa para ler o caminho de um arquivo .csv
		contendo os dados de itens vendidos. Cada item possui um
		nome, preço unitário e quantidade, separados por vírgula. Você
		deve gerar um novo arquivo chamado "summary.csv", localizado
		em uma subpasta chamada "out" a partir da pasta original do
		arquivo de origem, contendo apenas o nome e o valor total para
		aquele item (preço unitário multiplicado pela quantidade),
		conforme exemplo.
		 */
		Locale.setDefault(Locale.US);
		
		Scanner sc = null;
		
		List<Produto> produtos = new ArrayList<>();
		
		String path = "C:\\Users\\cliente\\Documents\\Cursos\\Java";
		File fileLeitura = new File(path + "\\in.csv");
		boolean success = new File(path + "\\out").mkdir();
				
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path + "\\out\\summary.csv"))) {			
			sc = new Scanner(fileLeitura);

			while (sc.hasNextLine()) {				
				String linha = sc.nextLine();
				String[] vect = linha.split(",");
				produtos.add(new Produto(vect[0], Double.parseDouble(vect[1]), Integer.parseInt(vect[2])));
				}			
		
			for(Produto produto: produtos) {
				System.out.println(produto.getNome() + "," + produto.calculaSoma());
				bw.write(produto.getNome() + "," + String.format("%.2f", produto.calculaSoma()));
				bw.newLine();
			}						
		}
		catch (FileNotFoundException e) {
			System.out.println("Error 1: " + e.getMessage());
		}
		catch(IOException e) {
			System.out.println("Error 2: " + e.getMessage());
		}
		catch(Exception e) {
			e.printStackTrace();
		}

		sc.close();
		
		/*Outros Tópicos:
		• Formatar: toLowerCase(), toUpperCase(), trim()
		• Recortar: substring(inicio), substring(inicio, fim)
		• Substituir: Replace(char, char), Replace(string, string)
		• Buscar: IndexOf, LastIndexOf
		• str.Split(" ")
		*/
	}
}
