package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.CarRental;
import entities.Vehicle;
import services.BrazilTaxService;
import services.RentalService;

public class Program {

	public static void main(String[] args) throws ParseException{
		
		/*
		 Uma locadora brasileira de carros cobra um valor por hora para loca��es de at�
		12 horas. Por�m, se a dura��o da loca��o ultrapassar 12 horas, a loca��o ser�
		cobrada com base em um valor di�rio. Al�m do valor da loca��o, � acrescido no
		pre�o o valor do imposto conforme regras do pa�s que, no caso do Brasil, � 20%
		para valores at� 100.00, ou 15% para valores acima de 100.00. Fazer um
		programa que l� os dados da loca��o (modelo do carro, instante inicial e final da
		loca��o), bem como o valor por hora e o valor di�rio de loca��o. O programa
		deve ent�o gerar a nota de pagamento (contendo valor da loca��o, valor do
		imposto e valor total do pagamento) e informar os dados na tela. Veja os
		exemplos.
		 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy HH:mm");
		
		System.out.println("Entre com os dados do aluguel: ");
		System.out.print("Modelo do Carro: ");
		String model = sc.nextLine();
		System.out.print("Pickup (dd/mm/yyyy hh:mm): ");
		Date start = sdf.parse(sc.nextLine());
		System.out.print("Retorno (dd/mm/yyyy hh:mm): ");
		Date finish = sdf.parse(sc.nextLine());
		
		System.out.print("Entre com o preco por hora: ");
		Double pricePerHour = sc.nextDouble();
		System.out.print("Entre com o preco por dia: ");
		Double pricePerDay = sc.nextDouble();
		
		CarRental carRental = new CarRental(start, finish, new Vehicle(model));
		RentalService rentalService = new RentalService(pricePerHour, pricePerDay, new BrazilTaxService());
		rentalService.processInvoice(carRental);
		
		System.out.println(carRental);
		sc.close();

	}

}
