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
		 Uma locadora brasileira de carros cobra um valor por hora para locações de até
		12 horas. Porém, se a duração da locação ultrapassar 12 horas, a locação será
		cobrada com base em um valor diário. Além do valor da locação, é acrescido no
		preço o valor do imposto conforme regras do país que, no caso do Brasil, é 20%
		para valores até 100.00, ou 15% para valores acima de 100.00. Fazer um
		programa que lê os dados da locação (modelo do carro, instante inicial e final da
		locação), bem como o valor por hora e o valor diário de locação. O programa
		deve então gerar a nota de pagamento (contendo valor da locação, valor do
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
