package entities;

public class Product {
	
	private String nome;
	private Double price;
	
	
	public Product(String nome, Double price) {
		this.nome = nome;
		this.price = price;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public Double getPrice() {
		return price;
	}


	public void setPrice(Double price) {
		this.price = price;
	}
	
	public String toString() {
		return nome + ", $" + price;
	}
}
