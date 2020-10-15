package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enuns.OrderStatus;

public class Order {
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	private Date moment;
	private OrderStatus status;
	
	private Cliente cliente;
	private List<OrdemItem> itemPedido = new ArrayList<>();
	
	public Order(Date moment, OrderStatus status, Cliente cliente) {
		this.moment = moment;
		this.status = status;
		this.cliente = cliente;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<OrdemItem> getItemPedido() {
		return itemPedido;
	}

	public void addItemPedido(OrdemItem item) {
		itemPedido.add(item);
	}
	
	public void removeItemPedido(OrdemItem item) {
		itemPedido.remove(item);
	}
	
	public Double total() {
		Double total = 0.0;
		for(OrdemItem item: itemPedido) {
			total += item.subTotal();
		}
		return total;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("ORDER SUMMARY:");
		sb.append("\n");
		sb.append("ORDER MOMENT: ");
		sb.append(sdf.format(moment));
		sb.append("\n");
		sb.append("ORDER STATUS: ");
		sb.append(status);
		sb.append("\n");
		//informações do Cliente
		sb.append("Cliente: ");
		sb.append(cliente);
		sb.append("\n");		
		sb.append("Order Items: \n");		
		for(OrdemItem item: itemPedido) {
			sb.append(item);
			sb.append("\n");			
		}
		sb.append("Total Price: $");
		sb.append(total());
		sb.append("\n");

		return sb.toString();
		
	}

}
