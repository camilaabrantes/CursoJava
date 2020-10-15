package principal;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Cliente;
import entities.OrdemItem;
import entities.Order;
import entities.Product;
import entities.enuns.OrderStatus;

public class ExercicioProposto {
	
	public static void main(String[] args) throws ParseException {
		
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		/*
		 Ler os dados de um pedido com N itens (N fornecido pelo usuário). Depois, mostrar um
		sumário do pedido conforme exemplo (próxima página). Nota: o instante do pedido deve ser
		o instante do sistema: new Date()
		 */
		
		System.out.println("Entre com os dados do cliente:");
		System.out.println("Nome: ");
		String nome = sc.nextLine();
		System.out.println("email:");
		String email = sc.next();
		System.out.println("Data de nascimento (DD/MM/YYYY):");
		Date dataNascimento = sdf.parse(sc.next());
		System.out.println("Entre com os dados do pedido");
		System.out.println("Status:");
		String status = sc.next();
		System.out.println("Quantos itens no pedido?");
		int n = sc.nextInt();
		

		Order ordem = new Order(new Date(), OrderStatus.valueOf(status), new Cliente(nome, email, dataNascimento));
		
		for(int i = 0; i < n; i++) {
			System.out.println("Entre com os dados do item " + (i+1));
			System.out.println("Nome do produto:");
			String nomeProduto = sc.next();
			System.out.println("Preço do produto:");
			Double price = sc.nextDouble();
			System.out.println("Quantidade:");
			Integer quantidade = sc.nextInt();			
			ordem.addItemPedido(new OrdemItem(quantidade, new Product(nomeProduto, price)));
		}
		
		System.out.println(ordem);	
		
		
		sc.close();

	}
	
}
