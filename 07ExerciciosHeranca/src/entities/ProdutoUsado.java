package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public final class ProdutoUsado extends Produto{
	
	private final static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private Date dataCompra;

	public ProdutoUsado(String nome, Double price, Date dataCompra) {
		super(nome, price);
		this.dataCompra = dataCompra;
	}
	
	@Override
	public final String toString() {
		return nome +"(used) $" + price + " (Data de compra: " + sdf.format(dataCompra) + ")";
	}

}
