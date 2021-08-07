package application;

import java.util.HashSet;
import java.util.Set;

import entities.Produto;

public class ProgramSet {

	public static void main(String[] args) {

		Set<Produto> set = new HashSet<>();

		set.add(new Produto("TV", 900.0));
		set.add(new Produto("Notebook", 1200.0));
		set.add(new Produto("Tablet", 400.0));
		
		set.add(new Produto("TV", 1000.0));
		
		System.out.println(set.contains(new Produto("TV", 1000.0)));
		
		for (Produto p : set) {
			System.out.println(p);
		}

	}

}
