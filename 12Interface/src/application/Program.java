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
