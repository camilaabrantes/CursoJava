package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		/*
		 Fazer um programa para ler os dados (nome, email e sal�rio)
		de funcion�rios a partir de um arquivo em formato .csv.
		Em seguida mostrar, em ordem alfab�tica, o email dos
		funcion�rios cujo sal�rio seja superior a um dado valor
		fornecido pelo usu�rio.
		Mostrar tamb�m a soma dos sal�rios dos funcion�rios cujo
		nome come�a com a letra 'M'.
		Veja exemplo na pr�xima p�gina.
		 */
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		String path = "C:\\Users\\cliente\\Documents\\Cursos\\Java\\in.txt";
		
		System.out.print("Entre com o salario: ");
		Double salary = sc.nextDouble();
		
		List<Employee> empregados = new ArrayList<>();
		
		try(BufferedReader br = new BufferedReader( new FileReader(path))){
			
			String line = br.readLine();
			while(line != null) {
				String[] fields = line.split(",");
				empregados.add(new Employee(fields[0], fields[1], Double.parseDouble(fields[2])));
				line = br.readLine();
			}
			
			List<String> emails = empregados.stream().filter(p -> p.getSalary() > salary).map(p -> p.getEmail()).sorted().collect(Collectors.toList());
			
			Double somaSalary = empregados.stream().filter(p -> p.getName().charAt(0) == 'M').map(p -> p.getSalary()).reduce(0.0, (x,y) -> x + y);
			
			System.out.println("Emails dos funcionarios com salario maior que " + salary);
			emails.forEach(System.out::println);
			
			System.out.println("Soma do salario dos funcionarios que comecam com a letra 'M': " + somaSalary);
			
		}
		catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
	sc.close();
	}

}
