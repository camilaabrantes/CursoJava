package entities;

public class Empregado {
	
	public String nome;
	public double salarioGrosso;
	public double tax;
	
	public double NetSalary() {
		return salarioGrosso - tax;		
	}
	
	public double IncreaseSalary(double porcentagem) {
		salarioGrosso *= (1 + porcentagem/100);
		return  NetSalary();		
	}
	
	public String toString() {
		return nome + ", $ " + String.format("%.2f", NetSalary());
	}

}
