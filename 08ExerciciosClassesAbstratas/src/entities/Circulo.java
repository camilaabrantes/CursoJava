package entities;

import entities.enums.Color;

public class Circulo extends Shape{

	private Double raio;
	
	public Circulo() {
		super();
	}
	
	public Circulo(Color color, Double raio) {
		super(color);
		this.raio = raio;
	}

	@Override
	public Double area() {
		return Math.PI * Math.pow(raio, 2);
	}

}
