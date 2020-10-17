package entities;

import entities.enums.Color;

public class Retangulo extends Shape{
	
	private Double altura;
	private Double largura;
	
	public Retangulo() {
		super();
	}
	

	public Retangulo(Color color, Double altura, Double largura) {
		super(color);
		this.altura = altura;
		this.largura = largura;
	}
	

	public Double getAltura() {
		return altura;
	}


	public void setAltura(Double altura) {
		this.altura = altura;
	}


	public Double getLargura() {
		return largura;
	}


	public void setLargura(Double largura) {
		this.largura = largura;
	}


	@Override
	public Double area() {		
		return altura*largura;
	}

}
