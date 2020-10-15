package principal;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingAccount;

public class ExercicioResolvido01 {

	public static void main(String[] args) {
		// Banco

		/*
		 UPCASTING é quando um objeto do tipo da super classe recessebe declaração com construtor da sub clase
		 (que herda) - vc so pode chamar os metodos e variaveis da subclasse apenas se atribuir o objeto
		 ao tipo da subclasse novamente, dessa forma:
		 	Account acc10 = new BusinessAccount(1003, "Bob", 0.0, 200.0); --upcasting
		 	BusinessAccount acc6 = (BusinessAccount) acc10;
		 	acc6.loan(200.0);
		 	acc10.loan(200.0); --da erro pois objetos do tipo account não possuem esse metodo
		 	System.out.println(acc6.getLoanLimit());
		 	
		 DOWNCASTING é quando um objeto do tipo da subclasse recebe um objeto do tipo da superclasse
		 porem isso só pode ser feito se o objeto ja tiver sido declarado com o construtor da subclasse,
		 dessa forma:
		 Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
		 BusinessAccount acc4 = (BusinessAccount) acc2;
		 acc4 terá todos os metodos da subclasse BusinessAccount
		 
		 o DOWNCASTING não pode ser feito das seguintes formas:		 
		 BusinessAccount acc4 = new Account(1001, "Alex", 0.0); -- dá erro, ão pode ser feito	
		 
		 nem assim:
		 Account acc = new Account(1001, "Alex", 0.0);
		 BusinessAccount acc4 = (BusinessAccount) acc;
		 
		 para não ter erros na execução do programa use o instaceof para verificar se oobjeto é instacia da subclasse
		 */
		Account acc = new Account(1001, "Alex", 0.0);
		BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);
		// UPCASTING
		Account acc1 = bacc;
		Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
		Account acc3 = new SavingAccount(1004, "Anna", 0.0, 0.01);
		// DOWNCASTING
		BusinessAccount acc4 = (BusinessAccount) acc2;
		acc4.loan(100.0);
		// BusinessAccount acc5 = (BusinessAccount)acc3; - da erro pq acc3 n é instacia de BusinessAccount
		if (acc3 instanceof BusinessAccount) { //verifica se acc3 foi instaciado com o contrutor BusinessAccount
			BusinessAccount acc5 = (BusinessAccount) acc3;
			acc5.loan(200.0);
			System.out.println("Loan!");
		}
		if (acc3 instanceof SavingAccount) {
			SavingAccount acc5 = (SavingAccount) acc3;
			acc5.updateBalance();
			System.out.println("Update!");
		}
		

	}

}
