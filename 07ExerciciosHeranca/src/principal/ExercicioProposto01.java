package principal;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Produto;
import entities.ProdutoImportado;
import entities.ProdutoUsado;

public class ExercicioProposto01 {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		/*
		 Fazer um programa para ler os dados de N
		produtos (N fornecido pelo usuário). Ao final,
		mostrar a etiqueta de preço de cada produto na
		mesma ordem em que foram digitados.
		Todo produto possui nome e preço. Produtos
		importados possuem uma taxa de alfândega, e
		produtos usados possuem data de fabricação.
		Estes dados específicos devem ser
		acrescentados na etiqueta de preço conforme
		exemplo (próxima página). Para produtos
		importados, a taxa e alfândega deve ser
		acrescentada ao preço final do produto.
		 */
		
		System.out.println("Entre como numero de produtos:");
		int n = sc.nextInt();
		
		List<Produto> produtos = new ArrayList<>();
		
		
		for(int i = 0; i < n; i++) {
			System.out.println("Dados do produto " + (i+1));
			System.out.println("Produto comum, usado ou importado (c/u/i)? ");
			char flag = sc.next().charAt(0);
			sc.nextLine();
			System.out.println("Nome:");
			String nome = sc.nextLine();
			System.out.println("Preço:");
			Double price = sc.nextDouble();
			if(flag == 'c') {
				produtos.add(new Produto(nome, price) );
			}else if(flag == 'u') {
				System.out.println("Data de compra (DD/MM/YYYY):");
				Date dataCompra = sdf.parse(sc.next());
				produtos.add(new ProdutoUsado(nome, price, dataCompra));
			}else {
				System.out.println("Cutoms free:");
				Double custonsFree = sc.nextDouble();
				produtos.add(new ProdutoImportado(nome, price, custonsFree) );
			}			
		}
		
		System.out.println("PRICE TAGS:");
		
		for(Produto list: produtos) {
			System.out.println(list);
		}
		
		
		sc.close();
	}

}
