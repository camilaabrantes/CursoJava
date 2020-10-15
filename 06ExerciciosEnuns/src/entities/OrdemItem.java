package entities;

public class OrdemItem {
	
	private Integer quantity;
	
	private Product produto;

	public OrdemItem(Integer quantity, Product produto) {
		this.quantity = quantity;
		this.produto = produto;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}


	public Product getProduto() {
		return produto;
	}

	public void setProduto(Product produto) {
		this.produto = produto;
	}
	
	public Double subTotal() {
		return quantity*produto.getPrice();
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(produto);
		sb.append(", Quantidade: ");
		sb.append(quantity);
		sb.append(", Subtotal: ");
		sb.append(subTotal());
		
		return sb.toString();
	}
}
