package entities;

import java.util.ArrayList;
import java.util.List;

public class PrintService<T> {
	
	List<T> list = new ArrayList<>();
	
	public void addValue(T value) {
		list.add(value);
	}
	
	public T firt() {
		return list.get(0);
	}
	
	public void print() {
		System.out.print("[ ");
		if(list !=  null) {
			System.out.print(list.get(0));
		}
		for(int i=1; i<list.size(); i++) {
			System.out.print(", "  + list.get(i));
		}
		System.out.print(" ]");
	}

}
