package entities;

public class Retangulo {
	
	public double altura;
	public double largura;
	
	
	public double Area() {
		return altura*largura;
	}
	
	public double Perimetro() {
		return 2*altura + 2*largura;
	}
	
	public double Diagonal() {
		return Math.sqrt(Math.pow(altura, 2) + Math.pow(largura, 2));
	}

}
