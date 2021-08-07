import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Contract;
import services.ContractService;
import services.PaypalService;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		/*
		 Uma empresa deseja automatizar o processamento de seus contratos. O processamento de
		um contrato consiste em gerar as parcelas a serem pagas para aquele contrato, com base no
		n�mero de meses desejado.
		A empresa utiliza um servi�o de pagamento online para realizar o pagamento das parcelas.
		Os servi�os de pagamento online tipicamente cobram um juro mensal, bem como uma taxa
		por pagamento. Por enquanto, o servi�o contratado pela empresa � o do Paypal, que aplica
		juros simples de 1% a cada parcela, mais uma taxa de pagamento de 2%.
		Fazer um programa para ler os dados de um contrato (n�mero do contrato, data do contrato,
		e valor total do contrato). Em seguida, o programa deve ler o n�mero de meses para
		parcelamento do contrato, e da� gerar os registros de parcelas a serem pagas (data e valor),
		sendo a primeira parcela a ser paga um m�s ap�s a data do contrato, a segunda parcela dois
		meses ap�s o contrato e assim por diante. Mostrar os dados das parcelas na tela.
		*/
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com os dados do contrato: ");
		System.out.print("Number: ");
		Integer number = sc.nextInt();
		sc.nextLine();
		System.out.print("Data (dd/mm/yyyy): ");
		Date date = sdf.parse(sc.nextLine());
		System.out.print("Valor do contrato: ");
		Double totalValue = sc.nextDouble();
		System.out.print("Entre com a quantidade de meses: ");
		Integer quantMeses = sc.nextInt();
		
		ContractService contract = new ContractService(new Contract(number, date, totalValue), new PaypalService());
		contract.processContract(quantMeses);
		
		sc.close();
	}

}
