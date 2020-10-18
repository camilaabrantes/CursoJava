package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Reservation;
import entities.exception.DomainException;

public class ExercicioResolvido {

	public static void main(String[] args) {
		/*
		Fazer um programa para ler os dados de uma reserva de hotel (n�mero do quarto, data
		de entrada e data de sa�da) e mostrar os dados da reserva, inclusive sua dura��o em
		dias. Em seguida, ler novas datas de entrada e sa�da, atualizar a reserva, e mostrar
		novamente a reserva com os dados atualizados. O programa n�o deve aceitar dados
		inv�lidos para a reserva, conforme as seguintes regras:
		- Altera��es de reserva s� podem ocorrer para datas futuras
		- A data de sa�da deve ser maior que a data de entrada
		 */
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		try {
			System.out.print("Room Number: ");
			int number = sc.nextInt();
			System.out.print("Check In date (DD/MM/YYYY): ");
			Date checkIn = sdf.parse(sc.next());	
			System.out.print("Check Out date (DD/MM/YYYY): ");
			Date checkOut = sdf.parse(sc.next());	
			Reservation reserva = new Reservation(number, checkIn, checkOut);
			System.out.println(reserva);
			
			System.out.println("Entre com os dados de reserva atualizados:");
			System.out.print("Check In date (DD/MM/YYYY): ");
			checkIn = sdf.parse(sc.next());	
			System.out.print("Check Out date (DD/MM/YYYY): ");
			checkOut = sdf.parse(sc.next());	
			reserva.updateDate(checkIn, checkOut);
			System.out.println(reserva);
			
		}
		catch(ParseException e) {
			System.out.println("Formato de data invalido");
		}
		catch(DomainException e) {
			System.out.println(e.getMessage());
		}
		catch(RuntimeException e) {
			System.out.println("Erro n�o mapeado!");
		}
		
		
		sc.close();
	}

}
