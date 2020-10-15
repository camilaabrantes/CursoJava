package entities;

public final class ProdutoImportado extends Produto{
	
	private Double custonsFree;

	public ProdutoImportado(String nome, Double price, Double custonsFree) {
		super(nome, price);
		this.custonsFree = custonsFree;
	}

	public Double getCustonsFree() {
		return custonsFree;
	}

	public void setCustonsFree(Double custonsFree) {
		this.custonsFree = custonsFree;
	}
	
	public Double totalPrice() {
		price += custonsFree;
		return price;
	}
	
	@Override
	public final String toString() {
		return nome +" $" + totalPrice() + " (Customs Free: $" + custonsFree + ")";
	}

}
