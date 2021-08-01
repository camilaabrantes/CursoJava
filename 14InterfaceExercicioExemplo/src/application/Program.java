package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import entities.Employee;

public class Program {
	public static void main(String[] args) {
		List<Employee> list = new ArrayList<>();
		String path = "C:\\Users\\cliente\\Documents\\Cursos\\Java\\Sistema-Xadrez\\in.csv";
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String linha = br.readLine();
			while (linha != null) {
				String[] fields = linha.split(",");
				list.add(new Employee(fields[0],Double.parseDouble(fields[1])));
				linha = br.readLine();
			}
			Collections.sort(list);
			for (Employee s : list) {
				System.out.println(s.getName() + ", " + s.getSalary());
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}