package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Program {

	public static void main(String[] args) {
		/*
		 *  Na contagem de votos de uma eleição, são gerados vários registros
		 *	de votação contendo o nome do candidato e a quantidade de votos
		 *	(formato .csv) que ele obteve em uma urna de votação. Você deve
		 *	fazer um programa para ler os registros de votação a partir de um
		 *	arquivo, e daí gerar um relatório consolidado com os totais de cada
		 *	candidato.
		 */
		
		String path = "C:\\Users\\cliente\\Documents\\Cursos\\Java\\in.txt";
		Map<String, Integer> cadidatos = new HashMap<>();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			String line = br.readLine();
			while(line != null) {
				String[] fields = line.split(",");
				int votos = Integer.parseInt(fields[1]);
				if(cadidatos.containsKey(fields[0])) {
					votos+=cadidatos.get(fields[0]);
				}				
				cadidatos.put(fields[0], votos);
				
				line = br.readLine();
			}
			
			for(String candidato: cadidatos.keySet()) {
				System.out.println(candidato + ": " + cadidatos.get(candidato));
			}
						

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

	}

}
