package personal;

public class Empregado {
	
	private int id;
	private String nome;
	private double salario;
	
	
	public Empregado(int id, String nome, double salario) {
		this.id = id;
		this.nome = nome;
		this.salario = salario;
	}


	public int getId() {
		return id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public double getSalario() {
		return salario;
	}


	public void increaseSalario(double aumento) {
		salario *= (1 + aumento/100);
	}
	
	public String toString() {
		return id + ", " + nome + ", " + salario;
	}	

}
